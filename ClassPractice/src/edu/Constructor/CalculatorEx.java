package edu.Constructor;

public class CalculatorEx {
	public static void main(String[] args) {
		Calculator cal1 = new Calculator();

		cal1.PowerOn();

		int num1 = 20;
		int num2 = 15;

		int result = cal1.plus(num1, num2);
		System.out.println(result);

		result = cal1.minus(num1, num2);
		System.out.println(result);

		result = cal1.multiple(num1, num2);
		System.out.println(result);

		double resultDouble = cal1.divide(num1, num2);
		System.out.println(resultDouble);

		cal1.PowerOff();
	}

}
