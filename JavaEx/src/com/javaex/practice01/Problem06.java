package com.javaex.practice01;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		
		int val1 = 0;
		int val2 = 0;				
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		
//		System.out.println("입력한 숫자는 " + num + " 입니다.");
		
		int startNum = (num % 2 == 0) ? 2:1;		// 선생님 풀이
		int sum = 0;
		
		for (int i = startNum; i <= num; i += 2) {
			sum += i;
			}
		System.out.println("결과 :" + sum);
		scanner.close();
		
		
//		for( int i = 0; i <= num; i++) {			// if 문 도 해결해 보자.
//			if (num %2 ==0) {
//				val1 += i;
//				System.out.printf("결과값은 짝수의 합 : %d ",val1);
//		} else {
//				val2 += i;
//				System.out.printf("결과값은 홀수의 합 : %d ",val2);
//		}
//	}

	}

}
