//Point 클래스의 자식

package com.javaex.ex13;

public class ColorPoint extends Point {

	// 필드
	private String color;

	// 생성자
	public ColorPoint() {
		// default
		System.out.println("ColorPoint()");
	}

	public ColorPoint(String color) {
		this.color = color;
		System.out.println("ColorPoint(1)");
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y); // <-- 부모에 있는것 상속 받는 것
		this.color = color;
		//
		System.out.println("ColorPoint(3)");
	}
	

	// 메소드- gs
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// 메소드 - 일반
	@Override
	public String toString() {
		return "ColorPoint [color=" + color + "]";
	}
	
	public void showInfo() {
		// 부모 toString() 그대로 사용
		// super.toString();
		System.out.println(super.toString()); // 이건 부모 toString()
		System.out.println(this.toString()); // 이건 본인 toString()
	}
}
