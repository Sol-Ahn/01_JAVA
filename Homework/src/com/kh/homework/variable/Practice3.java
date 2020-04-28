package com.kh.homework.variable;

import java.util.Scanner;

public class Practice3 {
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double a = sc.nextDouble();
		
		System.out.print("세로 : ");
		double b = sc.nextDouble();

		System.out.println();
		System.out.println();

		System.out.println("면적 : " + a*b);
		System.out.println("둘레 : " + (a+b)*2);

		
	}

}
