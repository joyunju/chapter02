package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {

		// 디폴트 생성자 사용
		Point p1 = new Point();
		// x, y 좌표에 접근할 수 있는 setter 메소드 작성
		p1.setX(5);
		p1.setY(5);

		Point p2 = new Point();
		p2.setX(10);
		p2.setY(23);

		Point p3 = new Point(10, 20);

		Point p4 = new Point(100);
		p4.setY(200);
		
		//y값을 먼저 넣고 
		//setter x 값을 넣는다.
		Point p5 = new Point(200); //y값넣고 싶어도 x값에 들어감

		// draw() 메소드를 호출하여 다음과 같이 출력하세요
		p1.draw();
		p2.draw();
		p3.draw();
		p4.draw();
		p5.draw();
		
		//메소드 오버로딩
		p1.draw(true); // 그렸습니다.
		p1.draw(false); // 지웠습니다.

	}

}
