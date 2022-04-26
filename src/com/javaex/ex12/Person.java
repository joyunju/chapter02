package com.javaex.ex12;

public class Person {

	// 필드
	private String name; // private : 클래스 내부만
//	(default) String name; --> 기본 적용 
//	protected String name; --> protected : 클래스 내부, 동일패키지, 상속받은 클래스까지 허용
//	public String name; --> public : 접근 다 허용 
	private int age;

	// 생성자
	public Person() {
		// 디폴트 생성자
		System.out.println("Person()");
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("Person(2)");
	}

	// 메소드 - gs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 메소드 - 일반
	public void showInfo() {
		System.out.println("이름: " + name + ", 나이: " + age);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
