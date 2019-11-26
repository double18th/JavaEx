package com.bit.javaex.api.objectclass.ex03;
// 특정 클래스를 extends 하지 않아도 
// java.lang.Objext 클래스를 상속받게 된다
// java의 최상위 클래스는 언제나 Object 
// 복제 가능하도록 Clonable implement
public class Point implements Cloneable {
	// Cloneable 인터페이스를 구현하면
	// 내부에서 clone 메소드를 사용할 수 있게 된다 

	// 필드
	private int x;
	private int y;
	
	// 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 문자열 출력을 위한 toString 메소드 오버라이드
	@Override
	public String toString() {
		return String.format("Point(%d, %d)%n", x, y);
		// 출력할 데이터 문자열을 리턴
	}
		
	// 내부 값의 비교를 위해서 equals 메소드 오버라이드 	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			// obj는 Point의 객체 -> 캐스팅 가능
			Point other = (Point)obj;
			// 각 x, y 값을 비교할 수 있게됨
			return x == other.x && y == other.y;			
		} 
		return super.equals(obj);		// Point가 아닐 경우
	}
	
	// 복제 객체를 얻기 위한 메소드 작성
	public Point getClone() {
		// 현재 인스턴스를 복제(clone)해서
		// 새 Point를 만들어서 return
		Point newPoint = null;
		
		try {
			newPoint = (Point)clone();
			// obj가 나올 수 있으므로 복제 후 강제 캐스팅
		} catch (CloneNotSupportedException e) {
			// 만약 복제 실패시 CloneNotSupportedException이 발생
			e.printStackTrace();
		}
		
		return newPoint;	// 복제된 샌 객체를 리턴
	}

}