package com.kh.homework.chap02.ex2.model.vo;

public abstract class AllinOnePrinter implements Printer, Scanner{
	private String brand;
	private String pName;
	
	public AllinOnePrinter() {}

	public AllinOnePrinter(String brand, String pName) {
		super();
		this.brand = brand;
		this.pName = pName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	@Override
	public String toString() {
		return "AllinOnePrinter [brand=" + brand + ", pName=" + pName + "]";
	}
	
	
	
	
	
}
