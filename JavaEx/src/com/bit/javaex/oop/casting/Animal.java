package com.bit.javaex.oop.casting;

public class Animal {
	// 필드
	protected String name;
	// 상속받은 클래스는 사용해야하므로 private 쓰지 않음
	
	// 생성자
	public Animal(String name) {
		this.name = name;
	}
	
	// 메소드
	public void eat() {
		System.out.println(name + " is eating...");
	}
	
	public void walk() {
		System.out.println(name + " is walking...");
	}
}
