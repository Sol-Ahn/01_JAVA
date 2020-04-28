package com.kh.inherit.homework.model.service;

import com.kh.inherit.homework.model.vo.Car;
import com.kh.inherit.homework.model.vo.Computer;
import com.kh.inherit.homework.model.vo.Cup;

public class InheritService {
	public void example1() {
		
		Computer com = new Computer();
		
		com.setCpu("i7 - 9700k");
		com.setRam(32);
		
		com.setpName("»ï¼º ¿Àµ÷¼¼ÀÌ");
		com.setPrice(2000000);
		
		System.out.println(com.getCpu());
		System.out.println(com.getRam());
		System.out.println(com.getpName());
		System.out.println(com.getPrice());
		
		
		System.out.println("=====================");
		
		Cup cup = new Cup("½ºÅ¸¹÷½º", 1, "2020º¢²É¿¡µð¼Ç", 33000);
		System.out.println(cup.getBrand());
		System.out.println(cup.getCapacity());
		System.out.println(cup.getpName());
		System.out.println(cup.getPrice());
		
		System.out.println(cup.selectField());
		
		Car car = new Car("V6", "ÇÎÅ©»ö", "Æ®·°", "Æ÷ÅÍ º¢²É¿¡µð¼Ç", 30000000);
		
		System.out.println(car.selectField());
		
	}
}
