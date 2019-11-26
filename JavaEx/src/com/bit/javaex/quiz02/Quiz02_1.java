package com.bit.javaex.quiz02;

public class Quiz02_1 {

	public static void main(String[] args) {
		int a = 3;
		int b = 6;
		char c = 'A';
		
		boolean q = (a % 2 == 0);
		boolean w = (b % 3 == 0);
		System.out.println(a + "는 짝수입니까? : " + q);
		System.out.println(b + "는 3의 배수입니까? : " + w);
		
		boolean r1 = q && w;
		System.out.println(r1);
		
		
		int d = (int)c + 4;
		char r2 = (char)d;
		System.out.print(r2);
		
	}

}
