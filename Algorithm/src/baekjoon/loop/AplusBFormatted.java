package baekjoon.loop;

import java.util.Scanner;

public class AplusBFormatted {
	public static void main(String[] args) {
		// 두 수의 합을 정해진 형식으로 출력하기
		Scanner scn = new Scanner(System.in);
		int loop = scn.nextInt();
		int[] intAry = new int[loop];
		for (int i = 0; i < loop; i++) {
			int a = scn.nextInt();
			int b = scn.nextInt();
			intAry[i] = a + b;
		}

		// Case #1: 2 format
		for (int i = 0; i < loop; i++) {
			System.out.println("Case #" + (i + 1) + ": " + intAry[i]);
		}

		// Case #1: 1+1=2; format
		int cases = scn.nextInt();

		for (int i = 0; i < cases; i++) {
			int a = scn.nextInt();
			int b = scn.nextInt();
			System.out.printf("Case #%d: %d + %d = %d\n", (i + 1), a, b, (a + b));
		}
	}
}
