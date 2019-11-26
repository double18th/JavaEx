package com.bit.javaex.oop.goods.v3;

public class GoodsApp {
	// Goods 테스트 실행 클래스이므로 main 필요
	public static void main(String[] args) {
		
//		Goods camera = new Goods();	
		// 사용자가 정의한 생성자 존재 : 컴파일러가 기본 생성자를 만들지 않아 에러 발생 
		// 생성자를 이용한 초기화
		Goods camera = new Goods("Samsung", 400000);
		camera.showInfo();
		
		Goods notebook = new Goods("LG 그램", 9000000);
		notebook.showInfo();
		
//		notebook.setPrice(9000);	// price field : Read Only
		notebook.showInfo();
	}

}
