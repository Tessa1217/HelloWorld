package baekjoon.loop;

import java.util.Scanner;

public class ListingNumber {
	public static void main(String[] args) {
		// 수를 입력받아 1에서부터 수까지 오름차순/내림차순 정렬하여 한줄씩 출력
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		// Ascending order
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}

		System.out.println();

		// Descending order
		for (int i = num; i >= 1; i--) {
			System.out.println(i);
		}
	}

}
