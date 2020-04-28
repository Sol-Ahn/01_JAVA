package com.kh.poly.chap01.practice.view;

import java.util.Scanner;

import com.kh.poly.chap01.practice.model.service.LibraryService;
import com.kh.poly.chap01.practice.model.vo.Book;
import com.kh.poly.chap01.practice.model.vo.Member;

public class LibraryMenu {
	private Scanner sc = new Scanner(System.in);
	
	private LibraryService service = new LibraryService();
	
	
	public void mainMenu() { // 메인 메뉴 출력 메소드
		System.out.print("이름 : ");
		String name = sc.next(); // 입력되는 다음 한 단어(공백 문자 이전까지 읽어들임.)
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0); // sc.Next()는 버퍼에 남아있는 개행문자를 무시하고 다음 단어를 읽어들임.
		
		Member m = new Member(name, age, gender);
		service.insertMember(m);
		
		
		
		int input = 0;
		
		/* do {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.println("메뉴 번호 : ");
			input = sc.nextInt();
			
			switch(input) {
			case 1 : break; 
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 9 : System.out.println("프로그램을 종료합니다.");break;
			default : System.out.println("잘못 입력하셨습니다.");
			
			}
			
		}while(input != 9); */
		
		while(true) {
			System.out.print("==== 메뉴 ====\n"
							  + "1. 마이페이지 \n"
							  + "2. 도서 전체 조회 \n"
							  + "3. 도서 검색\n"
							  + "4. 도서 대여하기 \n"
							  + "9. 프로그램 종료하기 \n"
							  + "메뉴 번호 : ");
			
			input = sc.nextInt();
			sc.nextLine();
			
			switch(input) {
			case 1 : System.out.println(service.myInfo()); break;
			case 2 : selectAll(); break;
			case 3 : searchBook(); break;
			case 4 : rentBook(); break;
			case 9 : System.out.println("프로그램을 종료하세요."); return; // return : 호출한 메소드로 반환(돌아가라)
																	// void 메소드는 "반환값"은 없음!	
																	// JVM이 컴파일 시 void 메소드 가장 마지막에 return을 자동추가
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;				    
			
			}
		}
	}
	
	public void selectAll() { // 도서 전체 목록 출력 메소드
		Book[] bList = service.selecAll();
		for(int i = 0; i < bList.length; i++) {
			System.out.println(i + "번 도서 : " + bList[i]); // 참조변수를 출력(print)할 때는 자동으로, toString()이 JVM에 의해서 추가됨.
		}
	}
	
	public void searchBook() { // 검색할 제목 키워드를 입력받아 검색 결과를 출력하는 메소드
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		
		Book[] searchList = service.searchBook(keyword);
		
		for(int i = 0; i < searchList.length; i++) {
			if(searchList[i] == null) {
				break;
			}
			System.out.println(searchList[i]);
		}
		
	}

	public void rentBook() { // 대여할 도서 인덱스를 입력받아 LibraryService의 rentBook 메소드로 전달
		selectAll();
		
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		sc.nextLine();
		
		int result = service.rentBook(index);
		
		if(result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		}else if(result == 1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		}else {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
		}
		
	}
	
}
