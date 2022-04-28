package com.javaex.ex14;

public class Rectangle {

	// 필드
	private String fillColor; // 빨강
	private String lineColor; // 검정
	private int width; // 4
	private int height; // 4

	// 생성자
	public Rectangle() {
		// default
	}

	public Rectangle(String fillColor, String lineColor, int width, int height) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		this.width = width;
		this.height = height;
	}

	// 메소드 - gs
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
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
		System.out.println("[면색 : " + fillColor + ", 선색 : " + lineColor + ", 가로 : " + width + ", 세로 : " + height
				+ "] 사각형을 그렸습니다.");
	}

	@Override
	public String toString() {
		return "Ractangle [fillcolor=" + fillColor + ", linecolor=" + lineColor + ", width=" + width + ", height="
				+ height + "]";
	}

}
