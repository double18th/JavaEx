package com.bit.javaex.exception;

public class ThrowsExceptionTest {

	public static void main(String[] args) {
		ThrowsException except = 
				new ThrowsException();
		
		// 호출되는 메소드 내부에서 무리하게 예외처리를 끝내는 것보다
		// 예외를 외부로 throw 해서 
		// 호출하는 메소드에서 일괄 예외 처리를 해주는 것이 보다 나은 코딩 
		try {
			except.executeRuntimeException();
		} catch (RuntimeException e) {
			System.err.println("ERROR : " + e.getMessage());							
		}
		
		try {
			double result = except.divide(10,  0);
		} catch (CustomArithException e) {
			// 사용자 정의 예외 처리
			System.err.println("ERROR : " + e.getMessage());
			System.err.println("num1 : " + e.getNum1());
			System.err.println("num2 : " + e.getNum2());
		} catch (Exception e) {
			System.err.println("ERROR : " + e.getMessage());
		}

	}

}
