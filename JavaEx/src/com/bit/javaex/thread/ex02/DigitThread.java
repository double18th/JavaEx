package com.bit.javaex.thread.ex02;

public class DigitThread extends Thread {

	@Override
	public void run() {
		// 쓰레드의 실행 로직 위치
		// 1~30까지 정수를 순차적 출력
		for (int i = 1; i <= 30; i++) {
			System.out.println("DigitThread : " + i);
			// 쓰레드 지연 
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
//		super.run();
	}

	
}
