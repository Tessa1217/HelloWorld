package edu.abstracts;

public class AnimalEx {
	public static void main(String[] args) {
		// Animal animal = new Animal(); 추상 클래스이기 때문에 새로운 인스턴스 생성 불가

		// Polymorphism
		Animal animal = null;
		animal = new Bird();
		animal.eat();
		animal.run();
		// 추상 클래스(부모 클래스)의 메소드를 그대로 사용한 경우
		animal.sleep();

		animal = new Fish();
		animal.eat();
		animal.run();
		// 추상 클래스(부모 클래스)의 메소드를 재정의한 경우
		animal.sleep();
	}
}
