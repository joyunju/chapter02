package com.javaex.ex07;

public class MathApp {

	public static void main(String[] args) {

		Math m1 = new Math();

		// m1.plus(int a, int b)
		m1.plus(3, 5); // 3+5
		// 출력
		System.out.println(m1.plus(3, 5));

		m1.plus(3.2, 5);

		m1.plus(5, 3.2);

		m1.plus(3.2, 5.1);

		// 출력
		System.out.println(m1.plus(3, 5));
		System.out.println(m1.plus(3.2, 5));
		System.out.println(m1.plus(5, 3.2));
		System.out.println(m1.plus(3.2, 5.1));

	}

}
