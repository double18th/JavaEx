package com.bit.javaex;

public class MethodEx {
	public static double getSum(double a, double b) {
		// a, b는 고정 인자. double 값 반환(=return 필요(void가 아니므로)
		return a + b;
	}	
	
	public static double getSumVar(double ... values) {
		// ... 표기는 가변인자를 의미하고 values는 배열로 전달됨
		double total = 0;
		for (double num: values) {
			total += num;
		}
		return total;	// 합산하고자 하는 개수와 상관없이 사용 가능함
	}
	public static void printTotal(String message, 
			double ... values) {
		// 반환할 값이 없어도 선언부에서는 return 타입이 필요
		// 이런 경우 void(return 필요 없음) 사용
		// 고정 인자와 가변 인자를 같이 쓸 경우 고정 인자를 먼저 선언(순서에 유의)
		System.out.println(message + " " + getSumVar(values));
 		// void 사용했으므로 return 필요 없음
		// 쓰는 경우도 있지만 이런 경우는 다시 돌아가라는 의미로 사용
	}
	
	public static void main(String[] args) {
		System.out.println("3+5 : " + getSum(3,5));
		System.out.println(getSumVar(8, 8, 0, 8, 1, 8));
		printTotal("결과는?", 8, 8, 0, 8, 1, 8);
		// 이미 출력이 포함된 메소드임
	}

}
