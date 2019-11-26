package com.bit.javaex.basic.var;

public class IntLongEx {
	public static void main(String[] args) {
		// int 변수 선언
		int intVal1;
		int intVal2;
		
		intVal1 = 2019; // 할당 혹은 치환. equal(=) 기호라고 해서 같다는 게 아님.
		//intVal2 = 880818880818; // out of range
		
		System.out.println(intVal1);  // 식별자 참조
		
		// long (8byte 정수형)
		long longVal1 = 2019, longVal2 = 880818880818L; // 맨 뒤에 L 표시
		System.out.println(longVal1);
		System.out.println(longVal2);
		
		// 2진 8진 15진 데이터의 입력
		int bin, oct, hex;
		bin = 0b1100;  // 2진수는 0b
		oct = 072;  // 8진수
		hex = 0xFF;  // 16진수는 0x
		// 0~9, A, B, C, D, E, F, 10(자리 올림) 
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		
	}
}
