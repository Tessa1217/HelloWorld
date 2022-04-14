package edu.Constructor;

public class Circle {
	private static double pi = 3.14;

	// 리턴 타입 없는 메소드
	void printPI() {
		System.out.println("파이: " + pi);
	}

	void getArea(double radius) {
		double area = radius * radius * pi;
		System.out.println("반지름 " + radius + "를 가질 때 원의 넓이 => " + area);
	}
	// 리턴 타입 있는 메소드

	// 메소드의 오버로딩 => 동일한 이름의 메소드를 매개 변수의 타입, 개수 순서 중 하나가 다르게 정의해서 쓰는 것
	// 메소드의 오버로딩의 목적 => 매개값을 다양하게 받아 처리
	int sum(int num1, int num2) {
		return num1 + num2;
	}

	double sum(double num1, double num2) {
		return num1 + num2;
	}

	int sum(int[] values) {
		int result = 0;
		for (int value : values) {
			result += value;
		}
		return result;
	}

	// sum 오버로딩 되지 않음: 매개 변수의 선언 방식만 다를 뿐 넘겨주는 타입이 배열이기 때문
	int sum2(int... values) {
		int result = 0;
		for (int value : values) {
			result += value;
		}
		return result;
	}
	
	//평균 구하는 메소드
	double average(int num1, int num2, int num3) {
		return (num1 + num2 + num3)/3.0;
	}
	
	double average(int ... args) {
		int sum = 0;
		for(int arg : args) {
			sum += arg;
		}
		return sum/(1.0 * args.length);
	}
	
	// 매개 변수가 하나이면 정사각형, 두개이면 직사각형 (메소드 오버로딩)
	double getRectangleArea(double width) {
		return width * width;
	}

	double getRectangleArea(double height, double width) {
		return height * width;
	}

	// 밑변과 높이를 입력 => 삼각형의 넓이 계산 메소드 (double 타입 반환)
	double getTriangleArea(double height, double width) {
		return height * width * (0.5);
	}

}
