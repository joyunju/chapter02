//필드에 private으로 설계

package com.javaex.ex03;

public class GoodsApp {

	public static void main(String[] args) {
		
		//camera
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		
		//computer
		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(900000);
		
		//cup
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		

		// 출력
		String cameraName = camera.getName();
		System.out.println(cameraName);
		
		//호출방법
		//자료형 + 변수명 = 레퍼런스변수.메소드명(메소드인자:파라미터);
		int cameraPrice = camera.getPrice();
		System.out.println(cameraPrice);
		
		//출력
		System.out.println("상품이름 : " + camera.getName() + ", 가격 : " + camera.getPrice());
		System.out.println("상품이름 : " + computer.getName() + ", 가격 : " + computer.getPrice());
		System.out.println("상품이름 : " + cup.getName() + ", 가격 : " + cup.getPrice());
		
		//showInfo()메소드를 이용하여 다음과 같이 출력하세요.
		System.out.println("=====showInfo()메소드로 출력=====");
		camera.showInfo();
		computer.showInfo();
		cup.showInfo();
	}

}
