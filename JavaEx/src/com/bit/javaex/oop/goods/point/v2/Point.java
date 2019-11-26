package com.bit.javaex.oop.goods.point.v2;

public class Point {
	// 필드 은닉
	private int x;
	private int y;
	
	// 생성자
//	public Point() {
//		// 기본 생성자
//	}
	
	public Point(int x, int y) {
		// super(); 생략된 상태 
		this.x = x;
		this.y = y;		
	}
	
	// Getter와 Setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// 메소드 
	public void draw() {
		System.out.printf("점 [x=%d, y=%d]을 그렸습니다. %n", x, y);
	}
	
	// 메소드 오버로딩(overloading): 같은 리턴 타입, 같은 이름의 메소드를 중복으로 선언
	// 메소드 인자 값에 따라 조금씩 다른 기능 수행 가능. *다형성의 특성 중 하나*
	public void draw(boolean show) {
		// boolean show -> true : 그렸습니다 / false : 지웠습니다
		String message = String.format("점 [x=%d, y=%d]을 ", x, y);
		// 
		if (show) {
			message += "그렸습니다.";
		} else {
			message += "지웠습니다.";
		}
		System.out.println(message);
		}
}
	