package com.bit.javaex.oop.staticmember;
//	Static의 활용
public class Calculator {
	// static 상수와 static 메소드는 인스턴스화하지 않아도 접근 가능하므로
	// 메소드 기능과 상수의 묶음으로 활용할 수 있음
	// ex. Math 클래스 : 그룹화된 값과 함수의 집합
	public static final double PI = 3.14159;
	public static double getSum(double ... arg) {
		double total = 0;
		
		for(double num: arg) {
			total += num;
		}
		
		return total;
	}
}
