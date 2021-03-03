package com.javaex.practice01;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
	
		int max = 0;
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입럭하세요 : ");
		for (int i = 1; i <=5; i++) {
			System.out.print("숫자 : ");
			int num = scanner.nextInt();
			
			if (num > max)max = num;
//			if (i ==1 || num > max) max = num;		// 이게 맞는 코드
		}
		System.out.println("최대값은" + max + "입니다");
			
		scanner.close();
	}

}


