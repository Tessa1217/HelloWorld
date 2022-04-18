package edu.polymorphism;

public class Tire {
	// 필드
	public int maxRotation; // 최대 타이어 사용 횟수(회전수)
	public int accumulateRotation = 0; // 누적 타이어 회전수
	public String location; // 자동차 바퀴의 위치

	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// 메소드

	// 회전할 때마다 누적 타이어 회전수 추가
	public boolean roll() {
		accumulateRotation++;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + " Tire수명 = " + (maxRotation - accumulateRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + " Tire가 펑크났습니다. ***");
			return false;
		}
	}
}
