package com.bit.javaex.oop.goods.point.v3;
// Point 클래스를 확장
public class ColorPoint extends Point{
	// 부모가 가진 멤버 이외의 것들만 추가로 정의 (overriding)
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		// 자식 생성자에서 특별한 조치를 하지 않으면 부모의 기본 생성자를 호출
		// 그러나 부모의 기본 생성자가 존재하지 않는 상태이므로 에러가 발생함
		// -> 명시적으로 부모가 가진 생성자를 호출해야함(필수)
		super(x,y);	
		this.color = color;
	}
	
	// Getter, Setter 생성 
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void draw() { 
		System.out.printf("색깔점(%s) [%d, %d]를 그렸습니다.%n",
				color, x, y);	
		// 그냥 x,y를 쓰면 private이라 오류 발생
	}
	
	@Override
	public void draw (boolean draw) {
		String message = String.format("색깔점(%s) [%d, %d]를 ",
				color, x, y); 
		// 부모 클래스의 접근 제한자 private -> protected로 수정했으므로 
		// super.getX() 사용하지 않아도 됨. 
		if (draw) {
			message += "그렸습니다.";
		} else {
			message += "지웠습니다.";
		}
		System.out.println(message);
	}
}
