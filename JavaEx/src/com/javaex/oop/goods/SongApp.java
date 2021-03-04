package com.javaex.oop.goods;

public class SongApp {

	public static void main(String[] args) {
		
		Song a = new Song("좋은날","아이유","REAL","이민수",2010,3);
		Song b = new Song("거짓말","BIGBANG","ALWAYS","G-DRAGON",2007,2);
		Song c = new Song("벚꽃엔딩","버스커버스커","버스커버스커1집","장범준",2012,4);
		
		/////////////////////////////////////////////
		a.showInfo();
		b.showInfo();
		c.showInfo();
		

	}

}
