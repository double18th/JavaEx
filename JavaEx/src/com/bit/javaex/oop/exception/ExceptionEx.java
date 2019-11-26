package com.bit.javaex.oop.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {
	//ArithmeticException
	public static void ArithExceptionEx() {
		// 상황 1 : Scanner로부터 정수를 입력 받아 해당 정수로 100을 나누기
		double result = 0;
		Scanner scanner = new Scanner(System.in);
		int num = 0;	// 입력 값 변수
		try {
		System.out.print("정수 입력해주세요 : ");
		num = scanner.nextInt();	// 정수 입력 받음
		result = 100/num;
		
		System.out.println("결과 : " + result);
		// 오류 발생 가능 영역 끝
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력하십시오");
		} catch (ArithmeticException e) {
			// ArithmeticException 발생했을 경우 처리
			System.out.println("0으로는 나눌 수 없어요 : ");
			System.out.println("Error 메시지 : " + e.getMessage());
		} catch (Exception e) {
			// Exception catch 블록은 맨 마지막에 위치 
			// -> Exception 클래스는 모든 예외를 다 처리하므로 
			// 위에 있을 경우 개별 예외 처리가 안됨 
			// 다른 오류를 처리했다고 하더라도 혹시 모르니 아래에 넣는 게 좋음
			e.printStackTrace();
			// 오류 정보를 추적하려 출력
		} finally {
			// 예외 여부와 상관없이 항상 마지막에 실행
			System.out.println("Finally 실행");
		}
		scanner.close();
	}

	public static void arrayExceptionEx() {
		// ArrayIndexOutofBoundsException 테스트
		int intArray[] = {3, 6, 9};
		// intAray의 length == 3
		// 인덱스 -> 0~2(length-1)까지
		System.out.println("길이 : " + intArray.length);
		try {
		intArray[4] = 12;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error : 인덱스 범위는 " + 
					(intArray.length - 1) + "까지 입니다.");
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
//		ArithExceptionEx();
		arrayExceptionEx();

	}

}
