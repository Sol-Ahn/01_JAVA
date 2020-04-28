package com.kh.control.chap02.practice;

import java.util.Scanner;

public class LoopPractice {
	
	// 반복문_실습문제 

	// 실습문제 1
	//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
	//단, 입력한 수는 1보다 크거나 같아야 합니다. 
	//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int user = sc.nextInt();

		if (user >= 1) {
			for (int i = 1; i <= user; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

	
	// 실습문제 2
	//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
	//단, 입력한 수는 1보다 크거나 같아야 합니다. 
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int user = sc.nextInt();

		if (user >= 1) {
			for (int i = user; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}


	// 실습문제 3
	//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1 ; i <= num ; i++) {
			sum += i;
			
			if(i != num) {
				System.out.print(i + " + ");
			} else {
				System.out.println(i + " = " + sum);
			}
		}
		
	}
	
	// 실습문제 4
	//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
	//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 >= 1 && num2 >= 1) {
			int max = 0;
			int min = 0;
			
			if(num1 > num2) {
				max = num1;
				min = num2;
			} else {
				max = num2;
				min = num1;
			}
			
			for(int i = min; i <= max; i++) {
				System.out.print(i + " ");
			}			
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	// 실습문제 5
	// 사용자로부터 입력 받은 숫자의 단을 출력하세요.
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.printf("===== %d단 =====\n", num);
		for(int i = 1; i < 10; i++) {			
			System.out.printf("%d * %d = %d%n", num, i, (num * i));
		}
	}
	
	
	// 실습문제 6
	//사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
	//단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num <= 9) {
			for(int i = num; i < 10; i++) {			
				System.out.printf("===== %d단 =====\n", i);
				for(int j = 1; j <= 9; j++) {				
					System.out.printf("%d * %d = %d%n", i, j, (i * j));
				}
				System.out.println();
			}			
		} else {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}
	}
	
	
	// 실습문제7
	/*
	다음과 같은 실행 예제를 구현하세요.

	ex.
	정수 입력 : 4
	*
	**
	***
	****
	*/
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {				
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	// 실습문제 8
	/*
	다음과 같은 실행 예제를 구현하세요.

	ex.
	정수 입력 : 4
	****
	***
	**
	*
	*/
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = num; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
