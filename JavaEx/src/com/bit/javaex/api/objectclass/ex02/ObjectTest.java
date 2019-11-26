package com.bit.javaex.api.objectclass.ex02;

public class ObjectTest {

		public static void main(String[] args) {
			Point p = new Point(10, 10);
			
			// Java의 최상위 클래스는 Object 
			// -> 기본적으로 모든 클래스는 Object가 가진 모든 메소드를 사용 가능
			System.out.println(p.getClass().getName());
			System.out.println("Hashcode : " + p.hashCode());
			System.out.println("toString : " + p.toString());
			System.out.println("Point : " + p);		// toString() 생략
			
			// == 은 객체의 동일성 비교 : 같은 객체냐를 비교
			// .equals()는 객체의 값의 비교 : 같은 값이냐를 비교
			
			Point p2 = new Point (10, 10);	// p와 x, y 값이 같다
			System.out.println("p와 p2는 같은 객체인가? : " + (p == p2));
			
			// p와 p2의 값을 비교
			System.out.println("p와 p2는 같은 값인가? : " + p.equals(p2));
			
			// false 발생 : 내부의 값을 비교할 수 없으므로 equals를 override해야함
			// override : true 
		}
}
