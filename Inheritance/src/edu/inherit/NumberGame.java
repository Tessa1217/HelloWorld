package edu.inherit;

import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		boolean[] check = new boolean[5];
		int[] intAry = new int[5];
		for (int i = 0; i < intAry.length;) {
			int number = (int) (Math.random() * 5 + 1);
			if (check[number - 1] != true) {
				intAry[i] = number;
				check[number - 1] = true;
				i++;
			}
		}

		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
		}

		Scanner scn = new Scanner(System.in);
		System.out.println("5를 찾아주세요 (1~5번째)");
		System.out.println("선택 >>> ");
		int answer = scn.nextInt();
		if (intAry[answer - 1] == 5) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("오답입니다.");
		}
	}
}
