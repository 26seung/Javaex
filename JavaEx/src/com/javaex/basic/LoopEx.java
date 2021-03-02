package com.javaex.basic;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
//		whileEx01();
//		whileGugu();
//		doWhileEx();
//		inFLoop();
//		forGugu();
//		continueEx();
//		breakEx();
//		nestedFor();
//		nestedForStar();
		sixRandom();
	}
	
	private static void sixRandom() {
		// 1 부터 45 까지의 정수난수 6개를 출력
		for (int i = 1 ; i <= 6; i ++) {
			System.out.println((int)(Math.random()*45) + 1 );
		}
	}
	
	private static void nestedForStar() {
		int rowCount = 5;
		for(int row = 1 ;  row <= rowCount; row++) {
			for(int col =1 ; col <= row; col++ ) {
				System.out.print("*"); 					// ln 과 그냥의 차이가 무었인지? 
			}
			System.out.println(); 	// 개행
		}
	}
	
	private static void nestedFor() {
		// 2단 ~ 9단 까지의 구구표를 모두 출력
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println(dan+ "단");
			
			for (int num = 1; num <= 9; num++) {
				System.out.println(dan + "*" + num + "=" + (dan*num));
			}
		}
		
	}
	
	private static void breakEx() {
		// 6 의 배수이자 14 의 배수인 가장 적은 정수 찾기
		int i = 1;
		while(true) {
			if (i % 6 == 0 && i % 14 == 0) break;		// break 문을 만나면 루프를 탈출한다.
			i++;
		}
		System.out.println(i);
	}
	
	private static void continueEx() {
//		1 에서 20 까지의 수에서 2의 배수와 3의 배수의 수를 제외한 숫자를 출력하세요.
		for (int i = 1; i <= 20 ; i++) {
			if (i % 2 == 0 || i % 3 == 0) {continue;}
		System.out.println(i);
		}
	}
	
	private static void forGugu() {
	// 입력받은 단의 구구표 출력
		Scanner scanner = new Scanner(System.in);
				System.out.print("단을 입력하세요");
				int dan = scanner.nextInt();
				
				for (int i = 1; i <= 9; i++) {
					System.out.println(dan+ "*" + i + "=" + (dan*i));
				}
				scanner.close();
		
	}
	
	private static void inFLoop() {
		// while , do - while 일 경우 , 반복 조건은 개발자가 책임
//		반복조건이 true일 경우 무한 루프에 빠진다
//		특별한 경우가 아니라면 무한루프는 피하도록 하자
		while (true) {
			System.out.println("Ctrl+C to Quit or PRESS Terminate");
		}
	}
	
	private static void doWhileEx() {
//		최소 1최 반드시 실행되어야 하는 반복문
		int total = 0;
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		do { 
			System.out.print("정수를 입력하세요 [0 이면 종료] : ");
			num = scanner.nextInt();
			total += num;
			
		} while (num != 0);
		
		System.out.println("합산값 :" + total);
		scanner.close();
	}
	
	private static void whileGugu() {
//		단을 입력 -> 해당 단의 구구단을 출력
		Scanner scanner = new Scanner(System.in);
		int num = 1;
		System.out.print("단을 입력하세요 :");
		int dan = scanner.nextInt();
		
		while (num <= 9) {
			System.out.println(dan + "*" + num + "=" + (dan * num));
			num++;
		}
		scanner.close();
	}

		private static void whileEx01() {
			
			int i = 0;
			
			while(i <= 5) {
			System.out.println("I Like JAVA" + i);
			i = i + 1;
		}
	
	}
}
