// Person 클래스를 상속받아 Student 클래스 만들기

package com.javaex.ex12;

public class Student extends Person {
	// extends Person --> 이거 추가시 Person 클래스가 부모가 되어 상속 받을 수 있음

	// 필드
	private String schollName;

	// 생성자
	public Student() {
		System.out.println("Student()");
	}

	public Student(String schollName) {
		this.schollName = schollName;
		// 파라미터 1개짜기 --> 동작 보려고 프린트 넣음
		System.out.println("Student(1)");
	}

	// super() 알기 11:30분 수업 내용
	// super 키워드는 부모 클래스로부터 상속받은 필드나 메소드를
	// ㄴ 자식 클래스에서 참조하는 데 사용하는 참조 변수
	public Student(String name, int age, String schollName) {
		super(name, age); // <-- 부모에 있는것 상속 받는 것 
		this.schollName = schollName;
		//
		System.out.println("Student(3)");
	}

	// 메소드 - gs
	public String getSchollName() {
		return schollName;
	}

	public void setSchollName(String schollName) {
		this.schollName = schollName;
	}

	// 메소드 - 일반

	@Override
	public String toString() {
		return "Student [schollName=" + schollName + "]";
	}

}
