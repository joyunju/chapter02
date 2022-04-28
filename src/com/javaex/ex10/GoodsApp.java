package com.javaex.ex10;

public class GoodsApp {
	//static 사전 조사 -->
	//Goods()클래스 필드에 public static int count; --> public Goods.count = 1;
	
	public static void main(String[] args) {

		Goods camera = new Goods("니콘", 400000);
		System.out.println(camera.toString());
		
		
		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(900000);
		System.out.println(computer.toString());
		
		//Goods computer = new Goods("LG그램", 900000);
		
		Goods cup = new Goods("머그컵", 2000);
		System.out.println(cup.toString());


		// 출력
		System.out.println("======출력======");
		System.out.println(Goods.count);
	}

}
