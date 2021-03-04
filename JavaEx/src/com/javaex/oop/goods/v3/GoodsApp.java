package com.javaex.oop.goods.v3;

public class GoodsApp {

	public static void main(String[] args) {
//		Goods notebook = new Goods();
		Goods notebook = new Goods("LG Gram",1500000);
//		notebook.setName("LG Gram");
//		notebook.setPrice(1500000);
//			
		
//		Goods smartphone = new Goods();
		Goods smartphone = new Goods("iPhone SE",650000);
//		smartphone.setName = ("iPhone SE");
//		smartphone.setPrice = (650000);
		
		notebook.showInfo();
		
			
		
		System.out.printf("%s, %d원%n", 
				notebook.getName(), notebook.getPrice());
		notebook.showInfo();
		System.out.printf("%s, %d원%n",
				smartphone.getName(), smartphone.getPrice());
		smartphone.showInfo();

	}

}