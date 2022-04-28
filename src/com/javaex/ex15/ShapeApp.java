package com.javaex.ex15;

import com.javaex.ex14.Rectangle;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s01 = new Shape("빨강", "노랑");
		//출력 확인
		System.out.println(s01.toString());
		//draw() 출력확인
		s01.draw();
		
		// 배열 생성
		Rectangle[] rArray = new Rectangle[2];
		
		//Rectangle r01= new Rectangle();
		Rectangle r01 = new Rectangle("빨강", "검정", 4, 6);
		Rectangle r02 = new Rectangle("파랑", "검정", 7, 7);
		
		// 배열에 사각형 추가하기
		rArray[0] = r01;
		rArray[1] = r02;
		
		// 배열을 이용해 전체 사각형 출력하기
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		//그리기 출력
		//r01.draw();
		//r02.draw();
		
		
		
		
		//System.out.println(r01.toString());
	}

}
 