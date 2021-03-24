package com.javaex.practice01;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int balance = 0;
		int deposit = 0;
		boolean run = true;
		
		while (true) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			
//			int menu = sc.nextInt();
		
								
			
			while(true) {
				System.out.println("선택> ");
				int answer = sc.nextInt();
//				
				if (answer == 1) {
					System.out.println("예금액> ");
					deposit = sc.nextInt();
					balance += deposit;
					
				}
				else if (answer == 2) {
					System.out.println("출금액> ");
					deposit = sc.nextInt();
					balance -= deposit;
					
				}
				else if (answer == 3) {
					System.out.println("잔고액> "+ balance);
				}
				else if (answer == 4) {
					System.out.println("프로그램 종료");
					break;
				}
				else {
					System.out.println("다시 입력해 주세요");
				}
				
				
			}

				break;

			
		}

	}

}
