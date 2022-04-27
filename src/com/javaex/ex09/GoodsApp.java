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

		// 배열 예제
		// int[] intArray = new int[];
		// 배열
		// Goods[] 아파트에 goodsArray 이름을 정하고
		Goods[] goodsArray = new Goods[3];
		goodsArray[0] = camera; // 0X234 넣고 싶음 (그림상 5번)
		goodsArray[1] = computer;
		goodsArray[2] = cup;

		System.out.println(goodsArray[0].getName()); // 니콘
		System.out.println(goodsArray[2].getPrice()); // 2000 : 머그컵 가격
		System.out.println(goodsArray[1].toString());

		System.out.println("====배열로 출력====");
		goodsArray[0].showInfo();
		goodsArray[1].showInfo();
		goodsArray[2].showInfo();

		// 출력
		System.out.println("======출력======");
		camera.showInfo();
		computer.showInfo();
		cup.showInfo();

	}

}
