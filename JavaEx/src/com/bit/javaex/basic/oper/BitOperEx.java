package com.bit.javaex.basic.oper;

public class BitOperEx {

	public static void main(String[] args) {
		// 비트 연산
		// 하드웨어 제어, 이미지 프로세싱. 미세한 단위 데이터를 제어할 때 사용
		// AND(&), OR(|), NOT(~), XOR(^)
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
		int result = b1 & b2; //	0101
		// 둘 다 1이어야 1비트 세팅
		System.out.println("b1 and b2:"
				+ Integer.toBinaryString(result));

		result = b1 | b2;  //	1111
		System.out.println("b1 or b2:"
				+ Integer.toBinaryString(result));
		
		result = ~b1;
		System.out.println("not b1:"
				+ Integer.toBinaryString(result));
		
		// 비트 시프트
		// << (왼쪽으로 비트 이동), >> (오른쪽으로 비트 이동)
		int val = 1;
		System.out.println(val);
		// val를 왼쪽으로 1비트 이동
		System.out.println(Integer.toBinaryString(val << 1));
		// val를 왼쪽으로 4비트 이동
		System.out.println(Integer.toBinaryString(val << 4));
		
		// 우측 비트 시프트
		int val2 = 0b1000;	//	8
		System.out.println(Integer.toBinaryString(val2));
		// val를 오른쪽으로 1비트 이동
		System.out.println(Integer.toBinaryString(val2 >>1));
		
	}

}
