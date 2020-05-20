package com.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		sc.nextLine();
		int count = 0;
	
		for(int i = 1; i <= input; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
			System.out.print(i + " ");
			}
			if(i % 2 == 0 && i % 3 == 0) {
				count++;
			} 
		}
		System.out.println();
		System.out.print("count : " + count);
	
	}
	
	public void practice10() {
		// 오른쪽에 붙은 별찍기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 0; i < input; i++) {
			for(int j = 0; j < input-i-1 ; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void practice11() {
		// 늘었다 줄어드는 별찍기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 0; i < input; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			for(int i = input-1; i > 0; i--) {
				for(int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		
	}
	
	public void practice12() {
		// 11번의 다른 해답
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		int count = 0; // * 출력 개수를 조절하는 변수
		
		for(int i = 0; i < input*2 -1; i++) {
			if(i >= input) {
				count--;
			}else {
				count++;
			}
			
			for(int j = 0; j < count; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void practice13() {
		// 피라미드 별찍기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = input, j = 1; i > 0; i--, j+=2) {
			
			for(int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for(int k = 0; k < j; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void practice14() {
		// 사각형 별찍기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 0; i < input; i++) {
			
			for(int j = 0; j < input; j++) {
				
				if(i == 0 || i == input-1) {
					
					System.out.print("*");
					
				} else {
					
					if(j == 0 || j == input-1) {
						
						System.out.print("*");
						
					}else {
						System.out.print(" ");
					}
					
				}
			}
			System.out.println();
		}
	}

	
	
	
	
}
	
	
	
