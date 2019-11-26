package com.bit.javaex.oop.goods.point.v3;

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

		Point p3 = new ColorPoint (30, 30, "RED");
		p3.draw();
		p3.draw(false);
		
		// 메소드 오버라이딩
		// 		-> 상속 받은 메소드 중에서 부모의 기능을 이용하지 않고 
		//		자체 기능을 다시 구현하고자 할 경우 
	}
}
