package com.bit.javaex.basic.var;

public class ExplicitCastingEx {

	public static void main(String[] args) {
		// 명시적 캐스팅
		// 표현 범위가 넓은 자료형을 좁은 자료형으로 변환. 자동 변환되지 않음. 
		// 자료의 유실이 발생할 가능성이 있음.
		
		byte b;
		int i = 2019;
		float f = 123.456F;
		
		System.out.println("INT:" + i);
		
		b = (byte)i;  // int가 byte보다 표현 범위가 넓으므로 강제로 캐스팅
		System.out.println("BYTE" + b);
		
		i = (int)f;
		System.out.println("FLOAT" + f + " -> INT:" + i);
	}

}
