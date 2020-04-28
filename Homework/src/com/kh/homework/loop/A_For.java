package com.kh.homework.loop;

import java.util.Scanner;

public class A_For {
	public void example1() {
		// 1부터 5까지 출력
		for(int i = 1; i <= 10 ; i += 2) {
			System.out.println(i);
		}
	}

	public void example2() {
		for(int i = 5; i >= 1 ; i--) {
			System.out.println(i);
		}
	}
	
	public void example3() {
		// 정수 하나를 입력받아 해당 수가 2~9 사이의 수인지 검사하고
		// 맞을 경우, 해당 단의 구구단 출력하기  아닐 경우, "2~9 사이의 수를 입력하세요" 출력
		Scanner sc = new Scanner(System.in);
		System.out.print(" 정수 하나 입력 : ");
		int dan = sc.nextInt();
		sc.nextLine();
		
		if(dan >=2 && dan <= 9) {
			for(int i = 1; i < 10 ; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			}
			
		}else {
			System.out.println("2~9 사이의 수를 입력하세요.");
		}
		
		
	}
	
	public void example4() {
		// 1~100까지의 합
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}
	
	public void example5() {
		// 1부터 입력받은 정수까지의 합
		// 단, 입력하는 수는 1을 초과한 수여야 함.
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
	
	public void example6() {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
	
	public void example7() {
		// 0분 0초~9분 55초
		for(int min = 0; min < 10; min++) {
			for(int sec = 0; sec < 60; sec++) {
				System.out.printf("%2d분 %2d초\n", min, sec);
			}
		}
		
	}
	
	public void example8() {
		for(int dan = 2; dan <= 9; dan++) {
			for(int su = 1; su <= 9; su++) {
				System.out.printf("%2d * %2d = %2d  ", dan, su, dan*su);
			}
			System.out.println();
		}
		
	}
	
	public void example9() {
		// 5행 5열 별찍기
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		}
		
	public void example10() {
		for(int i=0; i<10; i++) {
			for(int j=0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void example11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<input; i++) {
			
			// 앞쪽 공백 출력 for문 
			for(int k=0; k<input-1-i; k++) {
				System.out.print(" ");
			}
			
			
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}
	
	
	
	
		
	}
	
	
