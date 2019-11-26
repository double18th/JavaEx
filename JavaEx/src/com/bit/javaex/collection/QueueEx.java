package com.bit.javaex.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	// Queue : 파이프를 연상
	//	입력 방향과 출력 방향이 반대이며 (First Input First Output)
	//  중간에 값을 넣고 뺄 수는 없다
	public static void main(String[] args) {
		// Queue를 만들어보자
		// Queue는 클래스가 아니라 Interface
		// 	(실체 클래스 : LinkedList의 저장 기능을 그대로 이용)
		//	(ArrayList는 안됨)
		Queue<Integer> queue = new LinkedList<>();
		
		// 데이터를 제공
		for (int i = 1; i <=10; i++) {
			queue.offer(i);		// queue에 데이터 넣기
		}
		
		System.out.println("QUEUE : " + queue);
		
		// 가장 처음 입력된 값 확인
		int out = queue.peek();		// queue에서 데이터 꺼내기
		System.out.println("PEEK : " + out);
		System.out.println("QUEUE : " + queue);
		// 데이터를 꺼내지는 않고 확인만 함
		
		// 데이터 꺼내기 -> poll()
		out = queue.poll();
		System.out.println("POLL : " + out);
		System.out.println("QUEUE : " + queue);
		// 데이터를 꺼내어 삭제
		
		// 루프를 돌려 전체 데이터 꺼내기
		while (!queue.isEmpty()) {
			System.out.println("POLL : " + queue.poll());
			System.out.println("QUEUE : " + queue);
		}
	}

}
