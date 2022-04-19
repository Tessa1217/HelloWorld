package edu.interfaces;

public interface RemoteControl {
	// 상수
	public int MAX_VOLUME = 10; // public static final(상수)
	public int MIN_VOLUME = 0; // public static final(상수)

	// 리모콘이 가지고 있는 추상 메소드 선언
	public void turnOn(); // 켜기

	public void turnOff(); // 끄기

	public void volumeUp(); // 소리 키움

	public void volumeDown(); // 소리 줄임

	// default 메소드

	// 한 구현 객체에만 해당 메소드를 구현하고 싶을 경우:
	public default void adjustScreen() {
		System.out.println("화면을 조정합니다.");
	}

	// static 메소드
	public static void changeBattery() {
		System.out.println("Change battery");
	}

}
