package com.bit.javaex.oop.goods.v3;

public class Goods {
	// 필드 선언. private으로 접근 제한
	private String name;
	private int price;
	
	// 생성자
	// 만약 코드 내에 생성자가 하나도 없을 경우 컴파일러가 기본 생성자 자동으로 추가
	// 있을 경우 기본default 생성자 추가하지 않음
	// 코드 내에 1개 이상 있어야 함
	public Goods(String name) {
		this.name = name;
	}
	
	
	
	
	public Goods(String name, int price) {
	// 접근 제한자 안 쓸 경우 default로 자동 정의 / 클래스와 생성자 이름(Goods) 동일
	// 외부로부터 값 받음
//		super();	// 부모 생성자 호출(필수) -> 상속된 필드 초기화
		// 생성자 내부에서 명시적으로 부모 생성자를 호출하지 않으면 
		// 컴파일러가 기본 부모 생성자를 자동으로 추가
//		this.name = name;
		this(name);	// 위와 중복되므로. 
		// 반드시 초기화가 되어야하는 필드들과 나중에 해도 되는 필드들을 구분해서
		// 필수 필드 초기화 + 전체 필드 초기화. 
		// -> 가장 적합한 걸 먼저 호출해서 세팅
		this.price = price;		 
	}
	
	
	// Getter와 Setter로 우회 접근
	public String getName() {
		return name;	// return 필수
	}
	
	public int getPrice() {
		return price;
	}
	// 이상 Getter. 인자가 필요 없으므로 price라는 이름이 겹쳐도 상관 없음
	
	// Setter 삭제. Setter가 없으면 field는 Read Only 상태가 됨
	
	// 이하 Setter. 인자 값만 필요하고 return 값 필요 없음
	// 인자 값을 받는 과정에서 이름이 겹치게 되므로 주의
	// 위의 name은 인스턴스 Goods의 name, 아래의 name은 인자 값 name. 구분 필수
	public void setName(String name) {
		this.name = name;	// this는 해당 인스턴스(Goods 인스턴스)		
	}
	
	public void setPrice(int price) {
		if (price > 0)	
			// 필드 입력 값을 검증하고자 할 때 사용 가능. 0 이하의 값은 세팅 불가
			this.price = price;
	}
	
	
	// 메소드 
	public void showInfo() {
		System.out.println("상품명 : " + name);
		System.out.println("가격 : " + price);
		System.out.printf("상품명 : %s%n 가격 : %d%n", name, price);
	
	}
}
