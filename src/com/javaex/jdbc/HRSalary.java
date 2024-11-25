package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HRSalary {

	static final String dburl = "jdbc:mysql://localhost:3306/hrdb"; // 순서 : 프토토콜(db종류에 따름) -> 나의위치 -> 포트번호 -> 스키마
	static final String dbuser = "test_user";
	static final String dbpass = "test";

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		Scanner scanner = new Scanner(System.in);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);

			System.out.print("사이의 값을 원하는 두 정수 입력:");
			int keyword1 = scanner.nextInt();
			int keyword2 = scanner.nextInt();

			String sql = "SELECT CONCAT(first_name,' ', last_name) full_name, salary FROM employees WHERE "
					+ " ? <=salary AND salary<= ? " + "ORDER BY salary";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, keyword1);
			pstmt.setInt(2, keyword2);

			rs = pstmt.executeQuery();

			System.out.println("=============================================");
			while (rs.next()) {
				System.out.printf("%s\t\t%d%n", rs.getString("full_name"), rs.getInt("salary"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {

			}

		}
		scanner.close();
	}

}