package com.bit.javaex.api.arrays;

// 사용자 정의 클래스를 정렬하기 위해서는 Comparable 인터페이스를 구현해줘야 한다
public class Member implements Comparable {
	// 필드
	String name;
	
	// 생성자
	public Member(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}
	
	
	@Override
	public int compareTo(Object o) {
		// 두개의 객체를 비교하기 위해 compareTo 메소드에 비교 방법을 기술해줘야함
		// name 필드를 대상으로 대소 비교
		if (o instanceof Member) {
			// 다운캐스팅 가능
			Member other = (Member)o;
			return name.compareTo(other.name);
			// -1, 0, 1
			// 비교 대상이 동일한 경우 : 0 
			// 크거나 작은 경우 : 각 1, -1
		}
		return 0;
	}
	
	
}
