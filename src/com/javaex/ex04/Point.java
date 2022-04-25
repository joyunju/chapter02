package com.javaex.ex04;

public class Point {

	// 필드
	private int x;
	private int y;

	// 생성자
	// mac 단축키 : option + command + s > generate constructor using fields
	public Point() {

	}

	public Point(int x, int y) {
		// 메모리에 올리는 일
		this.x = x;
		this.y = y;
	}
	
	// 자료형이 같고 변수명만 다른 것은 구분 할 수 없음 
	public Point(int x) {
		this.x = x;
	}

//	public Point(int y) {
//		this.y = y;
//	}

	// 메서드 - gs
	// setter 메소드 작성
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	// getter 메소드 작성
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	// 메서드 - 일반
	// 다음 실행 결과를 참조하여 draw()메소드 작성
	public void draw() {
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}
}
