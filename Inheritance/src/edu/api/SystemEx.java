package edu.api;

import java.util.ArrayList;

public class SystemEx {
	public static void main(String[] args) {

		// 종료
		System.out.println("start");
		// System.exit(0);
		System.out.println("start");
		System.out.println("end");

		// 시간을 millisecond 단위로 표현
		long start = System.currentTimeMillis();
		long sum = 0;
		for (int i = 0; i < 1000000; i++) {
			sum += i;
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);

		// 그 외에 nanotime도 있음
		start = System.nanoTime();
		sum = 0;
		for (int i = 0; i < 1000000; i++) {
			sum += i;
		}
		end = System.nanoTime();
		System.out.println(end - start);

		// 배열에 값넣기, 배열 리스트에 값넣기 비교
		start = System.currentTimeMillis();
		int[] intAry = new int[100000];
		for (int i = 0; i < 100000; i++) {
			intAry[i] += (i + 1);
		}
		end = System.currentTimeMillis();
		System.out.println(end - start);

		start = System.currentTimeMillis();
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		for (int i = 0; i < 100000; i++) {
			intArray.add(i + 1);
		}
		end = System.currentTimeMillis();
		System.out.println(end - start);

	}
}
