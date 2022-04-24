//필드에 private으로 설계

package com.javaex.ex03;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();

		camera.setName("니콘");
		camera.setPrice(400000);

		// 출력
		String cameraName = camera.getName();
		System.out.println(cameraName);
		
		//호출방법
		//자료형 + 변수명 = 레퍼런스변수.메소드명(메소드인자:파라미터);
		int cameraPrice = camera.getPrice();
		System.out.println(cameraPrice);
		
		System.out.println("상품이름 : " + camera.getName() + ", 가격 : " + camera.getPrice());

	}

}
