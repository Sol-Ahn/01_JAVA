package com.kh.inherit.homework.model.vo;

public class Computer extends Product{
	private String cpu;
	private int ram;
//	private String pName;
//	private int price;
	
	public Computer() {
		super();
	}
		

	public Computer(String cpu, int ram, String pName, int price) {
		super();
		this.cpu = cpu;
		this.ram = ram;
//		this.pName = pName;
//		this.price = price;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

//	public String getpName() {
//		return pName;
//	}
//
//	public void setpName(String pName) {
//		this.pName = pName;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	public String selectField() {
		return cpu + " / " + ram + " / "; 
				
				// + pName + " / " + price;
	}
	
	
	
}
