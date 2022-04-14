package edu.Constructor;

public class CircleEx {
	public static void main(String[] args) {
		Circle circle1 = new Circle();

		// 파이값 메소드 호출
		circle1.printPI();

		// 원의 넓이 메소드 호출
		// double result = circle1.getArea(2.4); 리턴 타입이 없기 때문에 변수에 값을 담을 수 없음
		circle1.getArea(5);
		
		// 대표적인 메소드 오버라이딩: println (char, int, double ...)
		// sum에 대한 오버로딩
		int result = circle1.sum(30, 23);
		System.out.println("두 수의 합: " + result);

		double result2 = circle1.sum(1.0, 3.4);
		System.out.println("두 실수의 합: " + result2);

		result2 = circle1.sum(1, 4.8);
		System.out.println("두 수의 합: " + result2); // 정수 + 실수 => double sum을 호출

		int[] intAry = { 10, 20, 30, 40 };
		result = circle1.sum(intAry);
		System.out.println("배열 intAry의 합은 " + result + "입니다.");

		result = circle1.sum(new int[] { 10, 20, 30, 40, 50 });
		System.out.println("배열의 합은 " + result + "입니다.");
		
		// 리턴되는 값을 받는 변수의 타입 유의하여 작성
		result2 = circle1.average(10, 5, 30); //result 사용 시 result의 타입이 정수라서 오류 발생 
		
		result2 = circle1.average(10, 20);
		
		// 매개 변수로 여러 값을 넘겨줄 경우
		result = circle1.sum2(10, 20, 30, 40, 50, 60);
		System.out.println("정수들의 합은 " + result + "입니다.");

		// 삼각형의 넓이 구하기
		result2 = circle1.getTriangleArea(24, 15.5);
		System.out.println("삼각형의 넓이는 " + result2 + "입니다.");

		// 메소드 오버로딩 (직사각형과 정사각형의 넓이)
		result2 = circle1.getRectangleArea(3.5);
		System.out.println("정사각형의 넓이는 " + result2 + "입니다.");

		result2 = circle1.getRectangleArea(3.5, 4.5);
		System.out.println("직사각형의 넓이는 " + result2 + "입니다.");

	}
}
