package baekjoon.array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinValue {
	public static void main(String[] args) {
		// 최소, 최대값 구하기
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int[] intAry = new int[num];

		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = scn.nextInt();
		}

		// 순서대로 찾기
		int min;
		int max;
		min = max = intAry[0];
		for (int i = 0; i < intAry.length; i++) {
			if (intAry[i] < min) {
				min = intAry[i];
			}
			if (intAry[i] > max) {
				max = intAry[i];
			}
		}

		System.out.println(min + " " + max);

		// Sorting 메소드 이용
		Arrays.sort(intAry);
		System.out.println(intAry[0] + " " + intAry[num - 1]);

	}

}
