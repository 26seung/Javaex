package com.javaex.oop.point.v3;

// v3.메서드 오버로딩,
//		같은 이름을 가졌지만, 매개 변수의 타입과 순서와 갯수만 다른 메서드
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
	public void draw(boolean show) {
		String message = String.format("점[x=%d,y=%d]를 ",x,y);
		if (show) { // true
			message += "그렸습니다.";					
		}else {
			message += "지웠습니다.";
		}
		System.out.println(message);
	}
}
