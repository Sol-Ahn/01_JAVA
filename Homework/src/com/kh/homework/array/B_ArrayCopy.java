package com.kh.homework.array;

import java.util.Arrays;

public class B_ArrayCopy {
	// 얕은 복사 : 참조하는 배열의 시작 주소만을 복사하는 것
	// 깊은 복사 : 복사하고자 하는 배열과 동일한 자료형 크기를 가지는 배열을 만들어 내부 데이터를 똑같이 작성(복사)하는 것
	
	public void example1() {
		// 얕은 복사 시 원본데이터 유지여부 확인
		
		int origin[] = {10, 20, 30, 40, 50};
		
		// 얕은 복사 진행
		int copyArr[] = origin; // 배열 참조형 변수에 저장된 주소값을 복사
		
		// 데이터 변경 전 원본
		System.out.println(Arrays.toString(origin));
		// Arrays 클래스 : 배열을 편하게 사용하거나 추가적인 기능을 제공해주는 클래스
		// Arrays.toString(배열명) : 배열 내의 데이터를 한 번에 출력
		
		// 복사본의 데이터를 변경
		copyArr[2] = 10000;
		
		System.out.println("복사본 값 변경 후");
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copyArr));
		
		// 배열의 해시코드 출력
		// 해시코드 : 주소값을 해시함수라는 것을 이용하여 변경된 형태
		// 해시함수 : 특정 문자열을 정해진 길이의 형태로 변형
		
		System.out.println("origin의 hashCode() : " + origin.hashCode());
		System.out.println("origin의 hashCode() : " + copyArr.hashCode());
		
		
	}



}

