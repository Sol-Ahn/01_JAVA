package com.kh.homework.objectarraymodel.service;

import java.util.Scanner;

import com.kh.homework.objectarraymodel.vo.Book;

public class BookService {
	private Scanner sc = new Scanner(System.in);
	
	public void searchBookV1() {
		Book book1 = new Book("자바의 정석", 30000, 0.2, "남궁 성");
		Book book2 = new Book("C언어의 정석", 50000, 0.1, "김철수");
		Book book3 = new Book("와 자바 재밌다", 100000, 0.05, "백동현");
		Book book4 = new Book("어린왕자", 10000, 0.1, "생택쥐베리");
		Book book5 = new Book("해리포터", 12000, 0.3, "조앤K롤링");
		
		System.out.print("검색할 책 제목을 입력하세요 : ");
		String title = sc.nextLine();
		
		if(book1.getTitle().equals(title)) {
			System.out.println(book1.selectBook());
		}else if(book2.getTitle().equals(title)) {
			System.out.println(book2.selectBook());
		}else if(book3.getTitle().equals(title)) {
			System.out.println(book3.selectBook());
		}else if(book4.getTitle().equals(title)) {
			System.out.println(book4.selectBook());
		}else if(book5.getTitle().equals(title)) {
			System.out.println(book5.selectBook());
		}else {
			System.out.println("해당하는 책이 없습니다.");
		}
		
	}
	
	public void searchBookV2() {
		
		// Book[] books = new Book[5];
		/* Book book1 = new Book("자바의 정석", 30000, 0.2, "남궁 성");
		Book book2 = new Book("C언어의 정석", 50000, 0.1, "김철수");
		Book book3 = new Book("와 자바 재밌다", 100000, 0.05, "백동현");
		Book book4 = new Book("어린왕자", 10000, 0.1, "생택쥐베리");
		Book book5 = new Book("해리포터", 12000, 0.3, "조앤K롤링"); */
		
		/* books[0] = new Book("자바의 정석", 30000, 0.2, "남궁 성");
		books[1] = new Book("C언어의 정석", 50000, 0.1, "김철수");
		books[2] = new Book("와 자바 재밌다", 100000, 0.05, "백동현");
		books[3] = new Book("어린왕자", 10000, 0.1, "생택쥐베리");
		books[4] = new Book("해리포터", 12000, 0.3, "조앤K롤링"); */
		
		Book[] books = {
				new Book("자바의 정석", 30000, 0.2, "남궁 성"),
				new Book("C언어의 정석", 50000, 0.1, "김철수"),
				new Book("와 자바 재밌다", 100000, 0.05, "백동현"),
				new Book("어린왕자", 10000, 0.1, "생택쥐베리"),
				new Book("해리포터", 12000, 0.3, "조앤K롤링")
		        };
		
		
		System.out.print("검색할 책 제목을 입력하세요 : ");
		String title = sc.nextLine();
		
		boolean flag = true;
		
		for(int i = 0; i < books.length; i++) {
			if(books[i].getTitle().equals(title)) {
				System.out.println(books[i].selectBook());
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("해당하는 책이 없습니다.");
		}
		
	}
	
	
}
