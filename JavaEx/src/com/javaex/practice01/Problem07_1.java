package com.javaex.practice01;

import java.util.Scanner;

public class Problem07_1 {

	public static void main(String[] args) {
		
//	int answer = (int)(Math.random() * 100) ;
//	System.out.println(answer);
		
	Scanner scanner = new Scanner(System.in);
	System.out.print("값을 입력하세요 : ");
	int num = scanner.nextInt();
	
	// 바깥쪽 루프
	while(true) {
		// 게임 로직
		num = (int)(Math.random() * 100) + 1 ;
		System.out.println("==============");
		System.out.println(" 게임을 시작합니다.");
		System.out.println("==============");
		
		while(true) {
			System.out.print(num + ">>");
			int inputNum = scanner.nextInt();
			// num 과 inputnum 을 비교 -> 정답체크
			if (inputNum == num) {
				System.out.println("정답입니다.");
				break;
			} else if (inputNum < num) {
				System.out.println("더 높게");
			} else {
				System.out.println("더 낮게");}
		}
		
		System.out.println("게임을 종료 하시겠습니까? (y / n) >>");
		String retry = scanner.next();	// 더 진행 할 것 인지를 물어봄
		
		if (retry.equals("y")) {
			break;
		}
		
	}
	
//	if (num == answer) {
//		System.out.println("정답입니다.");
//	}else if (num < answer){
//		System.out.println("오답입니다. 더 높게"); 
//	}else {
//		System.out.println("오답입니다. 더 낮게"); 
//	}
	
	}
}
