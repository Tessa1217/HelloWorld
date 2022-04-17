package edu.app;

import java.util.Scanner;

public class MultipleGame {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		MultipleTable multiple = new MultipleTable();

		while (true) {
			System.out.println();
			System.out.println("01.Play Game 02.Check Score 03.Quit");
			int menu = scn.nextInt();

			if (menu == 1) {
				int answer = multiple.executeGame();
				System.out.println("Your answer >>> ");
				int result = scn.nextInt();

				int game = multiple.quizScore(answer, result);

				if (game == 1) {
					System.out.println("You won!");
				} else if (game == -1) {
					System.out.println("Game Over!");
				}
			} else if (menu == 2) {
				multiple.getCurrentScore();
			} else if (menu == 3) {
				System.out.println("End of Program");
			}

		}

	}

}
