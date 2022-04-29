//예외처리

package com.javaex.ex19;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double result;
		int num;

		num = sc.nextInt();
		// 0 입력해보기

		// result = 100 / num; // java.lang.ArithmeticException 발생

		// 에러 발생 이유 : 정수는 0으로 나눌 수 없기 때문에 에러 발생
		// 해결 방법 : try catch문 사용

		// 예외 발생시 ↓ 여기로 넘어와 실행
		try {
			result = 100 / num; // 예외 상황 발생
			System.out.println(result);
		} catch (ArithmeticException e) { // 예외 발생시 catch해서 실행 / e : 변수명
		//catch (처리할 예외 타입 선언 e)
			System.out.println("0욿 나눌 수 없습니다.");
		} finally {
			System.out.println("finally 영역 : 예외처리가 끝났습니다.");
			System.out.println("오류가 발생 여부와 상관없이 무조건 실행되는 문장 (생략 가능)");
		}

		// 예외 발생하지 않으면 ↓ 여기로 넘어와 실행
		// System.out.println(result); // 예외 발생으로 수행되지 않음

		sc.close();

	}

}
