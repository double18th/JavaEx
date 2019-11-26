package com.bit.javaex.oop.goods.v1;

public class GoodsApp {
	// Goods 테스트 실행 클래스이므로 main 필요
	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.name = "Samsung";
		camera.price = 400000;
		// 필드나 메소드에 접근할 때는 이름 뒤에 .을 찍어준다
		
//		System.out.println("Camera : " + camera);
		// com.bit.javaex.oop.goods.v1.Goods@15db9742 
		// -> 클래스 주소가 출력됨
		System.out.printf("Camera : %s, %d원%n", 
				camera.name, camera.price);
		
		Goods notebook = new Goods();
		notebook.name = "LG Gram";
		notebook.price = 900000;
		System.out.printf("Notebook : %s, %d원%n", 
				notebook.name, notebook.price);
	
	}

}
