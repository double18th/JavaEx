package com.bit.javaex.api.objectclass.ex01;
// 특정 클래스를 extends 하지 않아도 
// java.lang.Objext 클래스를 상속받게 된다
// java의 최상위 클래스는 언제나 Object 

public class Point {
	// 필드
	private int x;
	private int y;
	
	// 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 문자열 출력을 위한 toString 메소드 오버라이드
	@Override
	public String toString() {
		return String.format("Point(%d, %d)%n", x, y);
		// 출력할 데이터 문자열을 리턴
	}
}
