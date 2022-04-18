package edu.game;

import java.util.Scanner;

public class NumberGuess5 {
	public static void main(String[] args) {
		int[] intAry = null;
		boolean run = true;
		Scanner scn = new Scanner(System.in);

		System.out.println("범위 설정 >>> ");
		int range = scn.nextInt();
		intAry = new int[range];

		for (int i = 0; i < intAry.length; i++) {
			int number = (int) (Math.random() * intAry.length + 1);
			intAry[i] = number;
			for (int j = 0; j < i; j++) {
				if (intAry[i] == intAry[j]) {
					i--;
				}
			}
		}

		String[] locationList = new String[range];
		for (int i = 0; i < locationList.length; i++) {
			locationList[i] = "[*] ";
		}

		System.out.println("맞출 숫자를 설정해주세요 >>> ");
		int target = scn.nextInt();

		while (run) {

			System.out.println(target + "의 위치를 맞춰보세요: ");
			int location = scn.nextInt();
			for (int i = 0; i < intAry.length; i++) {
				if (locationList[location - 1] == "[*] ") {
					locationList[location - 1] = "[" + intAry[location - 1] + "] ";
				}
				if (intAry[location - 1] == target) {
					System.out.println("맞추셨습니다. " + target + "은 " + location + "번째 위치에 있었습니다.");
					run = false;
					break;
				}
				System.out.printf(locationList[i] + " ");
			}
			System.out.println();
		}
	}
}
