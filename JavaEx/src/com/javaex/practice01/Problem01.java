package com.javaex.practice01;

public class Problem01 {

	public static void main(String[] args) {
		// 문제 1 에서 100 까지의 수에서 5의 배수 이면서 7의 배수인 수를 출럭하시오
		Problem01();
	}
	private static void Problem01() {
			
//		int i = 1;
//		while (true) {
		
		for (int i=1; i <= 100 ; i++) {
			if (i % 35 == 0 ) {
			System.out.println(i);
		}
		}
	
		} 
	
	}
//}


