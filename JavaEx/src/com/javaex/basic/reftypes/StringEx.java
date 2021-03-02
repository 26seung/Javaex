package com.javaex.basic.reftypes;

public class StringEx {

	public static void main(String[] args) {
//		stringTest();
		stringFormatEx();
	}
		
	private static void stringFormatEx() {
		// %s 문자열 , %d 10진 함수 , %n 개행
		//  _개의 _중에 _개를 먹었다.
		String fluit = "사과";
		int total = 10;
		int eat = 3;
		
		System.out.println(total + "개의" + fluit +"중에서" + eat + "개를 먹었다.");
		
		// -> formatting
		System.out.printf("%d개의 %s중에서 %d개를 먹었다.%n",total, fluit, eat);
		
		String fmt = "%d개의 %s중에서 %d개를 먹었다%n";	// 템플릿을 미리 만들어주고
		System.out.printf(fmt, total,fluit,eat);
		System.out.printf(fmt, 5, "오렌지", 2);
		
		// %f (실수), %%(%)
		// 현재 이자율은 1.25%입니다.
		System.out.printf("현재 이자율은 %f입니다.%n",1.25);
		fmt = "현재 이자율은 %.2f%%입니다.%n";	// %.2f -> 소수점 2째 자리까지 표기(부가정보)
		System.out.printf(fmt, 1.25f);
	}
	
		private static void stringTest() {
			
			String str;
			str = "JAVA";
			System.out.println("str : " + str);
			String str2 = "JAVA";
			System.out.println("str2 : " + str2);
			String str3 = new String("JAVA");	// 	새 객체 생성
			System.out.println("str2 : " + str3);	
			
			//  세 변수는 모두 JAVA라는 문자열을 담고 있다.
			System.out.println("str == str2 ? " + (str == str2));	// 같은 주소임
			System.out.println("str == str3 ? " + (str == str3));	// 다른 주소임
			
			// 참조 타입의 ==, != -> 두 객체의 주소 비교
			// 값의 비굑 .equals() 메서드를 사용
			System.out.println("str과 str2 내용이 같은가? " + str.equals(str2));
			System.out.println("str과 str3 내용이 같은가? " + str.equals(str3));
			
			//
			
		}

	

}
