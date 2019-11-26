package com.bit.javaex.api.generic.ex1;

public class BoxApp {

	public static void main(String[] args) {
		// Box 클래스 테스트
		Box intBox = new Box();
		intBox.setContent(2019);
		
		// 내용물을 꺼내봅시다
		int retVal = (int)intBox.getContent();	
		// 안쪽에 object가 있어 오류 발생하므로 다운캐스팅 진행해야함
		System.out.println(retVal);
		
		Box strBox = new Box();
		strBox.setContent("Java");
		
		String strVal = (String)strBox.getContent();
		// 묵시적 변환이 되지 않으므로 강제로 캐스팅 진행
		System.out.println(strVal);
		// Object 타입을 데이터 참조하게 되면
		// 캐스팅 문제등 여러 부가적 문제가 발생 
		
		// 캐스팅을 잘못할 경우 
		strVal = (String)intBox.getContent();
		// 컴파일은 가능하나 런타임 에러 발생함

	}

}
