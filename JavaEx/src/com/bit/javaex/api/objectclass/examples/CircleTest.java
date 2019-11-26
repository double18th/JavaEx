package com.bit.javaex.api.objectclass.examples;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle a = new Circle(6, 4, 10);
		Circle b = new Circle(2, 12, 10);
		Circle c = new Circle(3, 3, 12);
		
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		System.out.println(a.equals(c));

	}

}
