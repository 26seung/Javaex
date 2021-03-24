package com.javaex.jdbx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HRSearchEmployees {

	public static void main(String[] args) {
		
		String dburl = "jdbc:oracle:thin:@220.85.164.169:1521:xe";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "hr", "hr");
			
			System.out.print("search: ");
			String keyword = sc.next();
			
			// SQL
			String sql = "SELECT first_name, last_name, email, phone_number, hire_date "
					+ "FROM employees "
					+ "WHERE lower(first_name) LIKE '%" + keyword + "%' OR "
							+ "lower(last_name) LIKE '%"
							+ keyword + "%'";
			System.out.println("QUERY: " + sql);
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				System.out.printf("%s %s : %s, %s, %s%n", 
						rs.getString(1), rs.getString(2), 			// 이름
						rs.getString(2), 
						rs.getString("phone_number"), 
						rs.getString("hire_date"));
				}
			
			
		} catch (ClassNotFoundException e) {
			System.err.println("드라이브 로드 실패");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();}
		}
			sc.close();
	}

}
