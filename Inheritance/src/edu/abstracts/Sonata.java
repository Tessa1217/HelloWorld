package edu.abstracts;

public class Sonata extends Car {

	// Method
	@Override
	public void turnOn() {
		System.out.println("소나타가 시동을 켭니다.");
	}

	@Override
	public void start() {
		System.out.println("소나타가 출발을 합니다.");
	}

	@Override
	public void run() {
		System.out.println("소나타가 운행 중입니다.");
	}

	@Override
	public void stop() {
		System.out.println("소나타가 멈춥니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("소나타가 시동을 끕니다.");
	}

}
