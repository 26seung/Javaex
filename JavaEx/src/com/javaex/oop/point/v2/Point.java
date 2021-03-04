package com.javaex.oop.point.v2;

// v1.필드 은닉, getter/setter , 출력 메서드
public class Point {

	// 필드
	private int x;
	private int y;
	
	// getter / setter
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
//	public Point(int x, int y) {
//		super();
//		this.x = x;
//		this.y = y;
//	}
	
	// 출력 메서드
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다. %n",x,y);
	}
	
}
