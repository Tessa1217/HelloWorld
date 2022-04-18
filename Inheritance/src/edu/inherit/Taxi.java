package edu.inherit;

public class Taxi extends Car {

	// Field
	String type; // 개인 택시, 회사 택시

	// Constructor
	public Taxi() {
		System.out.println("Taxi() 생성자 호출");
	}

	// Method
	public void meter(int taxiFee) {
		System.out.println("요금 계기판: " + taxiFee + "원");
	}

	@Override
	public void drive() {
		System.out.println("택시가 운행을 합니다.");
	}

	@Override
	public String toString() {
		return "택시의 종류는 " + type;
	}
}
