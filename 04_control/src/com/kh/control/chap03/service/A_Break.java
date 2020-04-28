package com.kh.control.chap03.service;

import java.util.Scanner;

public class A_Break {
	public void example1() {
		// 1~10까지 출력(for문 사용, 단 for문의 조건식을 작성하면 안됨)
		
		for(int i = 1; ; i++ ) {
			//for문에 조건식이 없어 반복문이 종료되는 시점을 알 수 없음.
			//--> 무한 반복에 빠짐.
			
			if(i > 10) {
				break;
			}
			
			System.out.println(i);
			
		}
		
	}
	
	public void example2() {
		// 문자열을 입력받아 출력하기
		// 단, exit 입력 시 종료
		Scanner sc = new Scanner(System.in);
		String str = null; // 입력되는 문자열을'참조'할 변수 선언
		
		while(true) { // while문을 강제로 무한반복
			System.out.print("입력 : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
			if(str.equals("exit")) {
				break;
			}
		}
		
	}
	
	public void example3() {
		
	}
	
	
	
}
