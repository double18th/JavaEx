package com.bit.javaex.api.objectclass.examples;

public class Rectangle {
	// 필드 width, height
	// 두 사각형의 면적이 같으면 equals 판정
	
	// 필드
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// 메소드
	public int getArea() {
		return width * height;
	}

	@Override
	public boolean equals(Object obj) {
		// 외부로부터 넘어온 obj가 비교 가능한 객체인지 먼저 확인
		if (obj instanceof Rectangle) {
			// obj는 Rectangle로 캐스팅 가능
			Rectangle other = (Rectangle)obj;
			return getArea() == other.getArea();
		}
		
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	
}
