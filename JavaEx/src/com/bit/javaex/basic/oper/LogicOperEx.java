package com.bit.javaex.basic.oper;

public class LogicOperEx {

	public static void main(String[] args) {
		// 관계 연산, 비교 연산
		// 관계 연산 : ==, !=, >, >=, <, <=
		int a = 7, b = 3;
		System.out.println("a>b? : " + ( a > b ));
		System.out.println("a == b? : " + (a == b));  // == : 동일성 비교
		System.out.println("a != b? : " + (a != b));  // != : Not Equal

		// 논리연산 : AND(&& 논리곱), OR(|| - 논리합), NOT(! - 논리부정)
		boolean b1 = a > b;
		boolean b2 = a < b;
		
		System.out.println("a>b? : " + b1);
		System.out.println("a<b? : " + b2);
		
		System.out.println("b1 AND b2? : " + (b1 && b2));
		System.out.println("b1 OR b2? : " + (b1 || b2));
		System.out.println("b1 AND NOTb2? : " + (b1 && !b2));
		System.out.println("NOT(b1 AND b2)? : " + !(b1 && b2));
	}

}
