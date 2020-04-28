package com.kh.operator.service;

public class MoreStudy {
	public void study1() {
		int num = 10;
		
		System.out.println("전위 증감 연산자 적용 전 : " + num); // 10
		System.out.println("++num 1회 수행 후 : " + ++num); // num = 11
		System.out.println("++num 2회 수행 후 : " + ++num); // num = 12
		System.out.println("++num 3회 수행 후 : " + ++num); // num = 13
		System.out.println("++num 4회 수행 후 : " + ++num); // num = 14
		System.out.println("++num 5회 수행 후 : " + ++num); // num = 15

		System.out.println("전위 증감 연산자 적용 후 : " + num); // 15
		
		System.out.println("\n--------------------------------\n");
		
		int num2 = 10;
		System.out.println("후위 증감 연산자 적용 전 : " + num2); // 10
		System.out.println("num2-- 1회 수행 후 : " + num2--); // 출력 : 10, num2 = 9 
		System.out.println("num2-- 2회 수행 후 : " + num2--); // 출력 : 9, num2 = 8 
		System.out.println("num2-- 3회 수행 후 : " + num2--); // 출력 : 8, num2 = 7 
		System.out.println("num2-- 4회 수행 후 : " + num2--); // 출력 : 7, num2 = 6 
		System.out.println("num2-- 5회 수행 후 : " + num2--); // 출력 : 6, num2 = 5 

		System.out.println("후위 증감 연산자 적용 후 : " + num2); // 5

		
	}
	public void study2() {
		int num1 = 20;
		
		int result = num1++ * 3; // result = 60, num1 = 21 
		
		System.out.println("num1 : " + num1); // 21
		System.out.println("num1 : " + result); // 60

		
	}
	
	public void study3() {
		int a = 10;
		int b = 20;
		int c = 30;
		
		int result1 = a++; // a=11, b=20, c=30 result1=10
		int result2 = ++a + b++; // a=12, b=21, c=30,  result2=32
		int result3 = a++ + --b + --c; // a=13  b=20  c=29  result3=61 
		
		System.out.println("a : " + a); // 13
		System.out.println("b : " + b); // 20
		System.out.println("c : " + c); // 29
		System.out.println("result1 : " + result1); // 10 
		System.out.println("result2 : " + result2); // 32
		System.out.println("result3 : " + result3); // 61

		
	}
	
	
	
	
	
}
