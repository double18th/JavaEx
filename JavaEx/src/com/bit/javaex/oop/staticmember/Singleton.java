package com.bit.javaex.oop.staticmember;
// Singleton 예제
//	-> 전체 프로그램 내에 단 하나의 인스턴스만 유지해야할 경우 (어떤 상황에서도)
public class Singleton {
	static Singleton instance = new Singleton();
	
	private Singleton() {
		// new 생성 자체가 불가능해짐
	}
	
	// 생성자가 private이므로 new로 생성할 수 없으니 
	// instance를 확보할 수 있는 메소드가 필요 (public으로 열어줘야함)
	public static Singleton getInstance() {	// 리턴 타입이 Singleton 자신
		return instance;	// 프로그램 전체에서 단일 instance 유지
	}
}
