package com.javaex.oop.goods.v4;

//	v4. this : 객체 자신을 의미
public class Goods {
	//	필드
	//	public > protected > default > private
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 코드 내에 생성자가 하나도 없으면 컴파일러가 기본 생성자를 추가
	// 		사용자 정의 생성자가 있으면 기본 생성자를 추가하지 않는다
	// 생성자 1
	
	public Goods(String name) {
		this.name = name;
	}
	// 모든 필드를 초기화 하는 생성자 : 생성자 2
	public Goods(String name, int price) {
		// 내부에 있는 다른 생성자
		this(name);
		this.price = price;
	}
	public void showInfo() {
		System.out.printf("상품 이름:%s%n가격: %d원%n", name, price);
	}
}