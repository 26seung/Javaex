package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String Filename = rootPath + "thieves.txt";
	
	
	public static void main(String[] args) {
		// main stream
		Reader reader = null;
		// suppot stream
		BufferedReader br = null;
		
		try {
			reader = new FileReader(Filename);
			br = new BufferedReader(reader);
			
			String line = null;
			
			while ((line = br.readLine()) != null) {
				// line 을 분절
				StringTokenizer st = new StringTokenizer(line,		//	분절시킬 문자열
														" " );		//  분절시킬 구분자 - 기본값 : 공백, \t, \r, \n
				
				while(st.hasMoreTokens()) {					// 뒤에 토큰이 더있는가
					String token = st.nextToken();		// 토큰을 받아오고 다음으로 이동
					System.out.println(token + " ");
				}
				System.out.println();
			} 
		}	catch (FileNotFoundException e) {
				System.err.println(" 파일을 찾지 못하였어요");
				
			}	catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					br.close();
				}	catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}


