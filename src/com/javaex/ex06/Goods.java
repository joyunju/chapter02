package com.javaex.ex06;

public class Goods {

	// 필드
	private String name;
	private int price;

	// 생성자

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
	//alt + shift + s > generate toString() 선택
	//mac : option + command + s > generate toString() 선택
	
	//애네가 정해준 값으로 출력해보는 것
	//html 만들기전, test 용 
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
