package com.javaex.ex15;

public class Rectangle extends Shape {

	// 필드
	private int width;
	private int height;

	// 생성자
	public Rectangle() {
		super(); // --> public Shape(); 작동
		// System.out.println("Rectangle()");
	}

	public Rectangle(String fillColor, String lineColor, int width, int height) {
		// super();
		super(fillColor, lineColor);
		// ↑ 이렇게 쓰는게 부모 생성자에 if문 등 복잡해질 때 더 좋음
		// super.fillColor = fillColor; // 필드 private라 안됨 , protected는 가능
		this.width = width;
		this.height = height;
		// System.out.println("Rectangle(4)");
	}

	// 메소드 - gs
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
		System.out.println("[면색:" + super.fillColor + ", 선색:" + super.getLineColor() + ", 가로:" + this.width + ", 세로:"
				+ this.height + "] 사각형을 그렸습니다. ");
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", fillColor=" + super.fillColor
				+ ", getLineColor()=" + super.getLineColor() + "]";
	}
	// fillColor --> Shape 클래스 필드 값이 protected String fillColor;
	// getLineColor --> Shape 클래스 필드 값이 private String lineColor;

}