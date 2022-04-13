package co.edu.dimension;

import java.util.Scanner;

public class TwoArrayEx5 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("배열의 행을 결정하세요.");

		int column = scn.nextInt();
		int[][] alphabet = new int[column - 1][];

		for (int i = 0; i < alphabet.length; i++) {
			System.out.println((i + 1) + "번째 행의 열을 결정하세요 >> ");
			alphabet[i] = new int[scn.nextInt()];
		}

		int num = 65;
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet[i].length; j++) {
				alphabet[i][j] += num++;
				System.out.printf("%3s", (char) alphabet[i][j]);
			}
			System.out.println();
		}
	}

}
