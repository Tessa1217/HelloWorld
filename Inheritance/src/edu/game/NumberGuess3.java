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
		int[] storedLocation = new int[5];
		int userLocation = 0;
		while (run) {
			System.out.println("5의 위치를 맞춰보세요 >>> ");
			int location = scn.nextInt();
			storedLocation[location - 1] = location;
			userLocation++;

			for (int i = 0; i < intAry.length; i++) {
				if (storedLocation[i] != 0) {
					locationList[i] = "[" + intAry[i] + "] ";
				}
			}

			for (int i = 0; i < locationList.length; i++) {
				if (intAry[location - 1] == 5) {
					System.out.println("맞추셨습니다.");
					run = false;
					break;
				}
				System.out.print(locationList[i]);
			}
			System.out.println();

		}

	}
}
