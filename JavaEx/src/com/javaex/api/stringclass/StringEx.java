package com.javaex.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
//		stringBasic();
		usefulMethods();
		
	}
	private static void usefulMethods() {
	// String 다양한 메서드들
		String source = "Java Programming, JavaScript Programming";
		System.out.println("원본 : " + source);										// 원본 : Java Programming, JavaScript Programming
		
		// 인덱스 접근
		System.out.println("length : " +source.length());							// length : 40
		System.out.println("5번 인덱스의 글자 : " + source.charAt(5));					//5번 인덱스의 글자 : P
		
		// 변환 메서드
		System.out.println("모두 소문자 : " + source.toLowerCase());					// 모두 소문자 : java programming, javascript programming
		System.out.println("모두 대문자 : " + source.toUpperCase());					// 모두 대문자 : JAVA PROGRAMMING, JAVASCRIPT PROGRAMMING
		
		// 검색 메서드 ((중요))
		int index = 0;
		index = source.indexOf("Java");
		System.out.println("1st search : " + index);								// 1st search : 0
		
		index += "Java".length();
		index = source.indexOf("Java",index); // 검색 인덱스 시작
		System.out.println("2st search : " + index);								// 2st search : 18
		index = source.indexOf("Java",index + "Java".length());
		System.out.println("3st search : " + index);								// 3st search : -1
		
		index = source.lastIndexOf("Java");
		System.out.println("역방향 검색 : " + index);									// 역방향 검색 : 18
		
		// 추출
		System.out.println("18번 인덱스 ~: " + source.substring(18));					// 18번 인덱스 ~: JavaScript Programming		// 끝까지
		System.out.println("18 ~ 22 : " + source.substring(18,22));					// 18 ~ 22 : Java
		
		// 치환 메서드
		System.out.println("Replace : " + source.replace("Java","python"));			// Replace : python Programming, pythonScript Programming
		
		// 변환, 치환, 추출, 메서드를 수행해도 원본이 변경되지는 않는다.
		System.out.println("원본 : " + source);	// String 불변 객체 (immutable) 		// 원본 : Java Programming, JavaScript Programming      
		
		// whitespace 제거
		String str = "            Hello      ";										
		System.out.println("str : " + str);											// str :             Hello    
		System.out.println("trim: [" + str.trim() +"]");							// trim: [Hello]
		
		// 문자열 분절
		String words[] = source.split(" ");		// 공백을 기준으로 문자열 문리 -> 배열
		
		for (String data: words) {
			System.out.println("chunk : ." + data);									// chunk : .Javachunk : .Programming,chunk : .JavaScriptchunk : .Programming-1
		}
		
		// 문자열의 비교 : 
		System.out.println("ABC".compareTo("ABD"));									// -1
		System.out.println("ABC".compareTo("ABC"));									// 0
	}
	
	private static void stringBasic() {
		String s1 = "Java";
		String s2= new String("Java");
		String s3 = "Java";
		
		System.out.println("s1 , s2 는 같은 객체인가? " + (s1 == s2));
		System.out.println("s1 , s3 는 같은 객체인가? " + (s1 == s3));
	
		// String 은 char 의 집합이다.
		char letters[] = {'3','a','v','a'};
		String s4 = new String(letters);
		
		System.out.println("s4 = " +s4);
		
		// valueof 메서드 -> 기본 타입을 문자열로 변환
		String s5 = String.valueOf(3.14159f);
		System.out.println("s5 = " + s5);
		
	}

}
