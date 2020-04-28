package com.kh.poly.chap01.practice.model.service;

import com.kh.poly.chap01.practice.model.vo.Book;
import com.kh.poly.chap01.practice.model.vo.ComicBook;
import com.kh.poly.chap01.practice.model.vo.CookBook;
import com.kh.poly.chap01.practice.model.vo.Member;

public class LibraryService {
	private Member mem = null;
	
	private Book[] bList = new Book[5];
	
	public LibraryService() {
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new ComicBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new ComicBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
		
	}
	
	public void insertMember(Member mem) { // 전달받은 mem 주소값을 통해 LibraryService의 필드 mem에 대입
		this.mem = mem;
	}
	
	public Member myInfo() { // 레퍼런스(mem) 주소값 리턴
		return mem;
	}
	
	
	public Book[] selecAll() { // 도서 전체 목록 (bList) 주소값 리턴
		return bList;
	}

	
	public Book[] searchBook(String keyword) {
		Book[] searchList = new Book[bList.length];
		
		int count = 0;
		for(int i = 0; i < bList.length; i++) {
			if(bList[i].getTitle().contains(keyword)) {
				searchList[count++] = bList[i];
				// count++;
			}
			
		}
		
		return searchList;
		
	}
		
	public int rentBook(int index) {
		int result = 0;
		
		if(bList[index] instanceof ComicBook) {
			if(((ComicBook)bList[index]).getAccessAge() > mem.getAge()){
				result = 1;
			}
		}else if(bList[index] instanceof CookBook) {
			if(((CookBook)bList[index]).isCoupon()) {
				mem.setCouponCount(mem.getCouponCount() + 1);
				result = 2;
			}
		}
		return result;
	}
	
	
	
}
