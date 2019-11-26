package com.bit.javaex.basic.var;

public class ImplicitCastingEx {

	public static void main(String[] args) {
		// 암묵적 캐스팅 (=Promotion)
		// 표현 범위가 좁은 데이터를 넓은 데이터로 변경할 때, java가 자동으로 캐스팅 진행
		
		byte b = 25;	// 1byte 정수형
		System.out.println("BYTE:" + b);
		
		short s = b;	// 2byte 정수형
		// b는 byte(1byte)이므로 short(2byte)에 할당 가능
		System.out.println("SHORT:" + s);
		
		int i = s;		// 4byte 정수형
		System.out.println("INTEGER:" + i);
		
		long l = i;		// 8byte 정수형
		System.out.println("LONG:" + l);
		
		float f = l;	// 4byte 실수형
		//long보다 byte가 작지만 범위가 넓기 때문에 암묵적 캐스팅이 가능
		System.out.println("FLOAT:" + f);
		
		char ch = 'A';
		// short s2 = ch; char:signed, short:unsigned라 불가
		int i2 = ch;
		System.out.println(i2);
	}

}
