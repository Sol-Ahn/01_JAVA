package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice3 {
	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로: ");
		double c = sc.nextDouble();
		System.out.print("세로: ");
		double d = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("면적 : %.2f\n", c*d);
		System.out.printf("둘레 : %.1f", (c+d)*2);
		
		
		
		
	}

}
