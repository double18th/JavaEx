package com.bit.javaex.thread.ex01;

public class MainThread {

	public static void main(String[] args) {
		// 메인 스레드와 별개의 작업 흐름 작성
		Thread dt = new DigitThread();	// NEW
		dt.start();		// 쓰레드 실행
		// Thread의 start() 내부에서 run()을 대신 호출 
		
		// 메인 스레드 로직
		// A~Z까지 순차적으로 출력
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println("MainThread : " + ch);
			
			// 출력 속도 제한 : Thread.sleep()
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 	// 0.3초 대기 -> 예외처리 해줘야함
			
		}

	}

}
