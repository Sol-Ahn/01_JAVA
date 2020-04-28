package com.kh.control.chap03.practice;

import java.util.Scanner;

public class BranchPractice {
	
	// 분기문 실습문제(추가문제)
	
	// 실습문제 7
	//사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
	//단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		boolean flag = false; // 소수 판별용 변수
		
		// 소수는 2 이상의 수 이므로 입력한 값이 2 이상인지 부터 검사.
		if(num >= 2) {			
			for(int i = 2; i < num; i++) {
				// 2부터 입력 받은 수 미만 사이에서 나누어 떨어지는 수가 발행하는지 검사.
				// --> 나누어 떨어지는 수가 있다 == 소수가 아니다.
				if(num % i == 0) {
					flag = true;
					break;
				}
			}
			
			if(flag) {
				System.out.println("소수가 아닙니다.");
			} else {
				System.out.println("소수입니다.");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	
	// 실습문제 8
	//위 문제와 모든 것이 동일하나, 입력한 수가 2보다 작은 경우 
	//“잘못 입력하셨습니다.”를 출력하면서 다시 사용자가 값을 입력하도록 하세요.
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			boolean flag = false;
			
			if(num >= 2) {			
				for(int i = 2; i < num; i++) {
					if(num % i == 0) {
						flag = true;
						break;
					}
				}
				
				if(flag) {
					System.out.println("소수가 아닙니다.");
				} else {
					System.out.println("소수입니다.");
				}
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}	
		}
	}
	
	
	// 실습문제 9
	//2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
	//단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		boolean flag = false;
		int count = 0;
		if(num >= 2) {
			for(int i = 2; i <= num; i++) {				
				for(int j = 2; j < i; j++) {
					if(i % j == 0) {
						flag = true;
						break;
					}
				}
				
				if(!flag) {
					System.out.print(i + " ");
					count++;
				}
				
				flag = false;
				// 소수가 아닐 때 flag는 true가 되면서 두 번째 for문을 빠져나옴
				// 두 번째 for문을 빠져나와 if문을 지나고 다시 첫 번째 for문을 돈다고 할 때
				// 소수를 만났다고 해도 flag는 여전히 true가 되어 있는 상태라 
				// if문에 걸려 print되지 않는다, 다시 말해 소수를 거르는 boolean값을
				// 원래대로 초기화 시켜주는 작업
			}
			
			System.out.println();
			System.out.println("2부터 " + num + "까지 소수의 개수는 " + count + "개입니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}	
	}
	
	

	
	
	
}
