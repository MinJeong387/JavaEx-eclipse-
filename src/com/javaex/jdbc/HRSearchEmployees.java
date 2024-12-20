package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HRSearchEmployees {

	static final String dburl = "jdbc:mysql://localhost:3306/hrdb"; // 순서 : 프토토콜(DB 종류에 따름) -> 나의위치 -> 포트번호 -> 스키마 !!
	static final String dbuser = "test_user";
	static final String dbpass = "test";

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);

			System.out.print("검색어 입력:");
			String keyword = scanner.next();

			String sql = "SELECT " + "CONCAT(first_name,' ', last_name) full_name, email, phone_number, hire_date "
					+ "FROM employees " + "WHERE UPPER(first_name) LIKE '%" + keyword.toUpperCase() + "%' "
					+ "OR UPPER(last_name) LIKE '%" + keyword.toUpperCase() + "%'"; // 개행문자는 공백으로 바꿔줌 !

			System.out.println("QUERY:" + sql);
			
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String fullName = rs.getString(1);
				String email = rs.getString(2);
				String phoneNumber = rs.getString("phone_number");
				String hireDate = rs.getString("hire_date");

				System.out.printf("%s : %s, %s, %s%n", fullName, email, phoneNumber, hireDate);
			}
			
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)	rs.close();
				if (stmt != null) stmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {	}
		}
		scanner.close();
	}
}
