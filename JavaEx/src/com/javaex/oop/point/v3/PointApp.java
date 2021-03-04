package com.javaex.oop.point.v3;

public class PointApp {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.setX(5);
		p1.setY(10);
		p1.draw();
		p1.draw(false);		// 오버로딩 된 메서드를 호출
		
		Point p2 = new Point();		// 사용자 정의 생성자
//		p2.setX(15);
//		p2.setY(30);
		p2.draw();
		p2.draw(false);
		

	}

}
