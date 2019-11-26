package com.bit.javaex.basic.reftype;

public class StringEx {

	public static void defineStr() {
		// 문자열 선언
		String str; // 선언
		str = "Java";  // 코드에 직접 입력한 값 : Literal (취급 방법 차이)
		String str2 = "Java";  // 리터럴 str과 같은 값
		String str3 = new String("Java");
		
		// == 비교
		System.out.println(str == str2);
		System.out.println(str == str3);	// new String이므로
		// 참조 타입(객체)에서 == 은 객체 주소 비교 (값의 비교가 아님)
		
		// 값의 비교 : Java 모든 객체는 equals라는 값 비교 메소드가 있다. 
		System.out.println(str.equals(str3));	// 값의 비교이므로 true
	}
	
	public static void stringFormatEx() {
		// 포맷 문자 %d(10진수), %s(문자열), %f(실수형), %n(개행)
		//		-> String.format 메소드 or System.out.printf
		String fruit = "사과";
		int total = 10, eat = 3;
		System.out.println(total + "개의 " + fruit + " 중에서 " 
								+ eat + "개를 먹었다.");
		// 가변 데이터 영역을 포맷 문자로 설정하고 
		// 고정 영역을 문자열로 설정. 뒤에 포맷 문자에 연결시킬 데이터를 지정 
		System.out.printf("%d개의 %s 중에서 %d개를 먹었다. %n", 
				total, fruit, eat);	// 적용 순서대로 써야함. 개행 필수.
		
		float rate = 1.2345f;
		// 현재 이자율은 1.23% 입니다. -> 소수점 4자리를 2자리로 줄여야함
		String fmt = "현재 이자율은 %.2f%%입니다. %n";	
		// %f의 경우 소수점 자리수 지정가능(ex- .2)
		// %% -> %로 출력(이스케이프 문자의 백슬래시를 \\ 쓰듯 %% 사용)
		System.out.printf(fmt, rate);
		String s = String.format(fmt, 1.5678f);
		System.out.println(s);	// 가변 데이터 바꿔서 출력 가능 
	}
	
	public static void main(String[] args) {
//		defineStr();
		stringFormatEx();

	}

}
