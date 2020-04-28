package com.kh.object.chap05_initblock.model.vo;

public class Product {
	
	private String pName; // 상품명
	private int price;   // 가격
	
	{ // 인스턴스 초기화 블록
		// 인스턴스 변수(멤버 변수)를 객체 생성 시마다 한 번에 초기화 하는 용도
		pName = "갤럭시Z플립";
		price = 1200000;
	}
	
	public String selectProduct() {
		return pName + " / " + price;
			
	}
	
	
	
	// getter / setter
	
	
	
	
	
}
