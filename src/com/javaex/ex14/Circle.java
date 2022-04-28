//
package com.javaex.ex14;

public class Circle {

	// 필드
	private String fillcolor;
	private String linecolor;
	private int radius;

	// 생성자
	public Circle() {
		// default
	}

	public Circle(String fillcolor, String linecolor, int radius) {
		super();
		this.fillcolor = fillcolor;
		this.linecolor = linecolor;
		this.radius = radius;
	}

	// 메소드 - gs
	public String getFillcolor() {
		return fillcolor;
	}

	public void setFillcolor(String fillcolor) {
		this.fillcolor = fillcolor;
	}

	public String getLinecolor() {
		return linecolor;
	}

	public void setLinecolor(String linecolor) {
		this.linecolor = linecolor;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	

	// 메소드 - 일반
	public void draw() {
		System.out.println(
				"[면색 : " + fillcolor + ", 선색 : " + linecolor +
				", 반지름 : " + radius + "] 원을 그렸습니다."
				);
	}
	
	
	
	@Override
	public String toString() {
		return "Circle [fillcolor=" + fillcolor + ", linecolor=" + linecolor + ", radius=" + radius + "]";
	}

}
