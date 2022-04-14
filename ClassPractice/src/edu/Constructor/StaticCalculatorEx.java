package edu.Constructor;

public class StaticCalculatorEx {
	public static void main(String[] args) {
		int result1 = StaticCalculator.add(10, 20);
		System.out.println("두 수의 합: " + result1);
		double result2 = StaticCalculator.add(10.2, 3.8);
		System.out.println("두 실수의 합: " +result2);
		result1 = StaticCalculator.sub(10, 20);
		System.out.println("큰 수 - 작은 수: " + result1);
		result2 = StaticCalculator.getCircleArea(19);
		System.out.println("원의 넓이: " + result2);
	}
}
