package edu.Constructor;

public class Calculator {

	void PowerOn() {
		System.out.println("Power On");
	}

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	int minus(int x, int y) {
		int result = x - y;
		return result;
	}

	int multiple(int x, int y) {
		int result = x * y;
		return result;
	}

	double divide(int x, int y) {
		double result = x / (1.0 * y);
		return result;
	}

	void PowerOff() {
		System.out.println("Power Off");
	}

}
