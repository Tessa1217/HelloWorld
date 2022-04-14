package edu.Constructor;
import java.util.Scanner;

public class CalculatorEx {
	public static void main(String[] args) {
		Calculator cal1 = new Calculator();
		
		System.out.println(cal1.getCompany());
		System.out.println(cal1.getYear());
		
		cal1.PowerOn();
		System.out.println();

		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해주세요 >>> ");
		int num1 = scn.nextInt();
		System.out.println("두번째 숫자를 입력해주세요 >>> ");
		int num2 = scn.nextInt();

		int result = cal1.plus(num1, num2);
		System.out.println("두 수의 합: " + result);

		result = cal1.minus(num1, num2);
		System.out.println("두 수의 차: " + result);

		result = cal1.multiple(num1, num2);
		System.out.println("두 수의 곱: " + result);

		double resultDouble = cal1.divide(num1, num2);
		System.out.println("두 수의 나눗셈: " + resultDouble);

		// 매개 변수의 개수가 가변적으로 들어가는 경우: 
		//배열로 선언할 경우 메소드 호출 시 배열을 넘겨줄 때 배열의 항목 값들을 전부 전달
		int[] values1 = { 1, 2, 3, 4, 5 };
		result = cal1.sumAllValues(values1);
		System.out.println(result);
		
		//배열이 아닌 값의 목록만 넘겨줌
		result = cal1.factorials(1, 2, 3, 4, 5);
		System.out.println(result);
		
		System.out.println();
		cal1.PowerOff();
	}

}
