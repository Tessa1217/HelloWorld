package edu.Constructor;

public class Calculator {
	
	//Field
	private String company = "Samsung";
	private String year = "2021";
	
	//Method
	
	public String getCompany() {
		return company;
	}

	public String getYear() {
		return year;
	}
	
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

	// 매개 변수의 개수가 가변적으로 들어가는 경우 
	int sumAllValues(int[] values) {
		int sum = 0;
		for (int value : values) {
			sum += value;
		}
		return sum;
	}
	
	//매개 변수로 매번 배열 선언을 하지 않기 위해 값의 목록만 넘겨주는 방법
	int factorials(int ... values) {
		int factorial = 1;
		for(int value:values) {
			factorial *= value;
		}
		return factorial;
	}

	void PowerOff() {
		System.out.println("Power Off");
	}

}
