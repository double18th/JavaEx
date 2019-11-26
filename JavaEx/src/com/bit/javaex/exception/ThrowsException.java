package com.bit.javaex.exception;
// 강제 익셉션 발생 연습 : 메소드내에서 예외를 처리할 수도 있지만 
// 호출하는 메소드에서(caller)에서 호출되는 메서드의 예외를 일괄 처리하는 것이 
// 보다 좋은 처리방법이다

public class ThrowsException {
	// 외부에서 호출되는 메소드, 억지로 예외처리를 하지 않고 
	// 호출한 메소드에 예외 처리를 위임한다
	public void executeRuntimeException() {
		System.out.println("강제 예외 발생");
		// RuntimeException을 강제로 발생 시킴
		throw new RuntimeException("강제 예외");
	}
	
	public double divide(int num1, int num2) {
		if (num2 == 0 ) {
			// 호출한 메서드로 사용자 정의 Exception을 발생. (= 처리를 위임)
			throw new CustomArithException("사용자 정의 예외",
					num1, num2);
			// num1, num2는 예외 발생 당시의 데이터
		}
		return num1 / num2;
	}
}
