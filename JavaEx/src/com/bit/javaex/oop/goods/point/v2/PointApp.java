package com.bit.javaex.oop.goods.point.v2;

public class PointApp {

	public static void main(String[] args) {
		// Point 클래스 테스트
		Point p1 = new Point(10, 10);
		p1.draw();
		p1.draw(true);
		
		Point p2 = new Point(8, 18);
		// 아래 두 메소드는 오버로딩된 메소드
		p2.draw();
		p2.draw(false);

	}

}
