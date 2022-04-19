package edu.interfaces;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("= Turn on Audio =");
	}

	@Override
	public void turnOff() {
		System.out.println("= Turn off Audio =");
	}

	@Override
	public void volumeUp() {
		System.out.println("= Audio volume up =");
	}

	@Override
	public void volumeDown() {
		System.out.println("= Audio volume down =");
	}

}
