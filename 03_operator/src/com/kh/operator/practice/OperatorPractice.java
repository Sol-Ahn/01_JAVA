package com.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		
		int input = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
	
		System.out.println((input > 0) ? "양수다" : "양수가 아니다");
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		
		int input = sc.nextInt();
		sc.nextLine();

		System.out.println();
		
		System.out.println(input > 0 ? "양수다" : (input == 0 ? "0이다" : "음수다"));
		
		
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		
		int input = sc.nextInt();
		sc.nextLine();

		System.out.println();
		
		System.out.println(input % 2 == 0 ? "짝수다" : "홀수다");
		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int pNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("사탕 개수 : ");
		
		int cNum = sc.nextInt();
		sc.nextLine();

		System.out.println();
		
		System.out.println("1인당 사탕 개수 : " + cNum / pNum);
		System.out.println("1인당 사탕 개수 : " + cNum % pNum);

	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		sc.nextLine();
		
		System.out.print("반(숫자만) : ");
		int classroom = sc.nextInt();
		sc.nextLine();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		String result = (gender == 'M' ? "남학생" : "여학생");	
		
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double grade2 =sc.nextDouble();
		
		System.out.println();
		
		System.out.println(grade + "학년 " + classroom + "반 " + num + "번 " + name + " " + result + "의 성적은 " + grade2 +"이다." );
		
		
	}	
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println();

		
		System.out.println(age <= 13 ? "어린이" : (age <= 19 ? "청소년" : "성인")); 
		
		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		sc.nextLine();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		sc.nextLine();
		
		System.out.print("수학 : ");
		int mat = sc.nextInt();
		sc.nextLine();
		
		int sum = kor + eng + mat;
		double ave = sum/3.0;
		
		System.out.println();
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + ave);
		
		System.out.println((kor >= 40 && eng >= 40 && mat >= 40 && ave >= 60) ? "합격" : "불합격"); 
		
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		
		char number = sc.nextLine().charAt(7);
		String gender = (number == '1' || number =='3' ? "남자" : number == '2' || number =='4' ? "여자" : "잘못 입력하셨습니다.");
		
		System.out.println();
		
		System.out.println(gender);
		
		
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		System.out.println();

		System.out.println(num3 <= num1 || num3 > num2 ? "true" : "false");
		
		
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		System.out.println();
		
		String result = (num1 == num2 ? "true" : (num2 == num3 ? "true" : "false"));
		
		System.out.println(result);

		
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int a = sc.nextInt();
		sc.nextLine();

		System.out.print("B사원의 연봉 : ");
		int b = sc.nextInt();
		sc.nextLine();

		System.out.print("C사원의 연봉 : ");
		int c = sc.nextInt();
		sc.nextLine();

		
		double a2 = (a * 1.4);
		double b2 = b;
		double c2 = (c * 1.15);

		System.out.println();
		
		String x = "3000 이상";
		String y = "3000 미만";
				
		System.out.println("A사원 연봉/연봉+a : " + a + '/' + a2);
		System.out.println(a2 >= 3000 ? x : y);
		
		System.out.println("B사원 연봉/연봉+a : " + b + '/' + b2);
		System.out.println(b2 >= 3000 ? x : y);

		System.out.println("C사원 연봉/연봉+a : " + c + '/' + c2);
		System.out.println(c2 >= 3000 ? x : y);

	}
	
	
}
