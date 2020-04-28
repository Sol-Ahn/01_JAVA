package com.kh.control.chap02.homework;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다. 
		//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		if(input >= 1) {
			for(int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			}
		}else {
		
		System.out.println("1 이상의 숫자를 입력해주세요");
		}
	}
	
	public void practice2() {
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다. 
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 하나 입력하세요 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		if(input >= 1) {
			for(int i = input; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}

}
	public void practice3() {
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 하나 입력하세요 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		int sum = 0;
		
		for(int i = 1; i <= input; i++) {
			sum += i;
			if(i != input) {
				System.out.print(i + " + ");
			}else {
				System.out.println(i + " = " + sum);
			}
			
		}
		
	}
		
	public void practice4() {
		//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		if(num1 >= 1 && num2 >= 1) {
			int min = 0;
			int max = 0;
			
			if(num1 > num2) {
				max = num1;
				min = num2;
			}else {
				max = num2;
				min = num1;
			}
			
			for(int i = min; i <= max; i++) {
				System.out.print(i + " ");
			} 
			
			}else {
				System.out.println("1이상의 숫자를 입력해주세요.");
		}
		
	}
		
	public void practice5() {
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();
		
		System.out.printf("====== %d단 ======\n", input);
		
		for(int i = 1; i <= 9; i++) {  
		 System.out.printf("%d * %d = %d%n", input, i, (input*i) );
		//printf에서 개행문자 %n을 \n으로 적어도 괜찮은가?
	}
	
	}
		
	public void practice6() {
		//사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		//단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int a = sc.nextInt();
		
		if(a <= 9) {
			for(int i = a; i <= 9; i++) {
				System.out.printf("====== %d단 ======\n", i);
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d%n", i, j, i*j);
				}
				System.out.println();
			}
			
		}else {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}
		
		
	}
	
	public void practice7() {
		/* 정수 입력 : 4
		   *
		   **
		   ***
		   ****
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int input = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= input; i++ ) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void practice8() {
		/* 정수 입력 : 4
		   ****
		   ***
		   **
		   *
	    */
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력: ");
		int input = sc.nextInt();
		sc.nextLine();
		
		for(int i = input; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void practice10() {
		/* 정수 입력 : 4
		*     *
		*    **
		*   *** 
		*  ****
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < input; i++) {
			// 앞쪽 공백 출력 for문
			for(int k = 0; k < input-1-i; k++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j <= i; j++) {
					System.out.print("*");
				} 
				System.out.println();
				}
		
			}
		
		
	
	
	
	}
	
	
	






