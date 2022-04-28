package com.javaex.ex11;

public class Math {

	// 필드
	// private double pi = 3.14; --> 오류 나는 이유 ↓
	// static 메소드내는 static 멤버만 접근할 수 있다.
	private static double pi = 3.14;

	// 생성자
	public Math() {
		// default
	}

	// 메소드 - gs

	// 메소드 - 일반
	public static int plus(int a, int b) {

		return a + b;
		// int sum = a+b;
		// return = sum;
	}

	public static double plus(double a, double b) {
		return a + b;
	}

	public static double circleArea(int radius) {

		double area = pi * radius * radius;
		return area;
	}

}
