package edu.game;

import java.util.Scanner;

public class NumberGuess3 {
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

//		for (int i = 0; i < intAry.length; i++) {
//			System.out.print(intAry[i]);
//		}

		System.out.println();

		String[] locationList = new String[5];
		for (int i = 0; i < locationList.length; i++) {
			locationList[i] = "[*] ";
		}

		Scanner scn = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("5의 위치를 맞춰보세요 >>> ");
			int location = scn.nextInt();

			for (int i = 0; i < intAry.length; i++) {
				if (intAry[location - 1] == 5) {
					System.out.println("정답입니다.");
					run = false;
					break;
				}
				if (locationList[location - 1] == "[*] ") {
					locationList[location - 1] = "[" + intAry[location - 1] + "] ";
				}
				System.out.print(locationList[i]);
			}
			System.out.println();
		}

	}
}
