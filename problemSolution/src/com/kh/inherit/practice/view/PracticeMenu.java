package com.kh.inherit.practice.view;

import java.util.Scanner;

import com.kh.inherit.practice.model.service.CircleService;
import com.kh.inherit.practice.model.service.RectangleService;

public class PracticeMenu {
	private Scanner sc = new Scanner(System.in);
	
	private CircleService cService = new CircleService();
	private RectangleService rService = new RectangleService();
	
	public void mainMenu() {
		
		int menu = 0;
		
		do {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 : circleMenu(); break;
			case 2 : rectangleMenu(); break;
			case 9 : System.out.println("종료합니다."); break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
		
		}while(menu != 9);
		
	}
	
	
	public void circleMenu() {
		int input = 0;
		
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		
		input = sc.nextInt();
		
		switch(input) {
		case 1 : calcCircum(); break;
		case 2 : calcCircleArea(); break;
		case 9 : System.out.println("메인으로");
		default : System.out.println("잘못 입력하셨습니다.");
		}
		
		
	}
	
	public void rectangleMenu() {
		int input = 0;
		
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		
		input = sc.nextInt();
		
		switch(input) {
		case 1 : calcPerimeter(); break;
		case 2 : calcRectArea(); break;
		case 9 : System.out.println("메인으로"); break;
		default : System.out.println("잘못 입력하셨습니다.");
		}
		
		
		
	}
	
	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int x = sc. nextInt();
		System.out.print("y 좌표 : ");
		int y = sc. nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		
		System.out.println(cService.calcCircum(x, y, radius));
	
	}
	
	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();

		System.out.print("y 좌표 : ");
		int y = sc.nextInt();

		System.out.print("반지름 : ");
		int radius = sc.nextInt();

		System.out.println(cService.calcArea(x, y, radius));
		
	}
	
	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();

		System.out.print("y 좌표 : ");
		int y = sc.nextInt();

		System.out.print("높이 : ");
		int height = sc.nextInt();

		System.out.print("너비 : ");
		int width = sc.nextInt();
		
		System.out.println(rService.calcPerimeter(x, y, height, width));
		
	}
	
	
	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();

		System.out.print("y 좌표 : ");
		int y = sc.nextInt();

		System.out.print("높이 : ");
		int height = sc.nextInt();

		System.out.print("너비 : ");
		int width = sc.nextInt();

		System.out.println(rService.calcArea(x, y, height, width));
		
	}
	
	
	
}
