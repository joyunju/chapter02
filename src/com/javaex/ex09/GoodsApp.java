package com.javaex.ex09;

public class GoodsApp {

	public static void main(String[] args) {

		// camera
		// Goods camera = new Goods();
		// camera.setName("니콘");
		// camera.setPrice(400000);

		Goods camera = new Goods("니콘", 400000);
		Goods computer = new Goods("LG그램", 900000);
		Goods cup = new Goods("머그컵", 2000);

		// 출력
		camera.showInfo();
		computer.showInfo();
		cup.showInfo();
	}

}
