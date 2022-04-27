//ColorPoint 클래스의 부모 

package com.javaex.ex13;

public class Point {

	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {
		// default
	}

	// 메소드- gs
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 메소드 - 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public void showInfo() {
		System.out.println("int x: " + x + ", int y: " + y);
	}

}
