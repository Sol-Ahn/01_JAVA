package com.kh.homework.chap02.ex1.model.vo;

public abstract class Bird {
	public static final int BIRD_LEG = 2;
	private String wingType; 
	
	public Bird() {}
	
	public abstract String fly();
	
	public String flappingWing() {
		return "날개를 파닥거림";
	}


	public String getWingType() {
		return wingType;
	}

	public void setWingType(String wingType) {
		this.wingType = wingType;
	}

	
	
}
