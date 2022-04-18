package baekjoon.loop;

import java.util.Scanner;

public class AplusB {
	public static void main(String[] args) {
		// 두 수의 합 출력하기
		Scanner scn = new Scanner(System.in);
		int loop = scn.nextInt();
		int[] intAry = new int[loop];
		for (int i = 0; i < loop; i++) {
			int a = scn.nextInt();
			int b = scn.nextInt();
			intAry[i] = a + b;
		}

		for (int num : intAry) {
			System.out.println(num);
		}
	}
}
