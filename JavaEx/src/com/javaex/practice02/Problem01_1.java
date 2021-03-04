package com.javaex.practice02;

public class Problem01_1 {

	public static void main(String[] args) {

		int[] data = {1,3,5,8,9,11,15,19,18,20,30,33,31};
		
		int sum = 0;
		int count = 0;
		
		for (int num : data) {
			if (num % 3 == 0) {
				sum += num;
				count ++;
			}
		}
		
		
		
		System.out.println("주어진 배열에서 3의 배수의 개수 => " + count);
		System.out.println("주어진 배열에서 3의 배수의 합 => " + sum);

	}

}
