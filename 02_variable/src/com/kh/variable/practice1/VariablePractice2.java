package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice2 {
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int b = sc.nextInt();
		
		System.out.println();
		
		System.out.printf("더하기 결과 : %d\n", a+b);
		System.out.printf("빼기 결과 : %d\n", a-b);
		System.out.printf("곱하기 결과 : %d\n", a*b);
		System.out.printf("나누기 결과 : %d\n", a/b);

		
	}
}
