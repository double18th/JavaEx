package com.bit.javaex.basic.console;

public class ConsoleOutputEx {

	public static void main(String[] args) {
		// 콘솔 출력
		// System.out.print : 출력 후 개행(새로운 행) 없음 
		// System.out.println : 출력 후 개행. ln = line. 표준 에러 (std in)
//				System.err.println : 표준 에러 (std err)
		// System.out.println : 형식 지정 문자열 출력. f는 format의 줄임말
		
		System.out.print("Hello ");  // 개행 없음 (줄 바꿈)
		System.out.println("Java");  // 출력 후 개행 

		
		// 이스케이프 문자 (특수문자로 취급하여 출력할 수 있도록 함)
		// \n (개행), \t (탭), \"(큰 따옴표), 
//		\\ (\ 단독 사용) 아닐 경우 그 다음 문자가 이스케이프 문자 취급.
		System.out.println("Hello\nJava");	// 강제 개행(\n)
		System.out.println("Hello\tJava");	// 탭 문자(\t)
		System.out.println("Hello \"Java\"");	// 큰 따옴표(\")
		
		String dir = "D:\\javastudy"; // 자동으로 \가 두번 들어감
		
		System.out.println("\\ㅇㅁㅇ/ \"야!! 신난다!!\"");	// 백슬래시,"
		
		
	}

}
