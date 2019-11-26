package com.bit.javaex.api.generic.ex2;

public class BoxApp {

	public static void main(String[] args) {
		// Box 클래스 테스트
		Box<Integer> intBox = new Box<>();
		intBox.setContent(2019);
		//intBox.setContent("String");	
		//컴파일 에러로 잡아줌. 내부 데이터는 Integer
		
		// 내용물을 꺼내봅시다
		// 내용물의 타입을 객체 생성시 지정했기 때문에 다운 캐스팅이 필요 없음
		int retVal = intBox.getContent();	
		System.out.println(retVal);
		
		Box<String> strBox = new Box<>();
		strBox.setContent("Java");
		
		String strVal = strBox.getContent();
		// 묵시적 변환이 되지 않으므로 강제로 캐스팅 진행
		System.out.println(strVal);
		// Object 타입을 데이터 참조하게 되면
		// 캐스팅 문제등 여러 부가적 문제가 발생 
		
		// 캐스팅을 잘못할 경우 
		// Generic으로 만든 클래스는 내부 데이터 타입을 강제했기 때문에 
		// 컴파일 타임에서 캐스팅 오류르 잡아낼 수 있다
//		strVal = (String)intBox.getContent();
		

	}

}
