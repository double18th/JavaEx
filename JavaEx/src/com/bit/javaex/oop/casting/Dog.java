package com.bit.javaex.oop.casting;

public class Dog extends Animal {
	// 생성자 
	public Dog(String name) {
		super(name);	// 부모의 생성자 명시적 호출
	}
	
	// 메소드
	public void bark() {
		System.out.println(name + " : 멍멍!");
	}
}
