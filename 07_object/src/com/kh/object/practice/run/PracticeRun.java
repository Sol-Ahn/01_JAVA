package com.kh.object.practice.run;

import com.kh.object.practice.model.service.BookService;

public class PracticeRun {
	// + main(args : Stirng[]) : void
	// 클래스 다이어그램에서 및줄은 static을 의미
	public static void main(String[] args) {
		BookService service = new BookService();
		service.practice();
		
	}
	

}
