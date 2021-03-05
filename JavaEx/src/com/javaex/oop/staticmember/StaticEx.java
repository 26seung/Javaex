package com.javaex.oop.staticmember;

public class StaticEx {
	// 클래스 변수 (static변수)
	//   		: 모든 인스턴스에서 공유
	// 			:static -> instance (x)전근 불가능
	//			: instance -? static (o) 접근 가능
	
	public static int refCount;
	public static String classVar;
	// 인스턴스 변수
	//		: 개별 객체 내부에서만 접근
	public String instancevar;
	
	//		static 영역 초기화는 static 블록에서
	// 		클래스가 로드 될때 단 한번 만 실행
	static {
		refCount = 0;
		classVar = "클래스 변수";
		System.out.println(" => Static Block");
//		instanceVar = "인스턴스 변수";		// static -> instance 접근 불가
}
	// 생성자
	public StaticEx() {
		refCount++;		// instance -> static (o)
		System.out.println("=> Instance 생성");
		System.out.println("=> 참조 Count:" + refCount);
	}
	
	// 소멸자		finalize + (ctrl + space)
	@Override
	protected void finalize() throws Throwable {
		refCount--;
		super.finalize();
	}
	
}