package com.bit.javaex.basic.conditional;

import java.util.Scanner;

public class IfElse2Ex {

	public static void main(String[] args) {
		System.out.println("1: C, 2: C++, 3: Java, 4: Python");
		// 키보드로부터 정수 입력
		// 1-> R101, 2-> R202, 3-> R303, 4-> R404, 그외: 문의
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("과목 번호 : ");
		
		int subject = scanner.nextInt();
		String message;
		
		//조건 판별
		if (subject == 1) {
			message = "R101";
		} else if (subject == 2) {
			message = "R202";
		} else if (subject == 3) {
			message = "R303";
		} else if (subject == 4) {
			message = "R404";
		} else {
			message = "문의바람";
		}
		
		System.out.println(message);
		scanner.close();
		

	}

}
