package com.javaex.practice02;

public class Problem03_1 {

	public static void main(String[] args) {
		
		char c [] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		
		System.out.println(c);
		
		for(int i = 0; i < c.length; i++) {
			if(c[i] == ' ') c[i]=',';
		}
		
		for(char chr : c) {
			System.out.print(chr);
		}
		System.out.println();
	}

}
