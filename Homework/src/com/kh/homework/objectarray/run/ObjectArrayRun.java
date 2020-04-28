package com.kh.homework.objectarray.run;

import com.kh.homework.objectarraymodel.service.BookService;

public class ObjectArrayRun {
	public static void main(String[] args) {
		BookService service = new BookService();
//		service.searchBookV1();
		service.searchBookV2();
		
	}

}
