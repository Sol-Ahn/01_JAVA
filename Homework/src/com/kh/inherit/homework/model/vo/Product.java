package com.kh.inherit.homework.model.vo;

public class Product {
	private String pName;
	private int price;
	
	public Product() {}

	public Product(String pName, int price) {
		super();
		this.pName = pName;
		this.price = price;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String selectField() {
		return pName + " / " + price;
	}
	
}
