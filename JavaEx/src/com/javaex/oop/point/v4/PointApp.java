package com.javaex.oop.point.v4;

public class PointApp {

	public static void main(String[] args) {
		Point p1 = new Point(5,10);
		
		p1.draw();
		p1.draw(false);		// 오버로딩 된 메서드를 호출
		
		Point p2 = new Point(15,30);		// 사용자 정의 생성자

		p2.draw();
		p2.draw(false);
		
		ColorPoint cp = new ColorPoint(20,40,"검정");
		cp.draw();
		cp.draw();

	}

}
