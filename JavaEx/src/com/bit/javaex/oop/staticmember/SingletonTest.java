package com.bit.javaex.oop.staticmember;

public class SingletonTest {

	public static void main(String[] args) {
//		Singleton s1 = new Singleton();	// 생성자가 private므로 오류 발생
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();		
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1 == s2);	// 같은 값을 참조하고 있는지 확인
	}

}
