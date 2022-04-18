package baekjoon.loop;

import java.util.Scanner;

public class SmallerNumber {
	public static void main(String[] args) {
		// 수열의 길이와 비교 숫자를 입력받고 해당 길이만큼 수를 입력받았을 때
		// 비교 숫자마다 작은 수 출력하기
		Scanner scn = new Scanner(System.in);
		int range = scn.nextInt();
		int compareNum = scn.nextInt();
		int[] intAry = new int[range];

		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = scn.nextInt();
			if (intAry[i] < compareNum) {
				System.out.printf("%d ", intAry[i]);
			}
		}

	}

}
