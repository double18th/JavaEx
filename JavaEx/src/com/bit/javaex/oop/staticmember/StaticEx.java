package com.bit.javaex.oop.staticmember;

// 멤버의 범위 확인
public class StaticEx {
	// static과 instance 변수는 클래스 영역에 선언
	public static int refCount;	// 클래스 변수(인스턴스화 하지 않아도 접근 가능)
	public static String classVar; // 클래스 변수
	// static 메소드 안 쪽에서는 static 멤버만 접근 가능
	
	public String instanceVar;	// 인스턴스 변수
	// instance 변수는 생성된 개별 인스턴스 내부에서만 활용 가능
	// -> static 멤버에서는 확인할 수 없음
	
	static {
		// 클래스 변수의 초기화를 담당 (static{})
		// 해당 클래스가 최조 사용될 때 한번 실행되어 프로그램 종료시 해제(소멸)됨
		refCount = 0;
		classVar = "Static Member";
		System.out.println("----- Static Block");
//		instanceVar = "Instance Var";
		// static 영역에서는 static만 접근 가능하므로 에러 발생 
	}
	
	// 생성자 -> Instance 멤버의 초기화를 담당
	public StaticEx() {	// 인스턴스의 초기화 : 생성자
		refCount++;;		//static 변수이므로 어디서든 접근 가능(공유 영역) 
		//생성자가 실행될 때마다 -> instance가 새로 생성될 때마다 
		//refCount가 하나씩 늘어남
		System.out.println("참조 개수 : " + refCount);
		System.out.println("----- Instance 생성");
	}
	
	// 생성자가 있는 것처럼 소멸자도 있음(꼭 알아야할 필요는 없음)
	// 인스턴스가 메모리에서 삭제(소멸)될 때 -> 정리코드. 정리 작업 수행 
	// 생성될 때 refCount가 증가했으므로 반대로 하나씩 감소시켜보기
	protected void finalize() throws Throwable {
		refCount --;
		System.out.println("----- 소멸자 호출");
	}
	
	
	
}
