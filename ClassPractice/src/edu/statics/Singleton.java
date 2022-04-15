package edu.statics;

// 싱글톤 패턴 : 하나의 객체만 생성하는 것을 보장하는 패턴
public class Singleton {
	
	// 자신의 타입인 정적 필드를 선언하고 객체 생성 후 초기화 
	// 클래스 내부에서만 new 연산자로 생성자 호출이 가능 (private 접근 제한자)
	private static Singleton singleton = new Singleton();
		
	// 생성자를 private으로 선언 = 외부에서 new 연산자로 인스턴스 생성 방지
	private Singleton() {
		
	}
	
	//정적 메소드인 getInstance() 선언하여 외부에서 호출 가능하게 만듬
	public static Singleton getInstance() { 
		return singleton; 
	}
	
	// 접근 제한자
	//명시적으로 지정해주지 않을 경우 접근제한자는 default로 지정
	// default = 동일한 패키지 내에서만 접근 가능한 접근 제한자
	// public = 다른 패키지에서도 접근 가능한 접근 제한자
	// private = 클래스 내부에서만 접근 가능한 접근 제한자
	// protected
}
