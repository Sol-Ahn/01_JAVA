package com.kh.inherit.practice.service;

import com.kh.inherit.practice.model.vo.Rectangle;

public class RectangleService {
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		double area = height * width;
		
		return "사각형 넓이: " + r + " / " + area;
		
	}

	public String calcPerimeter(int x, int y, int height, int width) {
		
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		double circum = 2 * (height + width);
		
		return "사각형 둘레: " + r + " / " + circum;
		
		
		
	}
	
}
