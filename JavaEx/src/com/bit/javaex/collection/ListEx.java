package com.bit.javaex.collection;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;

public class ListEx {
	// List 인터페이스
	//	List는 설계도이며 실제 클래스는 LinkedList, ArrayList 등으로 구현되어있다
	// 	Linked List : 중간에 값이 삽입 삭제되는 경우가 빈번할 때 효율적
	//	Array List : 맨 뒤에 값이 추가되는 경우 / 중간에서는 빈번하지 않을 경우 효율적
	
	public static void main(String[] args) {
//		List<String> list = new LinkedList<>();
		List<String> list = new ArrayList<>();	// 교체 가능성
		
		// 객체 추가
		list.add("Java");	// 맨 마지막에 아이템 추가
		list.add("Python");
		list.add("C");
		list.add("C++");
		
		// 객체 삽입
		list.add(2, "Linux");
		System.out.println("List : " + list);
		System.out.println("Size : " + list.size());
		// size는 확인 가능하나 용량(capacity)은 확인 할 수 없음. 버퍼형이 아니기 때문.
		
		// 객체 삭제
		list.remove(2);		// CASE 1. 인덱스로 삭제
		list.remove("Python");	// CASE 2. 오브젝트로 삭제
		list.remove("R");	// 없는 객체의 삭제 -> 아무일도 일어나지 않음
		System.out.println(list);
	
		// 루프
		/*
		for (String item : list) {
			System.out.println("Element : " + item);
		}
		*/
		// Iterator를 이용한 접근
		Iterator<String> it = list.iterator(); // 이터레이터 변환
		while(it.hasNext()) {	// 뒤에 데이터가 있는지 확인
			String item = it.next();
			System.out.println("Element(it) : " + item);
		}
		
		// 비우기
		list.clear();
		System.out.println(list);

	}

}
