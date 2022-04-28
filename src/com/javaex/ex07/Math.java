package com.javaex.ex07;

public class Math {

	// 필드

	// 생성자
	public Math() { // 디폴트 생성자

	}

	// 메소드 - gs

	// 메소드 - 일반
	// 메소드 오버로딩
	// 장점 : 같은 이름의 메소드 사용 가능
	public int plus(int a, int b) { // 정수 + 정수
		
		//int sum = a+b;
		//return = sum;
		//위의 두줄을 한줄로 표현
		return a + b;
	}

	public double plus(double a, int b) { // 실수 + 정수
		return a + b;
	}

	public double plus(int a, double b) { // 정수 + 실수
		return a + b;
	}

	public double plus(double a, double b) { // 실수 + 실수
		return a + b;
	}

}
