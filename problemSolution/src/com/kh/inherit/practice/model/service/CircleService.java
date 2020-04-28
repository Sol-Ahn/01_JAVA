package com.kh.inherit.practice.model.service;

import com.kh.inherit.practice.model.vo.Circle;

public class CircleService {
	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double area = Math.PI * radius + radius;
		
		
		return "원 넓이 : " + c + " / " + area;
		
	}
	
	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double circum = 2 * Math.PI * radius;
		
		return "원 둘레 : " + c + " / " + circum;
		
	}
}
