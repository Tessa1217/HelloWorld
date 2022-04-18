package baekjoon.loop;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		// 1부터 입력받은 숫자까지의 합 구하기
		Scanner scn = new Scanner(System.in);
		int range = scn.nextInt();
		int sum = 0;
		for (int i = 1; i <= range; i++) {
			sum += i;
		}

		System.out.println(sum);
	}

}
