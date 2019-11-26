package com.bit.javaex.basic.conditional;

import java.util.Scanner;

public class LoopEx {
	public static void whileEx() {
	// while문 연습
	// 100 이하의 정수를 합산하여 결과를 출력 
	int num =1; // 반복 조건을확인하기 위한 제어 변수
	int total = 0; // 합산 변수
	
	// while 루프
	while (num<=100) { 
		total += num;
		num++;	// 반복 지속 여부 판단을 위한 변수는 직접 제어
	}
	System.out.println("TOTAL : " + total);		
}
	
	public static void whileEx2() {
		// 키보드에서 숫자를 입력받아 해당하는 구구단을 출력
	Scanner scanner = new Scanner(System.in);
	System.out.print("단을 입력하세요");
	int dan = scanner.nextInt();
	
	// 제어 변수
	int num = 1;
	while (num<=9) {
		System.out.println(dan + "*" + num + "=" + dan*num);
		// 제어 변수 증감 
		num++;
		}
		
	scanner.close();
	}
	
	public static void forEx() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("단을 입력하세요");
		int dan = scanner.nextInt();
		
		// for 루프
		for (int num = 1; num<=9; num++) {
			System.out.println(dan + "*" + num + "=" + dan*num);
		}
		
		scanner.close();
	}
	
	public static void continueEx() {
		// continue : 반복문에서 남아있는 코드를 더 이상 실행하지 않고 
		//				다음 루프를 진행
		// 1~100 수 중에서 2의 배수와 3의 배수를 제외하고 다른 수들은 출력
		
		for(int i =1; i<=100; i++) {
			if (i % 2 ==0 || i % 3 ==0) {
				continue;	// 다음 루프
			} 
			System.out.println(i);
		}
	}
	
	public static void breakEx() {
		// break문은 반복문을 종료하고 반복문 다음 문장으로 이동
		// 1부터 차례로 반복하면서 6과 14의 배수를 출력
		// 반복의 회수를 알 수 없으므로  while문
		int num =1;
		
		while (true) {	// 무한 루프
			if (num % 6 == 0 && num % 14 == 0) {
				// 찾음
				break;	// 루프 중단
			}
			num++;
		}
		System.out.println(num);
	}
	
	public static void doWhileEx() {
		// do ~ while은 코드를 최소 1번 실행 후,
		// 반복 조건의 판별은 후에 하고자 하는 경우
		// 점수 입력 후 0이면 종료, 0이 아니면 합산 후 다음 루프 : 
		// 입력을 1번은 받아야하므로 while을 판별 조건 뒤에 붙임
		// (앞에 놓을 경우 코드가 실행되지 않음) -> do ~ while
		Scanner scanner = new Scanner(System.in);
		int total = 0, value = 0;
		
		do {
			System.out.print("정수 입력(0이면 종료) : ");
			value = scanner.nextInt();
			
			total += value;
		} while (value != 0);
		
		System.out.println("TOTAL : " + total);
		scanner.close();
		
	}
	
	public static void main(String[] args) {
		whileEx();
//		whileEx2();
//		forEx();
//		continueEx();
//		breakEx();
//		doWhileEx();

	}

}
