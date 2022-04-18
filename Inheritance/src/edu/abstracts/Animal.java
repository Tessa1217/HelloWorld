package edu.abstracts;

public abstract class Animal {
	// Animal() 생성자로 인스턴스 생성 X

	public Animal() {

	}

	// 추상(abstract) 메소드의 경우 구현부 없이 해당 메소드만 정의
	// => 추상 클래스 상속 받은 실행 클래스에서 반드시 재정의
	public abstract void eat();

	public abstract void run();

	// 일반 메소드
	public void sleep() {
		System.out.println("동물이 잠을 잡니다.");
	}
}
