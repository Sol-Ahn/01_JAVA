package com.kh.poly.chap01.practice.model.vo;

public class ComicBook extends Book{
	private int accessAge;
	
	public ComicBook() {
		super(); // 미작성된 경우 JVM에 의해서 생성자 가장 상단에 컴파일 시 자동추가
	}


	public ComicBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		this.accessAge = accessAge;
	}


	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}

	@Override
	public String toString() {
		return "ComicBook [ " + super.toString() + ", accessAge = " + accessAge + "]";
	}
	
	
	
	
	
	
	
	
	
}
