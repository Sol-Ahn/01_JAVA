package com.kh.operator.service;

import java.util.Scanner;

public class C_Arithmetic {
	// Arithmetic : 산수
	
	// 산술 연산자
	// 기존 사칙연산에 %(modulars, mod)가 추가됨.
	// 나누기(/) 연산 시 자료형에 유의!
	
	
	public void example1() {
	// 두 정수를 입력받아, + - * / % 결과 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		sc.nextLine(); // 문자열을 입력받는게 아니면 쓰지 않아도 괜찮음.
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("num1 + num2 = " + (num1 + num2)); // 13
		System.out.println("num1 - num2 = " + (num1 - num2)); //5
		System.out.println("num1 * num2 = " + (num1 * num2)); // 36
		System.out.println("num1 / num2 = " + (num1 / num2)); // 2
		System.out.println("num1 % num2 = " + (num1 % num2)); // 1

				
	}
}
