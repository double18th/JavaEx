package com.bit.javaex;

//	Hello 객체 : 첫번째 java 프로그램
public class Hello {
	//	main 메소드 : 프로그램의 시작 지점
	public static void main(String[] args) {
		System.out.println("Hello Java");
		
		int j = 4;
		System.out.println("This floor is " + j + "F");
		// 간단한 출력 연습
		
		for (int i = 1; i<5; i++) {
			if (i<4) 
				System.out.println(i + "층입니다.");
				
			else
				System.out.println(i + "층부터는 계단을 이용하세요.");
		}		// for 항 안에 다른 코드를 쓰지 않도록 주의. loop에서 반복됨. 
		
		
	
		float k = 0.1f;		// 제발 뒤에 f 붙이는 거 잊지 말기
		float m = 0.1f*0.1f*0.1f;	// (0.1*0.1*0.1)f 는 오류 발생함
		float u = (k*k*k);	// 이미 k가 float이므로 f 생략
		float w = (float)Math.pow(k, 3); 
		System.out.println((float)m + "=" + (float)u + "=" + (float)w);
		// 다양하게 세제곱 연습. pow 사용할 경우 실수(double)로 출력된다. int를 이용해도.
		// float 변환하지 않고 곱할 경우 0.001이라는 깔끔한 값이 나오지 않음. 
		
	}
}
