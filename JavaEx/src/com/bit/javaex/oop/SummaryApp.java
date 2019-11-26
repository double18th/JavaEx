package com.bit.javaex.oop;
// 기본적으로 class나 interface 등은 각자 개별 파일에 작성해줘야하나 
// Summary므로 하나에 넣음
abstract class Animal {
	// 추상 클래스이니 객체화는 불가. 1개 이상의 추상 메소드를 포함해야함
	// 필드
	protected String name;
	protected int age;
	
	// 생성자
	public Animal(String name) {
		this.name = name;
	}
	
	public Animal(String name, int age) {
		this(name);
		this.age = age;
	}
	// 메서드
	public void eat() { 
		System.out.printf("%s is eating...%n", name); 
	}
	public abstract void say(); // 반드시 Override 해야함		
}

class Human extends Animal {
	// 생성자
	public Human(String name, int age) {
		super(name, age);		
	}
	
	@Override
	public void say() {
		System.out.printf("안녕, 내 이름은 %s야%n", name);
	}
}

class Panda extends Animal {
	// 생성자
	public Panda(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void say() {
		System.out.printf("zzz....");
	}
}

interface Kungfu {
	public void kungfu();	
	// 추상 메소드지만 abstract 생략 가능. 인터페이스 안에 있는 건 전부 추상 메소드이므로.
}

interface Flyable {
	public void fly();
}

class KungfuPanda extends Panda implements Kungfu {
	// 생성자
	public KungfuPanda(String name, int age) {
		super(name, age);
	}
	
	@Override 
	public void kungfu() {
		System.out.println(name + " : 아뵤!");
	}
}

class KungfuHuman extends Human implements Kungfu {
	// 생성자
	public KungfuHuman(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void kungfu() {
		System.out.println(name + ": I know Kungfu!");
	}
	
}
class TheOne extends Human implements Kungfu, Flyable {
	// 상속은 단일 부모로부터만 받을 수 있지만 
	// 인터페이스는 여러개 구현 가능하다
	// 생성자 
	public TheOne(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void fly() {
		System.out.println(name + " : 하늘을 날 수 있어요!");
	}

	@Override
	public void kungfu() {
		System.out.println(name + " : 쿵푸를 할 수 있어요!");
		
	}
}
public class SummaryApp {

	public static void main(String[] args) {
		// 쿵푸를 할 수 있는 배열(도장)을 만들어서
		Human h1 = new Human("앤더슨", 40);
		Human h2 = new KungfuHuman("네오", 40);
		Panda p1 = new Panda("팬더", 30);
		Panda p2 = new KungfuPanda("포", 30);
		
		TheOne neo = new TheOne("NEO", 40);
		fight(h1);
		fight(h2);
		fight(p1);
		fight(p2);
		fight(neo);
		
		
		// 쿵푸 도장을 만들어보기
		// 같은 인터페이스를 구현한 객체는 같은 인터페이스 타입으로 참조할 수 있음
		Kungfu[] dojang = {
//				(Kungfu)h1,		// 캐스팅 필요. 
				(Kungfu)h2,		// h1,p1는 강제 캐스팅이므로 컴파일 시 오류
//				(Kungfu)p1,
				(Kungfu)p2,
				(Kungfu)neo
		};
		
		neo.fly();
	}

	
	public static void fight(Animal a) {
		// 대련을 시켜봅시다
		// 객체가 인터페이스를 구현한 객체인지 먼저 확인 (확인이 없으면 오류 발생)
		if (a instanceof Kungfu) {
		((Kungfu)a).kungfu();	// Animal엔 kungfu가 없으므로 캐스팅 필요
		} else {
			System.out.println(a.name + " : 쿵푸 못해요!"); 
		}
	}
}
