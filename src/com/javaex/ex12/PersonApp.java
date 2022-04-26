package com.javaex.ex12;

public class PersonApp {

	public static void main(String[] args) {

		Person p01 = new Person("완두콩", 22);
		// System.out.println(p01);
		p01.showInfo();

		// Student s01 = new Student("서울고등학교");
		// System.out.println(s01.toString());

		// 작동 순서 부모인 Person() 완료 후, -> Student()
		Student s02 = new Student();
		// s02.get 까지 작성해보면 부모의 Person까지 상속 받을 수 있음 확인 가능
		s02.setName("완두콩");
		s02.setAge(22);
		s02.setSchollName("서울고등학교");
		// 출력 확인
		System.out.println(s02.toString());

		// 작동 생성자 --> Person() 후, Student(1)
		Student s03 = new Student("서울고등학교");
		s03.showInfo();

		// 부모에게 상속받은 것까지 포함한 생성자를 만들어줘야 쓸 수있음
		// 작동 순서 부모인 Person(2) 완료 후, -> Student(3)
		Student s04 = new Student("완두콩", 22, "서울고등학교");

		System.out.println(s04.getName());
		System.out.println(s04.toString()); // 부모쪽 toString() 사용
		// 자식 클래스에 부모와 같은 toString()이 있다면 자식 쪽 메소드출력 사용
		s04.showInfo();
	}

}
