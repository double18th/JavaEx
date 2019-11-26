package com.bit.javaex.oop.goods.v2;

public class Goods {
	// 필드 선언. private으로 접근 제한
	private String name;
	private int price;
	
	// Getter와 Setter로 우회 접근
	public String getName() {
		return name;	// return 필수
	}
	
	public int getPrice() {
		return price;
	}
	// 이상 Getter. 인자가 필요 없으므로 price라는 이름이 겹쳐도 상관 없음
	
	// 이하 Setter. 인자 값만 필요하고 return 값 필요 없음
	// 인자 값을 받는 과정에서 이름이 겹치게 되므로 주의
	// 위의 name은 인스턴스 Goods의 name, 아래의 name은 인자 값 name. 구분 필수
	public void setName(String name) {
		this.name = name;	// this는 해당 인스턴스(Goods 인스턴스)		
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	// 메소드 
	public void showInfo() {
		System.out.println("상품명 : " + name);
		System.out.println("가격 : " + price);
		System.out.printf("**상품명 : %s%n 가격 : %d%n", name, price);
	
	}
}
