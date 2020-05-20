package com.kh.collection.list.part2.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.collection.list.part2.model.vo.Student;

public class PracticeService {
	
	private List<Student> list = new ArrayList<Student>(); // 다형성 적용
	// Student 객체 (객체 참조 변수)를 저장할 수 있는 ArrayList를 할당 받아
	// 그 주소를 list에 저장
	// + ArrayList 생성 시 기본생성자를 사용하면 기본 10칸이 할당됨.
	
	public boolean addStudent(Student std) {
		return list.add(std);
	}
	
	public List<Student> selectAllStudent() { 
		return list; // 실제로는 ArrayList의 값을 반환
	}
	
	
	public Student removeStudent(int index) { 
		// 매개변수로 전달받은 인덱스의 Student객체를 삭제하고
		// 삭제된 학생 정보를 반환.
		// 배열 중간에 위치한 학생이 삭제 된 경우 
		// 배열 사이에 공백이 없도록 뒤쪽에 존재하는 학생들을 당겨주기 
		// ex) 배열에  a, b, c, d가 저장되어 있다.
		//      b 학생 삭제 시
		// 	    a, null, c, d 가 아닌
		//		a, c, d, null 형태로 배열이 형성되어야 함. -> 덮어쓰기
		
		Student std = null; // 삭제되는 학생의 정보를 저장할 변수
		
		// 1) 전달받은 index의 값이 배열 범위 내에 있는 값인가?
		// 배열의 인덱스는 0부터 시작
		if(index >= 0 && index < list.size()) {
			// 2) 삭제된 학생 정보 반환
			// -> 삭제 전 별도의 변수에 저장
			std = list.remove(index);
		} 
		
		return std;

	}
	
}
