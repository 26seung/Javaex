package com.javaex.jdbx;

import java.sql.*;			//	sql 패키지 내의 모든 클래스 임포트

public class ConnectionTest {
	
	private static String DBURL = "jdbc:oracle:thin:@220.85.164.169:1521:xe";
	private static String DBUSER = "hr";			// 접속계정
	private static String DBPASS = "hr";			// 접속 암호
	
	public static void main(String[] args) {
		
		// 1. 드라이버 로드
		// 2. 커넥션 확보
		Connection conn = null;
		
		try {
			// . 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// . 커넥션 확보
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
			System.out.println("접속정보: " + conn);
			System.out.println("연결성공");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패");
		} catch (SQLException e) { 
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
