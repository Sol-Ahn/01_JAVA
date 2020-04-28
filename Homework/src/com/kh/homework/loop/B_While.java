package com.kh.homework.loop;

import java.util.Scanner;

public class B_While {
	public void example1() {
		//1~5까지 출력
		int i =1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
	}
	public void example2() {
		//10~1까지 출력
		int i = 10;
		while(i>1) {
			System.out.println(i);
			i--;
		}
		
		
	}
	
	public void example3() {
		// 입력되는 모든 수의 합(0 입력 시 종료)
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		int input = 0;
		
		boolean flag = true;
		
		while(flag) {
			System.out.print("입력 : ");
			input = sc.nextInt();
			sc.nextLine();
			
			if(input == 0) {
				flag = false;
			}else {
				sum += input;
			}
			
		}
		System.out.println("합계 : " + sum);
		
		
	}
	
	public void example4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양수 입력 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		int i = 0;
		while(i < input) {
			
			int j = 0;
			while(j < input) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
	
	public void example5() {
		// 키보드로 문자열을 입력받아 그대로 출력하기 반복
		// 단, "exit" 입력 시 종료
		
		Scanner sc = new Scanner(System.in);
		String str = null;
		
		//String str2 = "";
		
		do { 
			System.out.print("문자열 입력 : ");
			str = sc.nextLine();
			
			System.out.println("str : " + str);
			
		}while(!str.equals("exit"));
		
	}
	
	public void example6() {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		
		do {
			System.out.println("============");
			
			System.out.println("1. 1번 기능");
			System.out.println("2. 2번 기능");
			System.out.println("3. 3번 기능");
			System.out.println("0. 프로그램 종료");

			System.out.println("============");

			System.out.print("메뉴 선택 >> ");
			menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : System.out.println("1번 기능 수행"); break;
			case 2 : System.out.println("2번 기능 수행"); break;
			case 3 : System.out.println("3번 기능 수행"); break;
			case 0 : System.out.println("프로그램을 종료합니다..."); break;
			default : System.out.println("잘못 입력하셨습니다.");
			
			}
			
		}while(menu != 0);
		
	}
	
	
}
