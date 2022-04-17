package edu.app;

public class MultipleTable {

	private int score = 0;

	public void getCurrentScore() {
		System.out.println("*****************");
		System.out.printf("Your score: %5d\n", score);
		System.out.println("*****************");
	}

	public int executeGame() {
		int num1 = (int) (Math.random() * 19 + 1);
		int num2 = (int) (Math.random() * 19 + 1);
		System.out.println("Quiz!");
		System.out.println(num1 + " * " + num2 + " = ");
		return num1 * num2;
	}

	public int quizScore(int answer, int result) {
		int game = 0;
		if (answer == result) {
			score += 10;
			if (score == 100) {
				game = 1;
			}
		} else if (answer != result) {
			score -= 10;
			if (score < 0) {
				game = -1;
			}
		}
		return game;
	}

}
