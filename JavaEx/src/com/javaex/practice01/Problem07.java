package com.javaex.practice01;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			while (true) {
			
			// 랜덤값 설정////////////////////////////
			int nb = (int) (Math.random()*100)+1;			// 안에다 생성해야 새로운 게임시
			System.out.println(nb);							// 새로운 숫자로 게임 가능
			//////////////////////////////////////
			
			System.out.println("====================================");
			System.out.println("         [숫자 맞추기 게임 시작]         ");
			System.out.println("====================================");
			
			
			while (true) {
				System.out.println(">>" );
				int answer = sc.nextInt();
				
				// 정답 체크//////////////////////////////////////
				if (answer == nb) {
					System.out.println("정답입니다.");
					break;
				}
				else if (answer < nb) {
					System.out.println("더 높게");
				}
				else {
					System.out.println("더 낮게");
			}
				////////////////////////////////////////////////
		}
			System.out.println("게임을 종료하시겠습니까? (y/n) >>");
			String retry = sc.next();
			if(retry.equals("y")) {			// == 표현시 에러?
				break;
			}
			
			
		}sc.close();
		System.out.println("====================================");
		System.out.println("         [숫자 맞추기 게임 종료]         ");
		System.out.println("====================================");
		
	}

}

	