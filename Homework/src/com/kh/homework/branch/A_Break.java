package com.kh.homework.branch;

import java.util.Scanner;

public class A_Break {
	public void example1() {
		// 1~10까지 출력(for문 사용, 단 for문의 조건식을 작성하면 안됨)
		for(int i = 1; ; i++ ) {
			
			if(i > 10) {
				break;
		}
			System.out.println(i);			
		}
		
	}

	public void example2() {
		Scanner sc = new Scanner(System.in);
		
		String str = null;
		
		while(true) {
			System.out.print("입력 : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
			
			if(str.equals("exit")) {
				break;
			}
			
		}
		
		
	}







}
