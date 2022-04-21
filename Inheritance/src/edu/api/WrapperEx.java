package edu.api;

public class WrapperEx {
	public static void main(String[] args) {
		// Wrapper = primitive type to reference type (boxing)
		// 기본 데이터에서 참조 데이터(클래스형)으로 바꿔줌
		// int, long, byte, float -> Integer, Long, Byte, Float

		int n1 = 100;
		Integer n2 = 200; // 박싱 (primitive to reference)
		// Integer n2 = new Integer(200);
		int n3 = 200;
		n1 = n2; // 언박싱 (reference to primitive)

		Float f1 = 12.3f;
		float f2 = f1;
		f1.intValue(); // boxing
		// f2.intValue(); unboxing

		// Integer 클래스 메소드들
		System.out.println(n2.hashCode());
		System.out.println(n2.byteValue());
		System.out.println(n2.doubleValue());
		System.out.println(n2.equals(n1)); // false
		System.out.println(n2.equals(n3)); // true
		System.out.println(n2.toString()); // 200

		Integer num1 = Integer.parseInt("100");
		int num2 = Integer.parseInt("200");

	}
}
