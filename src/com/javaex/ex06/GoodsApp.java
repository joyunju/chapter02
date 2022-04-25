package com.javaex.ex06;

public class GoodsApp {
	public static void main(String[] args) {

		Goods computer = new Goods("LG그램", 900000);

		// computer
		// Goods computer = new Goods();
		// computer.setName("LG그램");
		// computer.setPrice(900000);

		// camera
		// Goods camera = new Goods();
		// camera.setName("니콘");
		Goods camera = new Goods("니콘");
		camera.setPrice(400000);

		// cup
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);

		// 하나씩 출력하는 방법
		System.out.println(computer.getName());

		// toString으로 바로 확인하는 방법 --> test용
		System.out.println(computer.toString());
		System.out.println(camera.toString());
		System.out.println(cup.toString());

		System.out.println("");
		System.out.println("====showInfo()====");
		// 만들어지고 난 후, showInfo()
		computer.showInfo();
		camera.showInfo();
		cup.showInfo();

	}
}
