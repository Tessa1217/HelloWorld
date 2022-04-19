package edu.interfaces;

import java.util.stream.IntStream;

// IntStream API
public class StreamPrac {
	public static void main(String[] args) {

		// IntStream 생성
		IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
		intStream.forEach(System.out::println);

		// 1~100까지 짝수 출력
		IntStream.range(1, 100).filter(i -> i % 2 == 0).forEach((i) -> System.out.print(i + " "));
		System.out.println();

		// iterator()
		IntStream.range(1, 50).filter(i -> i % 2 == 0).limit(5).forEach(System.out::println);

		// 1~100까지 짝수의 합 출력
		int sum = IntStream.range(1, 100).filter(i -> i % 2 == 0).sum();
		System.out.println(sum);

		// 1~100까지 홀수 출력
		IntStream.range(1, 100).filter(i -> i % 3 == 0).forEach(System.out::println);

		// 1~1000까지의 값 중 200 이상이면서 5의 배수인 합
		System.out.println(IntStream.range(1, 1000).skip(200).filter(i -> i % 5 == 0).sum());

		// Intstream 출력
		IntStream oddNum = IntStream.range(1, 100).filter(i -> i % 3 == 0);
		oddNum.sorted().forEach((i) -> {
			System.out.print(i + " , ");
		});
	}
}
