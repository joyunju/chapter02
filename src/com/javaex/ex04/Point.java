package com.javaex.ex04;

public class Point {
	
	//필드
	private int x;
	private int y;
	
	//생성자
	
	//메서드 - gs
	//setter 메소드 작성
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//getter 메소드 작성
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	
	//메서드 - 일반
	//다음 실행 결과를 참조하여 draw()메소드 작성
	public void draw() {
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}
}
