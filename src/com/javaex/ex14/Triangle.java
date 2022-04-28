package com.javaex.ex14;

public class Triangle {

	// 필드
	private String fillcolor;
	private String linecolor;
	private int width;
	private int height;

	// 생성자
	public Triangle() {
		// default
	}

	public Triangle(String fillcolor, String linecolor, int width, int height) {
		super();
		this.fillcolor = fillcolor;
		this.linecolor = linecolor;
		this.width = width;
		this.height = height;
	}

	// 메서드 - gs
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

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// 메서드 - 일반
	public void draw() {
		System.out.println("[면색 : " + fillcolor + ", 선색 : " + linecolor + ", 가로 : " + width + ", 세로 : " + height
				+ "] 삼각형을 그렸습니다.");
	}

	@Override
	public String toString() {
		return "Triangle [fillcolor=" + fillcolor + ", linecolor=" + linecolor + ", width=" + width + ", height="
				+ height + "]";
	}
}
