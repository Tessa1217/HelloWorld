package edu.Constructor;

public class StaticCalculator {
	static double pi = 3.14;
	
	static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	static double add(double num1, double num2) {
		return num1 + num2;
	}
	
	static int sub(int num1, int num2) {
		if(num1 > num2) {
			return num1 - num2;
		} else {
			return num2 - num1;
		}
	}
	
	static double getCircleArea(double radius) {
		return pi * radius * radius;
	}
}
