package com.javaex.ex14;

public class ShapApp {
	public static void main(String[] args) {

		// 배열 생성
		Ractangle[] rArray = new Ractangle[2];
		Circle[] cArray = new Circle[2];
		Triangle[] tArray = new Triangle[2];

		// 사각형 생성
		Ractangle r01 = new Ractangle("빨강", "검정", 4, 4);
		// System.out.println(r01.toString());
		Ractangle r02 = new Ractangle("주황", "검정", 5, 5);
		// System.out.println(r02.toString());

		// 배열에 사각형 추가하기
		rArray[0] = r01;
		rArray[1] = r02;

		// 배열을 이용해 전체 사각형 출력하기
		for (int i = 0; i < rArray.length; i++) {
			rArray[i].draw();
		}

		// 원 생성
		Circle c01 = new Circle("보라", "빨강", 3);
		Circle c02 = new Circle("보라", "검정", 3);
		// 출력 확인용
		// System.out.println(c02.toString());

		// 배열에 원 추가하기
		cArray[0] = c01;
		cArray[1] = c02;

		// 배열을 이용해 전체 원 출력하기
		for (int i = 0; i < cArray.length; i++) {
			cArray[i].draw();
		}

		// 삼각형 생성
		Triangle t01 = new Triangle("빨강", "검정", 4, 4);
		Triangle t02 = new Triangle("보라", "검정", 10, 10);

		// 배열에 삼각형 추가하기
		tArray[0] = t01;
		tArray[1] = t02;

		// 배열을 이용해 전체 삼각형 추가하기
		for (int i = 0; i < tArray.length; i++) {
			tArray[i].draw();
		}

		// 출력
		// r01.draw();
		// r02.draw();

	}
}
