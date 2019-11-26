package com.bit.javaex.basic.oper;

public class ArithOper {

	public static void main(String[] args) {
		// 산술 연산자
		int a = 7;
		int b = 3;
		
		// 부호 연산자 : +, - (1항 연산자)
		System.out.println(-a); // 부호를 반전
		System.out.println(-1*a); 
		System.out.println((int)Math.pow(-1, a));
		System.out.println(Math.pow(-1, a));
		
		// 사칙 연산 : +, -, *, /, %(나머지)
		System.out.println("정수의 나눗셈: " + (a/b));
		// 정수와 정수의 나눗셈은 정수(몫)
		System.out.println("나머지: " + (a%b));
		// 나눗셈의 해
		System.out.println("나눗셈의 해:" + ((float)a/(float)b));
		System.out.println("나눗셈의 해:" + ((float)a/b)); // 암묵적 캐스팅
				
		double c = 7.5;
		double d = 3.2;
		System.out.println(c/d);
		System.out.println((int)(c/d));

		//증감 연산자 : ++, --
		//		연산 순서에 유의, a++(postfix)와 ++a(prefix)는 다르다는 점 확인
		System.out.println("A:" + a);
		System.out.println("++a:" + (++a));
		System.out.println("a:" + a);
		
		System.out.println("B:" + b);
		System.out.println("b++:" + (b++));
		System.out.println("b:" + b);
		// 증감 연산자가 다른 연산식에 포함되면 가독성이 떨어지므로 가급적 독립적으로 사용
		
		
		// 나눗셈 보충
		// 정수를 0으로 나누기 -> 산술에러 (오류)
//		System.out.println(4/0);
		// 실수를 0으로 나누기 -> Infinity. 산술값 할당은 됨(오류로 뜨지 않음)
		System.out.println(4.0/0);  // Infinity
		
		// 피연산자 값이 Infinity인지 체크해야할 경우 
		System.out.println(Double.isInfinite(4.0/0));  // 논리형 boolean
		System.out.println(Double.isNaN(4.0/0));  // Not a Number
		// Infinity는 수치 값
	}

}
