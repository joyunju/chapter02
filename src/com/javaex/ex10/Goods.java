package com.javaex.ex10;

public class Goods {

	// 필드
	private String name;
	private int price;
	// 스태틱 영영에서 관리해야함 : private int count = 1;
	public static int count; // static 메모리에 올라간다
	// static 메소드에서는 this 사용 불가

	// 생성자
	public Goods() {
		// 메모리에 올리는 일
		// 로직
		this.count = count + 1;
	}

	public Goods(String name, int price) {
		// 메모리에 올리는 일(클래스를 인스턴스화)
		// 추가로직
		this.name = name;
		this.price = price;
		this.count = count + 1;
	}

	// 메소드 - gs
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getCount() {
		return count;
	}

	// 메소드 - 일반
	public void showInfo() {
		System.out.println("상품이름 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("");
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", count=" + count + "]";
	}

}
