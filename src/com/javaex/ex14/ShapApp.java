package com.javaex.ex14;

public class ShapApp {
	public static void main(String[] args) {
		
		Ractangle r01 = new Ractangle("빨강", "검정", 4, 4);
		//System.out.println(r01.toString());
		
		Ractangle r02 = new Ractangle("주황", "검정", 5, 5);
		//System.out.println(r02.toString());
		
		r01.draw();
		r02.draw();
		
	}
}
