package com.kh.practice.model.service;

import com.kh.practice.model.vo.Student;

public class PracticeService {
	
	private Student[] list = new Student[3]; 
	// Student 객체 참조 변수 3개를 저장 할 수 있는 객체배열 선언
	private int size = 0; // 객체배열의 인덱스 및 현재 저장된 요소 수 관리용 변수
	
	public boolean addStudent(Student std) {
		// 매개변수로 전달받은 Student객체 std를 객체 배열에 추가하는 메소드
		
		// 학생 추가에 성공한 경우 true, 예외 발생 시 false 반환
		
		try {
			// 학생을 추가할 때 배열의 최대크기를 넘어서면
			// 기존 배열의 크기 보다 2배 큰 배열을 새로 만들어서 깊은 복사 후
			// list 참조변수에 새로운 배열의 주소를 저장하여 학생 추가 진행.
			
			if(size < list.length) {
			list[size++] = std; // 현재 size가 가리키는 인덱스에 std를 저장
			}else {
				Student[] newArr = new Student[list.length * 2]; // 현재 list 배열의 2배 크기되는 배열 생성
				System.arraycopy(list, 0, newArr, 0, list.length);
				list = newArr;
				
				list[size++] = std;
			}
			
			
			
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public Student[] selectAllStudent() { // 객체 배열에 저장된 모든 데이터 반환
		return list;
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
		if(index >= 0 && index < list.length) {
			
			// 2) 삭제된 학생 정보 반환
			// -> 삭제 전 별도의 변수에 저장
			std = list[index];
			
			// 3) 배열에서 해당 인덱스에 위치하는 학생 정보 삭제
			// + 삭제 인덱스 이후에 존재하는 값을 앞으로 당기기
			for(int i = index; i < list.length-1; i++) {
								// 배열의 끝에서 앞에 있는 인덱스까지만 당기려면 -1
				list[i] = list[i+1]; // 현재 인덱스에 다음 인덱스 값으로 덮어쓰기
				
			// 입력된 값의 마지막 위치까지 당겨왔다면 for문을 멈춤
				if(list[i] == null) {
					break;
				}
				
			}
		
			// 4) 다음 학생 추가 시 배열 중간이 비는 것을 방지하기 위해 size도 같이 감소
			size--;
		} 
		
		return std;

	}
	
}
