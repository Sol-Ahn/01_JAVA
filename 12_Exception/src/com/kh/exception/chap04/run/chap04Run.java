package com.kh.exception.chap04.run;

import com.kh.exception.chap04.model.service.UserService;

public class chap04Run {
	public static void main(String[] args) {
		UserService service = new UserService();
		service.method1();
		// UserService 객체에 있는 method1() 호출
		// 오예 // push 진행
	}
}
