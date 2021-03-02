package com.javaex.practice01;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		Practice02();
	}
	
	private static void Practice02() {
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");	
		int val = scanner.nextInt();
		
//		int rowCount = 9;
		for(int row = 1; row <= val; row++) {
			for(int col =1; col <= row; col++) {
				System.out.print(val);
			}
			System.out.println();
		}
	}
		
	}

// 1~9 까지의 숫자 
