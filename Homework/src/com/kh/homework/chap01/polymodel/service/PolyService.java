package com.kh.homework.chap01.polymodel.service;

import com.kh.homework.chap01.polymodel.vo.Bentley;
import com.kh.homework.chap01.polymodel.vo.Car;
import com.kh.homework.chap01.polymodel.vo.Sonata;

public class PolyService {
	public void example1() {
		
		Car[] cars = new Car[2];
		cars[0] = new Sonata();
		cars[1] = new Bentley();
		
		System.out.println(cars[0].toString());
		
		
		
	}
}
