package com.javaex.ex06;

public class Goods {

	// 필드
	private String name;
	private int price;

	// 생성자
	// **생성자의 이름은 클래스(파일명)와 같아야 한다.
	public Goods() { // 기본 생성자 (디폴트 생성자
		// 초기화 코드
		// ***메모리에 올리는 일
		// 로직 작성 가능
		// 메모리에 올리고 Goods()한번씩 작성해라 로직 추가
		System.out.println("Goods()");
	}

	public Goods(String name) {
		this.name = name;
		System.out.println("Goods(1)");
	}

	// Goods("LG그램", 900000); 이런 모양 만들고 싶으니까
	public Goods(String name, int price) {
		// ***메모리에 올리는 일
		// 추가 로직
		this.name = name;
		this.price = price;
		System.out.println("Goods(2)");
	}

	// 메소드 - gs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 메소드 - 일반 html(2일)
	// alt + shift + s > generate toString() 선택
	// mac : option + command + s > generate toString() 선택

	// 애네가 정해준 값으로 출력해보는 것
	// html 만들기전, test 용
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}

	public void showInfo() {
		System.out.println("상품이름 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("");
	}

}
