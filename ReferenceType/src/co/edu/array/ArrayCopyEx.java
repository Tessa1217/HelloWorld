package co.edu.array;

public class ArrayCopyEx {
	public static void main(String[] args) {

		int[] scores = { 70, 80, 85, 60, 100 };

		// 배열과 for문의 사용
		for (int score : scores) {
			System.out.println(score);
		}

		System.out.println();

		// System.arraycopy 사용하여 복사하는 경우
		int[] scoresMore = new int[10];
		System.arraycopy(scores, 0, scoresMore, 0, scores.length);
		for (int i = 0; i < scoresMore.length; i++) {
			System.out.println(scoresMore[i]);
		}

		System.out.println();

		if (scores[0] == scoresMore[0]) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		System.out.println();

		// 반복문 사용하여 복사하는 경우
		int[] scoresNew = new int[10];
		for (int i = 0; i < scores.length; i++) {
			scoresNew[i] = scores[i];
		}

		for (int i = 0; i < scoresNew.length; i++) {
			System.out.println(scoresNew[i]);
		}

	}
}
