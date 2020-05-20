package com.kh.control.practice;

import java.util.Scanner;

public class ForPractice {
	public void example1() {
		// 1 ~ 5 출력
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
	
	public void example2() {
		//1 ~ 10 사이 홀수 출력
		for(int i = 1; i <= 10; i+=2) {
			System.out.println(i);
		}
	}
	
	public void example3() {
		// 5 ~ 1 출력
		for(int i = 5; i >= 1; i--) {
			System.out.println(i);
		}
		
	}
	
	public void example4() {
		// 구구단 7단
		int dan = 7;
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + "x" + i + " = " + (dan*i));
		}
		
	}
	
	public void example5() {
		// 정수를 하나 입력받아 
		// 해당 수가 2~9 사이 수 인지 검사하여
		// 맞을 경우, 해당 단의 구구단 출력하기
		// 아닐 경우, "2~9  사이의 수를 입력하세요" 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9) {
			for(int i = 1; i <= 9; i++) {
					System.out.printf("%d X %d = %d\n", dan, i, (dan*i));
			}
		}else {
			System.out.println("2~9 사이의 수를 입력하세요");
		}
		
	}
	
	public void example6() {
		// 1~100까지의 합
		
		int sum = 0;
		for(int i =1; i <=100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}
	
	public void example7() {
		// 1부터 입력받은 정수까지의 합
		// 단, 입력하는 수는 1을 초과한 수 이어야 함.
		// 1 이하의 수 입력 시 "잘못 입력하셨습니다." 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		if(input <= 1) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			int sum = 0;
			for(int i = 1; i <= input; i++) {
				sum += i;
			}
			System.out.println("합계 : " + sum);
		}
		
	}
	
	public void example8() {
		// 1부터 5까지 출력되는 문장을 5줄 출력하기
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}
	
	public void example9() {
		// 2 ~ 9단을 반복하는 for문
		
		for(int dan = 2; dan <= 9; dan++) {
			for(int su = 1; su <= 9; su++) {
				System.out.printf("%2d X %d = %2d  ", dan, su, (dan*su));
			}
			System.out.println();
		}
		
	}
	
	public void example10() {
		// *****
		// *****
		// *****
		// *****
		// *****
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void example11() {
		// *
		// **
		// ***
		// ****
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}
	
	
}
