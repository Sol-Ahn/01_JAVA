package com.kh.control.chap01.practice;

import java.util.Scanner;

import com.kh.control.chap01.service.A_If;

public class ControlPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
	    String result; 
		
		switch(menu) {
		case 1: result = "입력"; break;
		case 2: result = "수정"; break;
		case 3: result = "조회"; break;
		case 4: result = "삭제"; break;
		case 7: result = "종료"; break;
		default : System.out.println("입력 오류"); return;
				
		}
		
		System.out.println(result + " 메뉴입니다.");
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		if(input > 0) {
			if(input % 2 == 0) {
				System.out.print("짝수다");
			}else {
				System.out.print("홀수다");
			}
		}else {
			System.out.print("양수만 입력해주세요 . ");

		}
			
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		sc.nextLine();
		
		System.out.print("수학점수 : ");
		int mat = sc.nextInt();
		sc.nextLine();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		sc.nextLine();
		
		int sum = kor + mat + eng;
		double ave = sum / 3;
		
		if(kor >= 40 && mat >= 40 && eng >= 40 && ave >= 60) {
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + ave);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");

		}
		
		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		sc.nextLine();
		
		switch(month) {
		case 1: case 2: case 12: 
			System.out.println(month + "월은 겨울입니다."); break;
		case 3: case 4: case 5:
			System.out.println(month + "월은 봄입니다."); break;
		case 6: case 7: case 8:
			System.out.println(month + "월은 여름입니다."); break;
		case 9: case 10: case 11:
			System.out.println(month + "월은 가을입니다."); break;
		
		default : System.out.println(month + "월은 잘못 입력된 달입니다."); 
			
		}
		
	}
	
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		String id = "myId";
		String password = "myPassword12";
		
		System.out.print("아이디 : ");
		String inputId =sc.nextLine(); 
		
		System.out.print("비밀번호 : ");
		String inputPassword =sc.nextLine();
		
		// 클래스도 자료형 -> 그래서 String도 자료형
		// String.equals() : String 자료형이 갖고 있는 진짜 값들이 같은지 비교하는 메소드
		// 결과로 true 또는 false를  반환함.
		
		if(id.equals(inputId)) {
			
			if(password.equals(inputPassword)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
			
			
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
		
		
	}
	
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String inputlevel = sc.nextLine();
		
		String a = "회원관리";
		String b = "게시글 관리";
		String c = "게시글 작성";
		String d = "댓글 작성";
		String e = "게시글 조회";

		
		switch(inputlevel) {
		case "관리자": System.out.println(a + "," + b + "," + c + "," + d + "," + e); break;
		case "회원" : System.out.println(c + "," + d + "," + e); break;
		case "비회원" : System.out.println(e); break;
		
		default : System.out.println("입력 오류");
		
		}
		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요: ");
		double height =sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요: ");
		double weight =sc.nextDouble();
		
		double BMI = weight / (height * height);
		
		System.out.println("BMI 지수 : " + BMI);
		
		if(BMI < 18.5) {
			System.out.println("저체중");
		}else if(BMI < 23) {
			System.out.println("정상체중");
		}else if(BMI < 25) {
			System.out.println("과체중");
		}else if(BMI < 30) {
			System.out.println("비만");
		}else if(BMI >= 30) {
			System.out.println("고도비만");

		}
			
	}
			
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char op = sc.nextLine().charAt(0);
		
		double result = 0;
		
		if(num1 > 0 && num2 >0 ) {
		
		switch(op) {
		case '+' : result = num1 + num2; break;
		case '-' : result = num1 - num2; break;
		case '*' : result = num1 * num2; break;
		case '/' : result = (double)num1 / num2; break; // 형변환하는 이유??
		case '%' : result = num1 % num2; break;

		default : System.out.println("연산자를 잘못 입력하셨습니다. 프로그램을 종료합니다."); return;
		}
		System.out.printf("%d %c %d = %.6f", num1, op, num2, result);
		}else {
			System.out.println("양수가 아닌 값을 입력하셨습니다. 프로그램을 종료합니다.");
		}
		
		
	}
	
	public void practice9() {
		// 출석 비율은 출석 횟수는 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산한다는 게 무슨 의미? 1회당 1점
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간고사 점수 : ");
		int middleTerm = sc.nextInt();
		sc.nextLine();
		
		System.out.print("기말고사 점수 : ");
		int finalTerm = sc.nextInt();
		sc.nextLine();
		
		System.out.print("과제 점수 : ");
		int task = sc.nextInt();
		sc.nextLine();

		
		System.out.print("출석횟수 : ");
		int attendance = sc.nextInt();
		sc.nextLine();

		double m =  middleTerm * 0.2;
		double f =  finalTerm * 0.3;
		double t = task * 0.3;
		double a = attendance;
		double sum = m + f + t + a; 
		
		System.out.println("\n========== 결과 ==========");
		
		if(a >= 20 * 0.7) {
			System.out.println("중간고사 점수(20) : " + m);
			System.out.println("기말고사 점수(30) : " + f);
			System.out.println("과제 점수(30) : " + t);
			System.out.println("출석 점수(20) : " + a);
			System.out.println("총점 : " + sum);

			if(sum >= 70) {
				System.out.println("PASS");
			}else {
				System.out.println("Fail [점수 미달]");
			}
			
		}else {
			System.out.println("Fail [출석 횟수 부족] (" + attendance + "/20)");
		}
		
	}
	
	public void practice10() {
		A_If aif = new A_If();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요.");
		
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");
		System.out.println("10. if문 예제 1번");
		
		
		System.out.print("선택 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		// 같은 클래스 내의 메소드끼리는 메소드명을 작성하는 것으로 호출 가능
		switch(menu) {
		case 1 : practice1(); break;
		case 2 : practice2(); break;
		case 3 : practice3(); break;
		case 4 : practice4(); break;
		case 5 : practice5(); break;
		case 6 : practice6(); break;
		case 7 : practice7(); break;
		case 8 : practice8(); break;
		case 9 : practice9(); break;
		case 10 : aif.example1(); break; // 다른 클래스 메소드 호출
		
		default : System.out.println("잘못 입력하셨습니다.");
		
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
