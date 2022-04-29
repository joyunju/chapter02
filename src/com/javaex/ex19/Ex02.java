// 예외 처리
// ArrayIndexOutOfBoundsException : 배열을 참조하는 인덱스가 잘못된 경우

package com.javaex.ex19;

public class Ex02 {

	public static void main(String[] args) {

		// int[] intArray = new int[]{3,6,9};
		int[] intArray = new int[3];
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;

		try {
			System.out.println(intArray[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// System.out.println(e.getMessage());
			System.out.println("배열의 범위를 벗어남");
		} finally {
			// 생략 가능
		}

		// System.out.println(intArray[3]);
		// 인덱스 배열이 [0], [1], [2] 까지 있는데 [3] 호출해서 에러 발생
		// 예외 클래스 명 : ArrayIndexOutOfBoundsException
		
		
		for(int i =0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

}
