package edu.interfaces;

import java.util.function.IntFunction;

// 인터페이스
interface Runnable {
	public void run();
}

// 구현 객체
class RunClass implements Runnable {
	@Override
	public void run() {
		System.out.println("Running");
	}
}

public class RunnableEx {
	public static void main(String[] args) {
		// Runnable runnable = new 구현객체();
		Runnable runnable = new RunClass();
		runnable.run();

		// 익명 객체 - 구현 클래스 선언 없이 익명의 객체를 통해서 인터페이스의 run() 메소드 호출
		runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Dog is running");
			}
		};
		runnable.run();

		runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Cat is running");
			}
		};
		runnable.run();

		// 람다식 표현 (함수지향적)
		runnable = () -> {
			System.out.println("Zebra is running");
		};
		runnable.run();

		// 간략화된 표현식
		runnable = () -> System.out.println("Person is running");
		runnable.run();

	}
}
