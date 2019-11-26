package com.bit.javaex.oop.shape.v2;

public class Rectangle extends Shape 
	implements Drawable {
		// implements 키워드를 이용, 인터페이스를 구현
		// 인터페이스는 여러 개를 중복 구현할 수 있다 (상속과 다름)
	
	// 추가 필드 선언 
	protected int width;
	protected int height;
	
	// 생성자
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw() {
		System.out.printf(
				"사각형 [x=%d, y=%d, w=%d, h=%d, area=%f]을 그렸습니다.%n",
				x, y, width, height, area());
	}
	
	@Override
	public double area() {
		return width * height;
	}
}
