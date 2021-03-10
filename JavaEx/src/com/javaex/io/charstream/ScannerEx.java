package com.javaex.io.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String Filename = rootPath + "thieves.txt";
	
	
	public static void main(String[] args) {
		// Scanner 은 단순 키보드 입력을 받기 위한 클래스가 아님
		// 다양한 입력 소스로부터 데이터를 입력 받는 범용 클래스
		Scanner scanner = null;
		File F = new File(Filename);
		
		try {
			scanner = new Scanner(F);
			
			String name ; 
			float height;
			float weight;
			
			// 스캐너의 EOS 은 체크를 해주자
			while (scanner.hasNextLine()) {
				name = scanner.next();
				height = scanner.nextFloat();
				weight = scanner.nextFloat();
				
				System.out.printf("%s, 키:%f, 체중:%f%n" , name,height,weight);
				// 다음행으로 이동
				scanner.nextLine();
			
			}
			
		}	catch (FileNotFoundException e) {
			System.err.println("파일을 찾지 못함");
		}	finally {
			try { 
				scanner.close();
			}	catch (Exception e) {
				
			}
		}
		

	}

}
