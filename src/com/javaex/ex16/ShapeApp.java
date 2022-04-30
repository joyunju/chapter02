package com.javaex.ex16;

public class ShapeApp {

	public static void main(String[] args) {
		
		//배열
		Shape[] sArray = new Shape[3];
		

		Shape s01 = new Shape("빨강", "노랑");
		
		Rectangle r01 = new Rectangle("빨강", "검정", 5, 5);
		System.out.println(r01.getWidth());  //자식의 메소드 사용가능 
		
		//메모리에는 다 올라가고 부모쪽만 보인다.
		Shape sr01 = new Rectangle("빨강", "검정", 15, 15);
		
	}

}
