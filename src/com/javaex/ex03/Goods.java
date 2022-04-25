//메소드 문법 배우기 

package com.javaex.ex03;

public class Goods {

	// 필드
	private String name;
	private int price;

	// 생성자

	// 메소드 - gs
	// 겟터세터 자동생성 단축키 : alt + shift + s
	// source > Generate Getters and Setters 
	//mac : option command 랑 s 동시에 누른 후, Generate Getters and Settes선택 
	
	public void setName(String name) {
		// void -> 리턴타입이 없을 때 사용
		// 실제 움직여야 할 기능
		this.name = name;
	}

	public void setPrice(int price) {
		// 코드 추가 가능
		//조건문을 사용해서 가격 오류 잡을 수 있음
		if (price < 0) {
			this.price = 0;
		} else {
			this.price = price;
		}

		//this.price = price;
	}

	// 결과값을 밖으로 보내야하는 것 --> 리턴
	// 리턴 사용시 name 에 들어갈 자료형을 2번자리에 리턴타입인 String 작성
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	// 메소드 - 일반
	// 메모리를 보고 스토리를 작성한다.
	// 접근 가능해야하니까 public, 리턴 없으니까 void
	public void showInfo() {
		System.out.println("상품이름 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("");
	}

}
