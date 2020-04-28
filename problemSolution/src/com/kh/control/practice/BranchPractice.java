package com.kh.control.practice;

import java.util.Scanner;

public class BranchPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("1이상의 숫자를 입력하세요 : ");
			int input = sc.nextInt();
			
			if(input >= 1) {
				for(int i = 1; i <= input; i++) {
					System.out.print(i + " ");
				}
				break;
			}else {
				System.out.println("1이상의 숫자를 입력해주세요.");
			}
		
		
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
