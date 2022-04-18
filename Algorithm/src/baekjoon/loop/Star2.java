package baekjoon.loop;

import java.util.Scanner;

public class Star2 {
	public static void main(String[] args) {
		// 별찍기2
		//     *
		//    **
		//   ***
		//  ****
		// *****
		Scanner scn = new Scanner(System.in);
		int lines = scn.nextInt();

		for (int i = 0; i < lines; i++) {
			for (int j = i; j < (lines - 1); j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
