package com.kh.darray.service;

import java.util.Arrays;
import java.util.Scanner;

public class DArray {
	// 2차원 배열 : 1차원 배열 여러 개를 하나로 묶은 것
	
	public void example1() {
		// 2차원 배열 선언
		int[][] arr1;
		int arr2[][];
		int[] arr3[];
		
		// [] --> 배열 1차원을 의미
  		
		// 2차원 배열 할당
		// 배열명 = new 자료형[행크기][열크기];
		
		arr1 = new int[3][5]; // 3행 5열 2차원 배열
		
		// 1차원 배열의 길이 == 배열명.length
		
		
		System.out.println("행의 개수 : " + arr1.length);
		System.out.println("열의 개수 : " + arr1[0].length);
		
		// 3행 5열을 모두 5로 초기화
		// 행 반복 지정
		for(int i = 0; i < arr1.length; i++) {
			// 열 반복 지정
			for(int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = 5;
				// 2차원 배열 arr1의 i행 j열 값을 5로 초기화
			}
		}
		
		// 2차원 배열  출력
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j]+ " ");
			}
			
			// 행 출력이 끝날 때마다 줄바꿈
			System.out.println();
		}
		
	}
	
		public void example2() {
			// 4행 4열 int형 2차원 배열을 선언 및  할당하고, 각 인덱스에 순서대로 1~16까지 저장하고 출력하기
			int arr2[][] = new int[4][4];
			
			int value = 1; // 1~16까지 증가하는 변수
			
			for(int i = 0; i < arr2.length; i++) { // 행 지정
				for(int j = 0; j < arr2[i].length; j++) { // 열 지정
					arr2[i][j] = value++;
					          // 후위 증감 연산자 활용
					          // 인덱스에 현재 value 대입 후 value 1 증가
				// 대입 하자마자 출력도 동시에 진행
					System.out.printf("%3d", arr2[i][j]);
					
				}    
				System.out.println(); // 출력 시 행 구분을 위한 줄바꿈
		
		}
		
		
	}
		
		public void example3() {
			// 2차원 배열 선언, 할당과 동시에 초기화 
			// 1 2 3
			// 4 5 6
			// 7 8 9
			
			int[][] arr3 = {	
					  		{1, 2, 3} , 
					  		{4, 5, 6} ,
					  		{7, 8, 9}
			               };
			
			for(int i = 0; i < arr3.length; i++) {
				for(int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j]+ " ");	
				}
				System.out.println();
			}
			
		}
		
		public void example4() {
			// 가변 배열
			// 행의 개수는 정해져 있으나, 열의 개수가 정해지지 않은 2차원 배열
			
			int[][] arr4 = new int[3][]; // 가변 배열 행만 할당 
			
			arr4[0] = new int[2];
			arr4[1] = new int[4];
			arr4[2] = new int[3];
			
			// 각 칸에 1~9까지 수 대입
			
			int value = 1; // 대입용 변수
			for(int i = 0; i < arr4.length; i++) { // 행의 크기는 지정되어 있으므로 일반적으로 접근하면 됨.
				for(int j = 0; j < arr4[i].length; j++) {
					arr4[i][j] = value++;
					System.out.print(arr4[i][j] + " ");
					
				}
				System.out.println();
			}
			
		}
		
		public void example5() {
			// 가변 배열 선언, 할당과 동시에 초기화
			int[][] arr5 = {
							{1, 2},
							{3},
							{4, 5 , 6, 7}
						   };
			
			for(int i = 0; i < arr5.length; i++) {
				for(int j = 0; j < arr5[i].length; j++) {
					System.out.print(arr5[i][j] + " ");
					
				}
				System.out.println();
			}
			
		}
		
		public void example6() {
			// 다음과 같은 배열 형태로 값을 입력받고 저장하기.
			/*
			1번 학생의 점수
			국어 점수 입력 : 50   0, 0
			영어 점수 입력 : 60   0, 1
			수학 점수 입력 : 70   0, 2
			합계 : 180
			평균 : 60
			
			2번 학생의 점수
			국어 점수 입력 : 70   1, 0
			영어 점수 입력 : 80   1, 1
			수학 점수 입력 : 90   1, 2
			합계 : 240
			평균 : 80
			
			국어 평균 점수 : 60
			영어 평균 점수 : 70
			수학 평균 점수 : 80

			*/
			
			Scanner sc = new Scanner(System.in);
			int[][] arr = new int[2][3];
			
			// 행 지정(학생 지정)
			for(int i = 0; i < arr.length; i++) {
				System.out.println(i+1 + "번 학생의 점수");
				
				int sum = 0; // 합계 저장용 변수
				
				
				// 열 지정(과목 지정)
				for(int j = 0; j < arr[i].length; j++) {
					String subject = null; // 과목 지정용 변수

					switch(j) {
					case 0 : subject = "국어"; break;
					case 1 : subject = "영어"; break;
					case 2 : subject = "수학"; break;
					}
					System.out.print(subject + " 점수 입력 : ");
					arr[i][j] = sc.nextInt();
					sc.nextLine();
					
					sum += arr[i][j]; // 합계 누적
					
				}
				System.out.println("합계  : " + sum);
				System.out.println("평균 : " + sum/arr[i].length);
				System.out.println();
			}
			
			// 과목별 평균점수
			
			// 과목(열) 지정 for문
			for(int j = 0; j < arr[0].length; j++) {
				String subject = null;
				
				switch(j) {
				case 0 : subject = "국어"; break;
				case 1 : subject = "영어"; break;
				case 2 : subject = "수학"; break;
				}
				
				// 각 과목별 점수 합계 저장을 위한 변수 선언
				int sum = 0;
				
				// 학생(행) 지정 for문
				for(int i = 0; i < arr.length; i++) {
					sum += arr[i][j];
				}
				System.out.println(subject + " 평균 점수 : " + sum/arr.length);
				
				
			}
			
			
		}
		
		public void example7() {
			// 3행 3열 정수형 2차원 배열에 1~9까지 난수를 중복없이 저장하기
			
			int arr[] = new int[9];
			
			for(int i = 0; i < arr.length; i++) {
				arr[i] = (int)(Math.random() * 9 + 1);
				
				// 중복검사
				for(int j = 0; j < i; j++) {
					if(arr[i] == arr[j]) {
						i--;
						break;
					}
				}
				
			}
			
			System.out.println(Arrays.toString(arr));
			
			// 값 저장용 2차원 선언, 할당
			int[][] newArr = new int[3][3];
			// 1차원 배열 인덱스 증가용 변수
			int index = 0; 
			
			// 2차원 배열에 값 대입용 for문
			for(int i = 0; i < newArr.length; i++) {
				for(int j = 0; j < newArr[i].length; j++) {
					
					newArr[i][j] = arr[index++];
					
					System.out.print(newArr[i][j] + " ");
				}
				
				System.out.println();
			}
			
			
		}
		
	}
