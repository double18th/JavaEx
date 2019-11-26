package com.bit.javaex.api.generic.ex2;

// Generic을 이용해 
// 설계시에는 내부 데이터 타입을 지정하지 않고 설계,
// 실제 객체화할 때 내부 데이터 타입을 사용하도록 강제

// 많이 사용하는 파라미터parameter 관례. 반드시 T로 쓸 필요는 없으나 가능한 지키도록.
// T : Type
// R : Return Type
// K : Key
// V : Value
public class Box<T> {	// 임시 타입. 
	T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
	
}
