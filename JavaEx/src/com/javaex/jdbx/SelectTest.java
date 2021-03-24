package com.javaex.jdbx;

import java.sql.*;

public class SelectTest {

	public static void main(String[] args) {
		
		String dburl = "jdbc:oracle:thin:@220.85.164.169:1521:xe";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "hr", "hr");
			stmt = conn.createStatement();
			
			// 실행할 쿼리 준비
			String sql = "SELECT department_id, department_name FROM departments";
			// 쿼리 실행
			rs = stmt.executeQuery(sql);
			
			// 레코드 출력
			rs.next();
			int deptId = rs.getInt(1);	// 컬럼의 순서는 1부터 시작
			String deptName = rs.getString("department_name");
			
			System.out.printf("%d:%s%n",deptId,deptName);
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
				e.printStackTrace();
			}
		}

	}

}
