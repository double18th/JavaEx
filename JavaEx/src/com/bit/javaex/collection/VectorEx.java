package com.bit.javaex.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {
	// Vector
	// - 버퍼형 자료형. 순서가 있는 객체들의 집합
	public static void main(String[] args) {
		// 벡터 생성
		Vector v = new Vector(); 	
		// Generic으로 타입을 지정하지 않았으므로 Object
		System.out.println("Size : " + v.size() + 
				", Capacity : " + v.capacity());
		Vector<Integer> v2 = new Vector<>(8);	
		// Integer를 담을 8개 공간을 가진 벡터
		System.out.printf("Size : %d, Capacity : %d%n", 
				v2.size(), v2.capacity());
		
		// 1부터 10까지 값을 담아봅시다
		for (int i = 1; i <= 10; i++) {
			v2.addElement(Integer.valueOf(i));
			// Wrapper class는 자동 Wrapping이 되므로 
			// v2.addElement(i); 도 가능
		}
		
		System.out.printf("Size : %d, Capacity : %d%n", 
				v2.size(), v2.capacity());
		// 용량을 초과하면 자동으로 증가 -> capactiy 만큼 
		
		System.out.println("v2에 7이 있는가? : " + v2.contains(7));
		// v2에 7은 몇번 인덱스에 있는가? 
		System.out.println("Index of 7 : " + v2.indexOf(7));
		// 중간에 객체 삽입
		v2.insertElementAt(11, 5);
		
		// 해당 객체 조회
		System.out.println("5번 인덱스에 있는 객체 : " + v2.elementAt(5));
		// 객체 검색 : 없는 객체 
		System.out.println("없는 객체의 검색 : " + v2.indexOf(0));
		
		// 객체 삭제
		v2.remove(10);
		System.out.println(v2);
		
		/*
		for (Integer i : v2) {
			System.out.println("Element : " + i);
		} 
		*/
		// -> Enumeration 
		// enumeration : Vector, Hashtable에서 활용
		Enumeration<Integer> e = v2.elements();
		
		// 루프
		while (e.hasMoreElements()) { 		// 뒤에 데이터가 더 있는가?
			Integer item = e.nextElement();
			System.out.println("Element(enum) : " + item);
		}	// 메모리 효율이 더 좋은 방법
		
		
		// 버퍼 비우기
		v2.clear();
		System.out.println(v2);
		System.out.printf("Size : %d, Capacity : %d%n",
				v2.size(), v2.capacity());
		// 한번 늘어난 Capacity가 줄어들지는 않는다
		
		
		// Number를 확장한 모든 클래스를 담을 수 있는 벡터 : Generic의 활용
		Vector<? super Number> numVector = new Vector<>();
		numVector.addElement(Integer.valueOf(2019)); // Integer
		numVector.addElement(Float.valueOf(3.14159F));	// Float
//		numVector.addElement("Java");
		// String은 Number를 상속받지 않았으므로 추가되지 않는다.
		
		
		// 내부 데이터를 순회하고자 하는 경우
	}

}
