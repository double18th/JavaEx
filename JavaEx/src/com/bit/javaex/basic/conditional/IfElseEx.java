package com.bit.javaex.basic.conditional;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {
		// 키보드로부터 정수를 입력
		// 0보다 크면 "양수입니다." 
		// 0보다 작으면 "음수입니다."
		// 0이면 "0입니다."
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요.");
		int num = scanner.nextInt();
		
		// 조건문
		/*
		if (num > 0) {
			System.out.println("양수입니다.");
		} else if (num < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
		*/
		
		// 조건문 Ⅱ - 중첩 if
		if (num == 0) {
			System.out.println("0입니다.");	// 1차 판별
		} else {
			if (num > 0) {
				System.out.println("양수입니다.");	
			} else {
				System.out.println("음수입니다.");
			}
		} 
		
		scanner.close();

	}

}
