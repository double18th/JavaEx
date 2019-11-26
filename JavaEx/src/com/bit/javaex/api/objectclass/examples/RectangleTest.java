package com.bit.javaex.api.objectclass.examples;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle a = new Rectangle(6, 4);	// 면적 24
		Rectangle b = new Rectangle(12, 2);	// 면적 24
		Rectangle c = new Rectangle(3, 3);	// 면적 9

		// a와 b의 면적 비교(equals)
		System.out.println(a.equals(b));	// a와 b의 면적이 같은가?
		System.out.println(b.equals(c));	// b와 c의 면적이 같은가?
				
	}

}
