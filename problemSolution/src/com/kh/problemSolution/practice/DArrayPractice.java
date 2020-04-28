package com.kh.problemSolution.practice;

import java.util.Scanner;

public class DArrayPractice {
	public void practice1() {
		int arr[][] = new int[3][3];

		int index = 0;

		for (int i = 0; i < arr.length; i++) { // 행 지정
			for (int j = 0; j < arr[i].length; j++) { // 열 지정
				arr[i][j] = index++;

				System.out.printf("(%d, %d)", i, j);
			}
			System.out.println();
		}

	}

	public void practice2() {
		int arr[][] = new int[4][4];

		int value = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;

				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

	}

	public void practice3() {
		int arr[][] = new int[4][4];

		int value = 16;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value--;

				System.out.printf("%3d", arr[i][j]);

			}
			System.out.println();
		}

	}

	public void practice4() {
		int arr[][] = new int[4][4];
		
		int sum = 0;
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr[i].length-1; j++) {
				arr[i][j] = (int)(Math.random()* 10 + 1);
			}
		}
		 // (0, 0) + (0, 1) + (0, 2) = (0, 3) --> i = 0  j = 0 + 1씩 
		 //	(1, 0) + (1, 1) + (1, 2) = (1, 3) --> i = 1  j = 0 + 1씩
		 // (2, 0) + (2, 1) + (2, 2) = (2, 3) --> i = 2  j = 0 + 1씩
			
		 // (0, 0) + (1, 0) + (2, 0) = (3, 0) --> i = 0 + 1씩  j = 0	
		 // (0, 1) + (1, 1) + (2, 1) = (3, 1) --> i = 0 + 1씩  j = 1
		 // (0, 2) + (1, 2) + (2, 2) = (3, 2) --> i = 0 + 1씩  j = 2	
		
		 // (3, 3) = 총합	
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr[i].length-1; j++) {
				
				arr[i][3] += arr[i][j];
				
				arr[3][j] += arr[i][j];
				
				arr[3][3] += arr[i][j];
			}
		}	 
		
		for(int i = 0; i < arr. length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();	
			
		}
	
	
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("행 크기 : ");
			int num1 = sc.nextInt();
			sc.nextLine();

			System.out.print("열 크기 : ");
			int num2 = sc.nextInt();
			sc.nextLine();

			if (num1 >= 1 && num1 <= 10 && num2 >= 1 && num2 <= 10) {
				char arr[][] = new char[num1][num2];

				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						arr[i][j] = (char) (Math.random() * 26 + 65);
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}

				break;
			} else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}
		}

	}

	public void practice6() {
		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "!", "더", "!!" } };

		for (int j = 0; j < strArr[0].length; j++) {
			for (int i = 0; i < strArr.length; i++) {
				System.out.print(strArr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("행의 크기 : ");
		int num1 = sc.nextInt();
		sc.nextLine();

		char arr[][] = new char[num1][];

		for (int i = 0; i < num1; i++) {
			System.out.print(i + "열의 크기 : ");
			int num2 = sc.nextInt();
			sc.nextLine();

			arr[i] = new char[num2];
		}

		char value = 'a';
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
