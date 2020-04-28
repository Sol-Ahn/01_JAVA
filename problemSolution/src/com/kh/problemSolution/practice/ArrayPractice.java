package com.kh.problemSolution.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
		
	}
	
	public void practice2() {
		int arr[] = new int[10];
		
		for(int i = 10; i > 0; i--) {
			arr[arr.length-i] = i; 
		}
		
		for(int i =0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		int arr2[];
		System.out.print("양의 정수 : ");
		int size = sc.nextInt();
		sc.nextLine();
		
		arr2 = new int[size];
		
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = i+1;
		}
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
	}
	
	public void practice4() {
		String arr4[] = {"사과", "귤", "포도", "복숭아", "참외"};
		
		
			System.out.print(arr4[1]);
		
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String input = sc.nextLine();
		
		char cArr[] = new char[input.length()];
			
		for(int i = 0; i < cArr.length; i++) {
			cArr[i] = input.charAt(i);
	
		}
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.print(input + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		
		int count = 0;
		for(int i = 0; i < cArr.length; i++) {
			if(cArr[i] == ch) {
				System.out.print(i+ " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(ch + " 개수 : " + count);
		
	}
	
	public void practice6() {
		
		String day[] = {"월", "화", "수", "목", "금", "토", "일"};
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int input = sc.nextInt();
		sc.nextLine();
		if(input >= 0 && input <= 6) {
		System.out.println(day[input] + "요일");
		
	}else {
		System.out.println("잘못 입력하셨습니다.");
	}
	
}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		int arr7[] = new int[input];
		
		for(int i = 0; i < arr7.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr7[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for(int i = 0; i < arr7.length; i++) {
			System.out.print(arr7[i] + " ");
			sum +=  arr7[i];
		}
		
		System.out.println();
		
		System.out.println("총 합 : " + sum);
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		int arr8[] = new int[input];
		
		int count =1;
		
		if(input >= 3 && input % 2 == 1) {
			
			/*for(int i = 0; i < count; i++) {
				System.out.print(i);
			}
			
			for(int i = 0; i < count; i--) {
				System.out.print(i);
			}*/
			
		 for(int i = 0; i < arr8.length; i++) {
			 arr8[i] = count;
			 
			 if(i < arr8.length/2) {
				 count++;
			 }else {
				 count--;
			 }
		 }
		 System.out.println(Arrays.toString(arr8));
		}else {
			System.out.println("다시 입력하세요.");
		}
		
		
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String input = sc.nextLine();
		
		String chicken[] = {"처갓집" , "굽네", "멕시카나", "둘둘", "교촌"}; 
		
		boolean flag = true;
		
		for(int i = 0; i < chicken.length; i++) {
			if(chicken[i].equals(input)) {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println(input + "치킨은 없는 메뉴입니다.");
		}else {
			System.out.println(input + "치킨 배달 가능");
			
		}
		
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String num = sc.nextLine();
		
		char arr10[] = new char[num.length()];
		for(int i = 0; i < arr10.length; i++) {
			arr10[i] = num.charAt(i);
			
			
		}
		
		char arr11[] = new char[arr10.length];
		
		for(int i = 0; i < arr10.length; i++) {
			
			if(i<8) {
				arr11[i] = arr10[i];
			}else {
				arr11[i] = '*';
			}
			
			System.out.print(arr11[i]);
		}
		
		
	}
	
	
	
	public void practice11() {
		
		int answer[] = new int[10];
		
		for(int i=0; i<answer.length; i++) {
			double ran = Math.random()*10;
			answer[i] = (int)ran;
		}
		
		System.out.print(Arrays.toString(answer));
		
		
	} // practice11 End
	
	public void practice12() {
		int arr12[] = new int[10];
		
		for(int i = 0; i < arr12.length; i++) {
			double ran = Math.random()*10+1;
			arr12[i] = (int)ran;
		}
		
		int min = 10;
		int max = 1;
		
		for(int i = 0; i < arr12.length; i++) {
			
			if(arr12[i] < min) {
				min = arr12[i];
			}
			
			if(arr12[i] > max) {
				max = arr12[i];
			}
			
			System.out.print(arr12[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
	
	public void practice13() {
		int arr13[] = new int[10];
		
		for(int i = 0; i < arr13.length; i++) {
			double ran = Math.random()*10+1;
			arr13[i] = (int)ran;
			
			for(int j = 0; j < i; j++) {
				if(arr13[i] == arr13[j]) {
					i--;
					break;
				}
				
		}
		
		}
		
		System.out.println(Arrays.toString(arr13));
	}
	
	public void practice14() {
		int lotto[] = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			double ran = Math.random() * 45 + 1;
			lotto[i] = (int)ran;
			
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			
		}
		
		for(int i = 1; i < lotto.length; i++) {
			for(int j = 0; j < i; j++) {
				if(lotto[i] < lotto[j]) {
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
					
					
				}
				
			}
		}
		
		System.out.print(Arrays.toString(lotto));
		
	}
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		char[] arr15 = new char[input.length()];  
		
		for(int i = 0; i < arr15.length; i++) {
			arr15[i] = input.charAt(i);
		}
		
		int count = 0;
		
		System.out.print("문자열에 있는 문자 : ");
		
		for(int i = 0; i < arr15.length; i++) {
			
			boolean flag = true;
			
			for(int j = 0; j < i; j++) {
				if(arr15[i] == arr15[j]) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				if(i == 0) {
					System.out.print(arr15[i]);
				}else {
					System.out.print(", " + arr15[i]);
				}
				
				count++;
			}
			
		}
		System.out.println();
		System.out.println("문자 개수 : " + count);
		
	}
	
	
	
	public void practice16() {
			Scanner sc = new Scanner(System.in);
			System.out.print("배열의 크기를 입력하세요. : ");
			int size = sc.nextInt();
			sc.nextLine();
			
			String[] arr = new String[size];
			
			for(int i = 0; i < arr.length; i++) {
				System.out.print((i+1) + "번째 문자열 : "      );
				arr[i] =sc.nextLine();
			}
			
			
			while(true) {
				System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
				char ch = sc.nextLine().charAt(0);
				
					if(ch == 'Y'|| ch == 'y') {
						System.out.print("더 입력하고 싶은 개수 : ");
						int size2 = sc.nextInt();
						sc.nextLine();
		
						String[] newArr = new String[arr.length + size2];
						
						for(int i = 0; i < newArr.length; i++) {
							if( i < arr.length) {
								newArr[i] = arr[i];
							}else {
								System.out.print(i+1 + "번째 문자열 : ");
								newArr[i] = sc.nextLine();
							}
							
						}
						arr = newArr;
						
		}else if(ch == 'N' || ch == 'n') {
			break;
		}else {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
		
	} 
			System.out.println(Arrays.toString(arr));
			
		}
	
	}


