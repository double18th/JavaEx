package com.bit.javaex.oop.shape.v1;

// 도형을 작성하기 위한 부모 설계 클래스
//	실체화 해야할 필요가 없음 -> 추상(abstract). 컨셉상으로만 존재

public abstract class Shape {
	// 필드
	protected int x;
	protected int y;
	
	// 생성자 
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 추상 메소드
	// 컨셉만 존재하므로 구현부는 없으며, 
	// 이 클래스를 상속받은 자식 클래스에서 반드시 구현되어야함
	public abstract void draw();
	public abstract double area();
}
