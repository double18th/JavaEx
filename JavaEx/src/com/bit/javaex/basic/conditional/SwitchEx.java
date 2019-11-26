package com.bit.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		//switchEx1();
		//switchEx2();
		switchEx3();
	}
	public static void switchEx3() {
		// 여러 개의 값을 한번에 묶어서 case로 처리하고자 할 경우 
		// 요일에 따라 다른 행동을 해봅시다 
		
		// TODO NOTE : 코드값 등을 만들고자 할 떄에 문자열로 설정하는 것은 바람직하지 않다
		// 			이럴 경우 상수 혹은 ENUM type을 활용,
		//			데이터의 범위를 강제하거나 축소해야함
		//			-> 추후 ENUM type으로 변경해볼 메소드 
		String dow = "WED";
		// SUN : 휴식, MON~THU : 열공, FRI : 불금, SAT : 방전
		String message;
		switch (dow) {
		case "MON" : 
		case "TUE" : 
		case "WED" : 
		case "THU" : 
			message = "열공";		// 같은 값이기 때문에 이어짐
			break;
		case "FRI" : 
			message = "불금";
			break;
		case "SAT" : 
			message = "방전";
			break;
		case "SUN" : 
			message = "휴식";
			break;
		default : 
			message = "다시 입력하시오(ex. 수요일 = WED)";
		}
		System.out.println(message);
	}

	public static void switchEx2() {
		// C언어의 switch는 수치형 판별만 가능하지만
		// Java는 char, String도 가능하다
		char grade = 'A';
		// grade A : Excellent, B : Good, C : So so,  D: Pass
		// F : Fail, 나머지 : What?
		String message;
		switch (grade) {
		case 'A' :
			message = "Excellent";
			break;
		case 'B' :
			message = "Good";
			break;
		case 'C' :
			message = "So So";
			break;
		case 'D' : 
			message = "Pass";
			break;
		case 'F' :
			message = "Fail";
			break;
		default : 
			message = "What?";
		}
		System.out.println(grade + ":" + message);
	}
	
	public static void switchEx1() {	//main에서 불러줘야 실행됨 
		// 일반적인 switch ~ case문 사용법
		// 과목을 입력받은 후 해당 강의실을 출력
		Scanner scanner = new Scanner(System.in);
		System.out.println("1: C, 2: C++, 3: Java, 4: Python");
		System.out.println("과목 번호 : ");
		int subject = scanner.nextInt();
		
		// switch는 조건 판별이 아니라 값의 판별
		String message;
		
		switch (subject) {
		case 1 : 
			message = "R101";
			break;	// break 필수
		case 2 : 
			message = "R202";
			break;
		case 3 : 
			message = "R303";
			break;
		case 4 : 
			message = "R404";
			break;
		default : 
			message = "문의 바람";
			// break; 안해도 됨 
		}	
		System.out.println(message);
		scanner.close();
		
	}
	
}
