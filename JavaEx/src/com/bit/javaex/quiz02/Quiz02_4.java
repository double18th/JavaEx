package com.bit.javaex.quiz02;

public class Quiz02_4 {

	public static void main(String[] args) {
		// ch A를 a로 변환
		
		char ch = 'A';
		int ch2 = (int)ch + 32;
		ch = (char)ch2;
		System.out.println(ch);
		
		//하승 방법
		char ch3 = 'A';
		System.out.println((char)(ch3+32));
		
		

	}

}
