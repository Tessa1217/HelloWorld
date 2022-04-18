package edu.abstracts;

public class Avante extends Car {

	@Override
	public void turnOn() {
		System.out.println("아반떼가 시동을 켭니다.");
	}

	@Override
	public void start() {
		System.out.println("아반떼가 출발합니다.");
	}

	@Override
	public void run() {
		System.out.println("아반떼가 운행 중입니다.");
	}

	@Override
	public void stop() {
		System.out.println("아반떼가 멈춥니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("아반떼가 시동을 끕니다.");
	}

	// 메소드 이름이 다 다를 경우 추후 프로그램에서 다 개별적으로 호출 필요
	// => 추상 클래스를 구현하는 이유 (메소드 이름 통일, 시간 절약, 설계 규격 생성)

	/*
	 * public void powerOn() { // 시동켜는 기능 System.out.println(); }
	 * 
	 * public void startUp() { // 출발하는 기능 System.out.println(); }
	 * 
	 * public void running() { // 운행 중 기능 System.out.println(); }
	 * 
	 * public void stopCar() { // 멈춤 기능 System.out.println(); }
	 * 
	 * public void powerOff() { // 시동 끄는 기능 System.out.println(); }
	 */

}
