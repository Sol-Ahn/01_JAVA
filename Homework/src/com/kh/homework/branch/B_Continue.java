package com.kh.homework.branch;

public class B_Continue {
	public void example1() {
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 4 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("sum : " + sum);
		
	}
}
