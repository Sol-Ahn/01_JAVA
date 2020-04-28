package com.kh.objectArray.practice.model.service;

import java.util.Arrays;
import java.util.Scanner;

import com.kh.objectArray.practice.model.vo.Student;

public class PracticeService {
	public void start() {
		
		Scanner sc = new Scanner(System.in);
				
		Student[] sd = new Student[10];
		
		int count = 0;
		
			
			while(true) {
				System.out.print("학년 : ");
				int grade = sc.nextInt();
				
				System.out.print("반 : ");
				int classroom = sc.nextInt();
				sc.nextLine();
				
				System.out.print("이름 : ");
				String name = sc.nextLine();
				
				System.out.print("국어점수 : ");
				int kor = sc.nextInt();
				
				System.out.print("영어점수 : ");
				int eng = sc.nextInt();
				
				System.out.print("수학점수 : ");
				int math = sc.nextInt();
				sc.nextLine();
				
				sd[count] = new Student(grade, classroom, name, kor, eng, math);
				
				count++;
				
				boolean flag = false;
				
				while(true) {
					
					System.out.print("계속 추가하시겠습니까?(y/n) : ");
					char ch = sc.nextLine().charAt(0);
					
					if(ch == 'y') {
						break;
						
						
						
					}else if(ch == 'n' || sd.length == count) {
						flag = true;
						break;
						
					}else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					}
				
				}
				
				if(flag) {
					break;
					
				}
				
			System.out.println();	
		}
		
			for(int i = 0; i < sd.length; i++) {
				
				if(sd[i] == null) {
					break;
				}
				
				int sum = sd[i].getKor() + sd[i].getEng() + sd[i].getMath();
				
				System.out.println(sd[i].selectStudent() + ", 평균 : " + sum/3);     
			}
		
		
		
	}
}

