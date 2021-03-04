package com.javaex.practice02;

import java.util.Scanner;

public class Problem02_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		///////////////////////////////////////////
		int array[] = new int[5];
		// 입력 + 저장
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
					
		}
		// 합산
		int total = 0;
		for (int num:array) {
			total += num;
		}
				
		double average = (double)total / array.length;
		System.out.println("총 합계 값은 : " + total + "평균 값은 : " + average + "입니다.");
		scanner.close();		
	}

}
