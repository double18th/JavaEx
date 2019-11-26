package com.bit.javaex.collection;

import java.util.Stack;

public class StackEx {
	// Stack
	//	Last Input First Output
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		// Stack은 Vector를 상속하여 만든 것으로, 버퍼가 있는 자료형
		
		// 루프를 돌며 stack에 값을 집어넣기
		for (int i = 1; i <= 10; i++) {
			stack.push(i);	// 스택에 input
		}
		System.out.println("STACK : " + stack);
		// input이 뒤에서 일어난 것
		
		// 가장 마지막 값을 확인 : peek
		int out = stack.peek();
		System.out.println("가장 마지막 입력값 : " + out); 
		System.out.println("STACK : " + stack);
		// 동일함. peek는 데이터를 추출하지는 않기 때문
		
		out = stack.pop(); 		// 데이터를 추출
		System.out.println("POP : " + out);
		System.out.println("STACK : " + stack);
		
		// 루프를 돌며 데이터를 pop
		while (!stack.empty()) {
			// 비어있는 stack에서 데이터를 pop할 경우 익셉션이 발생하므로 조건 설정
			System.out.println("POP : " + stack.pop());
			System.out.println("STACK : " + stack);
		}

	}

}
