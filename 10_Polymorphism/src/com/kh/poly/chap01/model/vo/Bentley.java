package com.kh.poly.chap01.model.vo;

public class Bentley extends Car{
	
	public String takeOutUmbrella(){
		return "우산 꺼내기";
	}

	// 부모의 메소드 drive() 를 재정의 -> 오버라이팅
	@Override
	public String drive() {
		return "날아다님";
	}
	
	// 컴파일 단계에서는 부모의 drive() 메소드와 바인딩되어 있다가
	// 실제 실행 당시에는 오버라이딩된 자식의 drive()와 바인딩 됨.
	// == 동적 바인딩
	
	
}
