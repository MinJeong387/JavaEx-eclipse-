package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HRSearchEmployeesPstmt {

	static final String dburl = "jdbc:mysql://localhost:3306/hrdb"; // 순서 : 프토토콜(DB 종류에 따름) -> 나의위치 -> 포트번호 -> 스키마 !!
	static final String dbuser = "test_user";
	static final String dbpass = "test";

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);

			System.out.print("검색어 입력:");
			String keyword = scanner.next();

			// 실행 계획 수립
			String sql = "SELECT CONCAT(first_name,' ',last_name) full_name, "
					+ " email, phone_number, hire_date FROM employees " + " WHERE UPPER(first_name) LIKE ? OR "
					+ " UPPER(last_name) LIKE ?";
			// 데이터 바인딩 위치를 ?로 설정, 동적으로 데이터를 연결 시킴
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + keyword.toUpperCase() + "%");
			pstmt.setString(2, "%" + keyword.toUpperCase() + "%");

			rs = pstmt.executeQuery(); // 쿼리수행한다. 여기서는 따로 전달해 주지 않아도 됨

			while (rs.next()) {
				System.out.printf("%s: %s, %s, %s%n", rs.getString("full_name"), rs.getString("email"), rs.getString(3),
						rs.getString(4));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {	}
		}
		scanner.close();
	}
}
