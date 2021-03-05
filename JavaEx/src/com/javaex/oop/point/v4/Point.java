package com.javaex.oop.point.v4;

// v4. 상속
public class Point {

	// 필드
	// 
	protected int x;
	protected int y;
	
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
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
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