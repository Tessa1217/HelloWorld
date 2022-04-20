package edu.nested;

import edu.nested.Outer.Inner;
import edu.nested.Outer.Inner2;

public class Main {
	public static void main(String[] args) {

		Outer outer = new Outer();
		outer.method1();

		// Instance 멤버클래스
		Inner inner = outer.new Inner();
		inner.method2();

		// OR

		Outer.Inner inner2 = outer.new Inner();
		// import 안 할 경우 외부.내부 인스턴스명 = 외부 인스턴스명.new 연산자
		inner2.method2();

		System.out.println();

		// Static 멤버클래스
		Outer.Inner2.f4 = "*"; // 정적 필드
		Outer.Inner2.method4(); // 정적 메소드
		System.out.println(Outer.Inner2.f4);
		System.out.println();

		Outer.Inner2 inner3 = new Outer.Inner2(); // 인스턴스 생성
		inner3.method5(); // 인스턴스 메소드
		inner3.f5 = "*"; // 인스턴스 필드
		System.out.println(inner3.f5);

	}
}
