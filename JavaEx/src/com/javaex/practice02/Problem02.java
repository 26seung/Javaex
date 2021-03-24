package com.javaex.practice02;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/////////////////////////////////////////
		int[] array = new int[5];
		double average = 0.0;
		int sum = 0;
		////////////////////////////////////////		
		
		for (int i = 0; i < array.length; i++)		// 왜 안되는지 이해가 안된다    ( <= 쓰면 안되고, < 쓰면 됨)
//		for (int i: array)
		{
			System.out.print("값을 입력하세요 : ");
			array[i] = scanner.nextInt();
			sum += array[i];
		}
		////////////////////////////////////////
		average = sum / array.length;
		System.out.println("총 합계 값은 : " + sum + "입니다.");
		System.out.println("총 평균 값은 : " + average + "입니다.");
		scanner.close();
	}

}
