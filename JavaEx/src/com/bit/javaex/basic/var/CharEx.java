package com.bit.javaex.basic.var;

public class CharEx {

	public static void main(String[] args) {
		// char 2byte 유니코드
		// 작은 따옴표('') 사용, 내부적으로는 코드값이 입력됨
		char ch1 = 'A';
		char ch2 = 'a';
		char ch3 = '한';
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		System.out.println(ch1 + ch2);
		
		// 문자는 char, 문자열은 String을 사용 (기본자료형은 아니며 참조자료형임)
		// 따옴표("") 사용
		String str = "Hello Java";
		System.out.println(str);

	}

}
