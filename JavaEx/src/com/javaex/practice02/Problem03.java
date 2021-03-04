package com.javaex.practice02;

public class Problem03 {

	public static void main(String[] args) {
		
		char c [] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		
		System.out.println(c);
		
		String str = String.valueOf(c);
		System.out.println(str.getClass().getName());		// 왜 string 변환이 안되는거지?
		str = str.replace(" ",",");
		System.out.println(str);
		
	}

}
