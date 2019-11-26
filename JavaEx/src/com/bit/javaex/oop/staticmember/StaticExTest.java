package com.bit.javaex.oop.staticmember;

public class StaticExTest {

	public static void main(String[] args) {
		StaticEx s1 = new StaticEx();
		// 처음 StaticEx Class를 불러와야하므로 (객체화 시켜야하므로 설계도 불러오기)
		// static 블록이 1회 호출, 그 이후로 StaticEx의 생성자가 호출 (순서 확인)

		// static 멤버는 new를 이용해 인스턴스화하지 않아도 접근 가능함
		System.out.println("참조 개수 : " + StaticEx.refCount);
		// new를 하지 않아도 실행이 가능. 생성자 x -> 숫자 증가하지 않음 -> 그대로 1 출력
		
		StaticEx s2 = new StaticEx();
		StaticEx s3 = new StaticEx();
		
		s2 = null;	// 사용 해제
		System.out.println("s2를 해제");
		// 아무일도 일어나지 않음. Java가 바로 정리를 하는 것은 아님. 
		// 컴퓨터가 자체적인 판단으로 지워주는 것이므로.
		// 바로 정리를 하기 위해서는 강제로 소멸을 진행.
		
		System.gc();	// gc(garbage collector) 강제 호출
						// 일반적 상황에서는 권장하지 않음
		try {
			Thread.sleep(3000); 	// 3초 대기
			System.out.println("참조 개수 : " + StaticEx.refCount);
		} catch (Exception e) {
			
		}
	}

}
