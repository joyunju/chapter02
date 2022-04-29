// 예외처리
// NullPointerException : 문자열이 나타내는 숫자와 일치하지 않은 타입의 숫자로 변환한 경우

package com.javaex.ex19;

public class Ex03 {

	public static void main(String[] args) {
		
		String str = new String("안녕하세요");
		
		str = null;  // 오류 발생 
		
		try {
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("주소값은 없습니다.");
		}finally {
			//생략 가능 
		}
		
		

	}

}
