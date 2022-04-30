// 하나하나 만드는 건 추상화
// 공통된 것을 만드는 건 일반화

// 이 파일이 일반화 --> public class Rectangle 의 부모가 될 클래스 

package com.javaex.ex16;

public class Shape {

	// 필드
	protected String fillColor; //--> 자기 자식은 같이 써도 된다. 
	//private String fillColor;
	private String lineColor;

	// 생성자
	public Shape() {
		// System.out.println("Shape()");
	}

	public Shape(String fillColor, String lineColor) {
		//super();
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		//System.out.println("Shape(파라미터 2개)");
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

	// 메소드 - 일반
	public void draw() {
		System.out.println("[면색 : " + fillColor + ", 선색 : " + lineColor + "] 도형을 그렸습니다.");
	}

	@Override
	public String toString() {
		return "Shape [fillcolor=" + fillColor + ", linecolor=" + lineColor + "]";
	}
}
