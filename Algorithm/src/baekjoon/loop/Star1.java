package baekjoon.loop;

import java.util.Scanner;

public class Star1 {
	public static void main(String[] args) {
		// 별찍기
		// *
		// **
		// ***
		// ****
		// *****

		Scanner scn = new Scanner(System.in);
		int lines = scn.nextInt();
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
