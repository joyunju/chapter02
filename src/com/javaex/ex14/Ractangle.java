package com.javaex.ex14;

public class Ractangle {

	// 필드
	private String fillcolor;  // 빨강
	private String linecolor; // 검정
	private int width; //4
	private int height;  // 4

	// 생성자
	public Ractangle() {
		// default
	}

	public Ractangle(String fillcolor, String linecolor, int width, int height) {
		super();
		this.fillcolor = fillcolor;
		this.linecolor = linecolor;
		this.width = width;
		this.height = height;
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

	// 메소드 - 일반
	public void draw() {
		System.out.println(
				"[면색 : " + fillcolor + ", 선색 : " + linecolor +
				", 가로 : " + width + ", 세로 : " + height);
	}

	@Override
	public String toString() {
		return "Ractangle [fillcolor=" + fillcolor + ", linecolor=" + linecolor + ", width=" + width + ", height="
				+ height + "]";
	}

}
