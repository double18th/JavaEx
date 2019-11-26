package com.bit.javaex.oop.shape.v1;

public class Circle extends Shape {
	// 필드 추가
	protected double radius;	// 반지름
	
	
	// 생성자
	public Circle(int x, int y, double radius) {
		super(x,y);
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.printf(
				"원 [x=%d, y=%d, area=%f]을 그렸습니다.%n",
				x, y, area());

	}

	@Override
	public double area() {
		double area = Math.PI * Math.pow(radius, 2); 
		return area;
	}

}
