package edu.interfaces;

// 인터페이스를 구현하는 구현 클래스를 통해서 구현
public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("* Turn on TV *");
	}

	@Override
	public void turnOff() {
		System.out.println("* Turn off TV *");
	}

	@Override
	public void volumeUp() {
		System.out.println("* TV volume up *");
	}

	@Override
	public void volumeDown() {
		System.out.println("* TV volume down *");
	}

	@Override
	public void adjustScreen() {
		// RemoteControl.super.adjustScreen(); => 부모가 가진 기능 그대로 사용
		System.out.println("* Adjust TV screen *");
	}

}
