package edu.game;

import java.util.Scanner;

public class NumberGuess4 {
	public static void main(String[] args) {
		int[] intAry = new int[5];
		for (int i = 0; i < intAry.length; i++) {
			int number = (int) (Math.random() * 5 + 1);
			intAry[i] = number;
			for (int j = 0; j < i; j++) {
				if (intAry[i] == intAry[j]) {
					i--;
				}
			}
		}

//		for (int number : intAry) {
//			System.out.println(number);
//		}

		System.out.println();

		String[] locationList = new String[5];
		for (int i = 0; i < locationList.length; i++) {
			locationList[i] = "[*] ";
		}

		Scanner scn = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("5의 위치를 맞춰보세요 (1~5번째) >>> ");
			int location = scn.nextInt();
			for (int i = 0; i < intAry.length; i++) {
				if (intAry[location - 1] == 5) {
					System.out.println("맞추셨습니다. 5는 " + location + "번째에 있었습니다.");
					run = false;
					break;
				}
				if (locationList[location - 1] == "[*] ") {
					locationList[location - 1] = "[" + intAry[location - 1] + "] ";
				}
				System.out.print(locationList[i] + " ");
			}
			System.out.println();
		}
	}
}
