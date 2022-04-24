//메모리를 움직여주는 것은 main() 메소드가 필요

package com.javaex.ex01;

public class GoodsApp {
	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.name = "니콘";
		camera.price = 400000;
		
		System.out.println(camera.name);
		System.out.println(camera.price);
	}
}
