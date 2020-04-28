package com.kh.homework.casting;

import java.util.Scanner;

public class Practice2 {
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("±¹¾î : ");
		double kor = sc.nextDouble();
		
		System.out.print("¿µ¾î : ");
		double eng = sc.nextDouble();
		
		System.out.print("¼öÇÐ : ");
		double mat = sc.nextDouble();
		
		int sum = (int)(kor+eng+mat);
		int ave = sum/3;
		
		
		System.out.println();
		System.out.println();

		System.out.println("ÃÑÁ¡ : " + sum);
		System.out.println("Æò±Õ : " + ave);
		
		
	}

}
