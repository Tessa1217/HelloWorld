package edu.game;

import java.util.Scanner;

public class NumberGuess2 {
	public static void main(String[] args) {
		int[] intAry = new int[5];
		for (int i = 0; i < intAry.length; i++) {
			int number = (int) (Math.random() * 5 + 1);
			intAry[i] = number;
			for (int j = 0; j < i; j++) {
				if (intAry[j] == intAry[i]) {
					i--;
				}
			}
		}

		for (int i = 0; i < intAry.length; i++) {
			System.out.print(intAry[i] + " ");
		}
		System.out.println();

		Scanner scn = new Scanner(System.in);
		System.out.println("5는 어디 있을까요? (1~5번째)");
		System.out.println("선택 >>> ");
		int location = scn.nextInt();

		if (intAry[location - 1] == 5) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("오답입니다.");
		}

	}

}
