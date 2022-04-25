package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		//x, y 좌표에 접근할 수 있는 setter 메소드 작성
		p1.setX(5);
		p1.setY(5);
		
		Point p2 = new Point();
		p2.setX(10);
		p2.setY(23);
		
		
		//draw() 메소드를 호출하여 다음과 같이 출력하세요
		p1.draw();
		p2.draw();
		

	}

}
