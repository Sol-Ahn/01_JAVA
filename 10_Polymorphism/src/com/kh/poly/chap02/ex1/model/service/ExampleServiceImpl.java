package com.kh.poly.chap02.ex1.model.service;

import java.util.Scanner;

public class ExampleServiceImpl implements ExampleService{

	@Override
	public String javaFeatures() {
		return "1.운영체제에 독립적(이식성이 높음)  2.객체 지향 언어  3.사용하기 쉬운 언어  "
				+ "4.자동 메모리 관리  5.동적 로딩 지원  6.멀티쓰레드 지원  7.네트워크와 분산환경 지원 ";
	}

	@Override
	public String defineInheritance() {
		return "1.모든 클래스는 Object클래스의 후손  2.부모클래스의 생성자, 초기화 블록은 상속불가  "
				+ "3. 부모의 private멤버는 상속은 되지만 직접 접근 불가";
	}

	@Override
	public String definePolymorphism() {
		return "객체지향 프로그래밍의 3대 특징 중 하나로 '여러 개의 형태를 갖는다'는 의미."
				+ "하나의 행동으로 여러 가지 일을 수행하는 개념"
				+ "상속을 이용한 기술로 부모 클래스 타입 참조변수 하나로 상속 관계에 있는 여러  타입의 자식 객체를 참조할 수 있는 기술";
	}

	@Override
	public String defineAbstractClass() {
		return "몸체 없는 메소드를 포함한 클래스";
	}

	@Override
	public String defineInterface() {
		return "상수형 필드와 추상 메소드만을 작성할 수 있는 추상 클래스의 변형체."
				+ "메소드의 통일성을 부여하기 위해 추상 메소드만 따로 모아놓은 것으로"
				+ "상속 시 인터페이스 내에 정의된 모든 추상메소드를 구현해야 함.";
	}

	@Override
	public String gugudan(int start, int end) {
		
		String str = "";
		
		for(int i = start; i <= end; i++) {
			str += "\n==== "+i+"단 ====\n";
			for(int j = 1; j <= 9; j++) {
				str += i + " * " + j + " = " + (i*j) + "\n";
			}
			str += "\n";
		}
		
		return str;
		
	}

	@Override
	public String reverseStar(int input) {
		
		String str = "";
		
		for(int i = input; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		return str;
		
	}

	
}
