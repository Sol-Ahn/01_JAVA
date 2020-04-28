package com.kh.control.chap03.practice;

import java.util.Scanner;

public class BranchPractice {
	
	
	// 분기문 실습문제

	/* 실습문제 1
	사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
	단, 입력한 수는 1보다 크거나 같아야 합니다. 
	만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
	1 미만의 숫자가 입력됐다면  “1 이상의 숫자를 입력해주세요”가 출력되면서 
	다시 사용자가 값을 입력하도록 하세요.
	*/
	public void practice1() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int input = sc.nextInt();
			if (input >= 1) {
				for (int i = 1; i <= input; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
	}
	
	
	/* 실습문제 2
	사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
	단, 입력한 수는 1보다 크거나 같아야 합니다. 
	1 미만의 숫자가 입력됐다면  “1 이상의 숫자를 입력해주세요”가 출력되면서 
	다시 사용자가 값을 입력하도록 하세요.
	*/
	public void practice2() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int input = sc.nextInt();
			if (input >= 1) {
				for (int i = input; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
	}
	
	
	/* 실습문제 3
	사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
	만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
	1 미만의 숫자가 입력됐다면   “1 이상의 숫자를 입력해주세요”가 출력되면서 
	다시 사용자가 값을 입력하도록 하세요.
	*/
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
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
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
	}
	
	 
	/* 실습문제 4
	사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
	단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
	9를 초과하는 숫자가 입력됐다면 “ 9 이하의 숫자를 입력해주세요”가 출력되면서 
	다시 사용자가 값을 입력하도록 하세요.
	 */
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {			
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			if(num <= 9) {
				for(int i = num; i < 10; i++) {			
					System.out.printf("===== %d단 =====\n", i);
					for(int j = 1; j <= 9; j++) {				
						System.out.printf("%d * %d = %d\n", i, j, (i * j));
					}
					System.out.println();
				}	
				break;
			} else {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			}
		}
	}
	
	
	/* 실습문제 5
	사용자로부터 시작 숫자와 공차를 입력 받아 
	일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
	단, 출력되는 숫자는 총 10개입니다.
	*/
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		System.out.print("공차 : ");
		int num = sc.nextInt();
		
//		for(int i = 0; i < 10; i++) {
//			System.out.print(num * i + start + " ");
//		}
		
		int count = 0;
		for(int i = start; ; i += num) {
			System.out.print(i + " ");
			count++;
			
			if(count == 10) {
				break;
			}
		}
	}
	
	/* 실습문제 6
	다음 실행 화면처럼 작업을 수행하는 프로그램을 구현하시오.
	*/
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.next();
			
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
			if(op.equals("/") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.\n");
				continue;
			}
			
			switch(op) {
			case "+":
				System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 + num2));
				break;
			case "-":
				System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 - num2));
				break;
			case "*":
				System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 * num2));
				break;
			case "/":
				System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 / num2));
				break;
			case "%":
				System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 % num2));
				break;
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요.\n");
				continue;
			}
			System.out.println();
		}
	}
	
}
