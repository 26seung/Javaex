package com.javaex.oop.goods.v3;

//	v3. 생성자
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
	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public void showInfo() {
		System.out.printf("상품 이름:%s%n가격: %d원%n", name, price);
	}
}