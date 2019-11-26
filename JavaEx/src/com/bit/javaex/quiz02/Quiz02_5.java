package com.bit.javaex.quiz02;

public class Quiz02_5 {

	public static void main(String[] args) {
		int num1 = 13579;
		int num2 = 13579;
		
		String r = ++num1 + 1 == num2++ +1? "같음" : "틀림";
		System.out.println(r);
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
