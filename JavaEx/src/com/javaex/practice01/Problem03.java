package com.javaex.practice01;

public class Problem03 {

	public static void main(String[] args) {
	Practice03();
	}
	
	private static void Practice03() {
	
		for(int num = 1 ; num <= 9; num++) {
//			System.out.print(dan+"단");
			for(int dan = 2 ; dan <= 9; dan++) {
				System.out.print(dan + "*" +num+ "=" +(dan*num));
		
	}
			System.out.println();
	}

}
}