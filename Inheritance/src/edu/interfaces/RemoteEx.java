package edu.interfaces;

public class RemoteEx {
	public static void main(String[] args) {
		// 인터페이스 호출
		// RemoteControl rc = new RemoteControl();
		// 인스턴스 생성 불가 => 구현 객체를 통해서만 구현 가능

		// 상속 관계에서는 부모 클래스의 참조 변수 자식클래스의 인스턴스가 할당

		RemoteControl rc = null;
		rc = new Television();
		// RemoteControl 인터페이스를 구현하는 Television 구현 객체를 통한 인터페이스 생성

		// Television Method
		rc.turnOn();
		rc.turnOff();
		rc.volumeUp();
		rc.volumeDown();
		// Default 메소드 (overriding)
		rc.adjustScreen();

		System.out.println();

		// Constant
		System.out.println(rc.MAX_VOLUME);
		System.out.println(rc.MIN_VOLUME);

		// Static 메소드
		RemoteControl.changeBattery();

		System.out.println();

		rc = new Audio();

		// Audio Method
		rc.turnOn();
		rc.turnOff();
		rc.volumeUp();
		rc.volumeDown();

		// Default 메소드
		rc.adjustScreen(); // => RemoteControl의 메소드

		// => Polymorphism(코드 변경 없이 리턴값 또는 실행 내용 다양해질 수 있음)
		// 그 외 객체 종속성 배제, 객체 대체 가능 등 다양한 이점
	}
}
