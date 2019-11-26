package com.bit.javaex.basic.reftype;

public class EnumEx {

	public static void enumTest() {
		DayOfWeek dow = DayOfWeek.WEDNESDAY;	// 데이터 제한
		
		// DayOfWeek.WEDNESDAY 열거 상수 이름과 순서를 확인
		System.out.printf("Today is %s(%d)%n", 
					dow.name(), dow.ordinal());
		
		// 문자열을 가지고 있을 때, 해당 문자열과 일치하는 열거 상수를 얻어오기
		DayOfWeek dow2 = DayOfWeek.valueOf("FRIDAY");
		System.out.printf("%s(%d)%n", dow2.name(), dow2.ordinal());
	}
	
	public static void enumTest2() {
		// switch 연습 때 만들었던 내용을 enum으로 해보기
		DayOfWeek today = DayOfWeek.WEDNESDAY;
		String message;
		
		switch (today) {
		case MONDAY :
		case TUESDAY :
		case WEDNESDAY : 
		case THURSDAY :
			message = "열공";
			break;
		case FRIDAY :
			message = "불금";
			break;
		case SATURDAY : 
		case SUNDAY : 
			message = "휴식";
			break;
		default : 
			message = "?";
		}
		System.out.println(message);
	}
	
	public static void main(String[] args) {
//		enumTest();
		enumTest2();

	}

}
