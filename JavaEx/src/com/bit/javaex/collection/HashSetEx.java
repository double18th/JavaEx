package com.bit.javaex.collection;

import java.util.HashSet;

public class HashSetEx {
	// HashSet (집합)
	// 순서는 중요하지 않으나 내부 데이터 중복을 허용하지 않음
	public static void basicHashSet() {
		// Java의 기본 객체들을 테스트
		// HashSet 생성
		HashSet<String> hs = new HashSet<>();
		// 객체 추가
		hs.add("Java");
		hs.add("Python");
		hs.add("C");
		hs.add("C++");
		hs.add("Java");		// 중복 삽입 -> 추가되지 않았음
		
		System.out.println("HASHSET : " + hs);
		System.out.println("Size :" + hs.size());
		
		// 포함 여부 확인 : contains. true/false로 확인
		System.out.println(hs.contains("C++"));
		System.out.println("없는 데이터의 확인 : " + hs.contains("Linux"));

		// 객체 삭제
		hs.remove("C++");
		System.out.println(hs);
		
		// 셋 비우기
		hs.clear();
		System.out.println(hs);
	}
	
	public static void customClassHashSet() {
		// 사용자 정의 클래스를 HashSet에서 사용할 수 있도록 
		HashSet<Student> hs = new HashSet<>(); // 제네릭
		
		Student s1 = new Student("홍길동", 10); 
		Student s2 = new Student("장길산", 13);
		Student s3 = new Student("홍길동", 10);
		
		// HashSet에 담아봅시다
		hs.add(s1); hs.add(s2); hs.add(s3);
		System.out.println("HASHSET : " + hs);
		// s1, s2의 hashcode 확인
		System.out.println("hashcode of s1 : " + s1.hashCode());
		System.out.println("hashcode of s2 : " + s2.hashCode());
		// hashCode 
		// 	빠른 검색을 위해 객체를 식별하기 위한 하나의 정수값
		// 	Object 클래스는 hashCode로 메모리 주소값을 쓴다
		
		// 만약에 Student 객체가 이름과 id가 같다면 -> 동등 객체로 판단
		// 같은 값을 가진 객체가 넘어올 때 중복 삽입을 막을 수 있다
		// 객체 내에서 hashCode() 오버라이드 후  equals 오버라이드로 내부값 비교
	}
	
	public static void main(String[] args) {
		basicHashSet();
		//customClassHashSet();
	}

}
