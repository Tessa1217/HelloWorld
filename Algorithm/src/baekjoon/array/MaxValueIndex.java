package baekjoon.array;

import java.util.Scanner;

public class MaxValueIndex {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] intAry = new int[9];
		// 배열 사용
		int maxVal = 0;
		int idx = 0;
		for (int i = 0; i < 9; i++) {
			intAry[i] = scn.nextInt();
			if (intAry[i] > maxVal) {
				maxVal = intAry[i];
				idx = i + 1;
			}
		}
		System.out.println(maxVal);
		System.out.println(idx);

	}
}
