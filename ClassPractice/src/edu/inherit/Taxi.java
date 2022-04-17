package edu.inherit;

public class Taxi extends Vehicle {
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println("택시가 멈춥니다.");
	}

}
