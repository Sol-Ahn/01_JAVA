package com.kh.homework.chap01.polymodel.vo;

public class Car {
	private String engine;
	private String color;
	
	public Car() {}
	
	public Car(String engine, String color) {
		super();
		this.engine = engine;
		this.color = color;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + ", color=" + color + "]";
	}
	
	
	
	
	
	
	
	
}
