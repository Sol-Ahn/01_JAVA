package com.kh.control.chap02.service;

import java.util.Scanner;

public class ForStudy {
	public void practice1() {
		// 1부터 5까지 출력하기
		
		for(int i = 1 ; i <= 5 ; i++) {
			System.out.println(i);
		}
		
	}
	
	public void practice2() {
		// 5부터 1까지 출력하기
		
		for(int i = 5 ; i >= 1 ; i--) {
			System.out.println(i);
		}
		
	}
	
	public void practice3() {
		// 구구단 7단 출력하기
		int dan = 7;
		
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
		}
		
	}	
	
	public void practice4() {
		// 1부터 50까지 홀수 모두 출력하기

		for(int i = 1 ; i <= 50 ; i += 2) {
			System.out.println(i);
		}
		
	}
	
	
	public void practice5() {
		// 정수를 하나 입력받아 
		// 해당 수가 2~9 사이 수 인지 검사하여
		// 맞을 경우, 해당 단의 구구단 출력하기
		// 아닐 경우, "2~9  사이의 수를 입력하세요" 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int dan = sc.nextInt();
		sc.nextLine();
		
		if(dan >= 2 && dan <= 9) {
			for(int i = 1 ; i < 10 ; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, (dan * i ));
			}
		}else {
			System.out.println("2~9 사이의 수를 입력하세요.");
		}
		
		
	}

	public void practice6() {
		// 1 ~ 100까지의 합
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	public void practice7() {
		// 1부터 입력받은 정수까지의 합
		// 단, 입력하는 수는 1을 초과한 수 이어야 함.
		// 1 이하의 수 입력 시 "잘못 입력하셨습니다." 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		if(input > 1) {
			int sum = 0;
			for(int i = 1; i <= input; i++) {
				sum += i;
			}
			System.out.println("합계 : " + sum);
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void practice8() {
		// 1부터 5까지 출력되는 문장을 5줄 출력하기
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}
	
	public void practice9() {
		// 0분 0초 부터 9분 59초
		for(int min = 0; min < 10; min++) {
			
			for(int sec = 0; sec < 60; sec++) {
				
				System.out.printf("%2d분 %2d초\n", min, sec);
			}
		}
		
	}
	
	public void practice10() {
		// 2~9단 모두 출력하기
		for(int dan = 2; dan <= 9; dan++) {
			for(int num = 1; num <= 9; num++) {
				System.out.printf("%2d * %1d = %2d\n", dan, num, dan * num);
			}
			System.out.println();
			
		}
		
	}
	
	public void practice11() {
		// *****
		// *****
		// *****
		// *****
		// *****
		for(int i = 0; i < 5; i++) {
			for(int h = 0; h < 5; h++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void practice12() {
		// *
		// **
		// ***
		// ****
		for(int i = 0; i <= 3; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
	
}
