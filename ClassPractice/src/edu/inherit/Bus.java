package edu.inherit;

public class Bus extends Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println("버스가 멈춥니다.");
	}
}
