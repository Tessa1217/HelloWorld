package co.edu.array;

public class ArrayEx3 {
	public static void main(String[] args) {
		int[] intAry = { 78, 83, 88, 92, 63, 44, 55 };

		// array.length = 배열의 크기 구하는 메소드
		System.out.println("배열의 크기: " + intAry.length);

		// 배열 요소들의 합 구하기
		int sum = 0;
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
		}
		System.out.println("배열 요소들의 합은 " + sum + "입니다.");
		

		// 배열 요소들의 평균
		double avg;
		avg = sum / (1.0 * intAry.length);
		System.out.println("배열 요소들의 평균은 " + avg + "입니다.");

		// 홀수번째 배열 요소들의 합과 평균
		int cnt = 0;
		sum = 0;
		for (int i = 0; i < intAry.length; i++) {
			if (i % 2 == 0) { // 인덱스는 0부터 시작하는 것 유의 필요
				sum += intAry[i];
				cnt++;
			}
		}

		System.out.println("홀수 번째 배열 요소들의 합은 " + sum + "입니다.");
		avg = sum / (cnt * 1.0);
		System.out.println("홀수 번째 배열 요소들의 평균은 " + avg + "입니다.");

		// 배열 내 짝수 값들의 합과 평균
		sum = 0;
		cnt = 0;
		for (int i = 0; i < intAry.length; i++) {
			if (intAry[i] % 2 == 0) {
				sum += intAry[i];
				cnt++;
			}
		}
		System.out.println("짝수 값들의 합은 " + sum + "입니다.");
		avg = sum / (cnt * 1.0);
		System.out.println("짝수 요소들의 평균은 " + avg + "입니다.");

		// 배열 내 최솟값, 최대값 구하기
		int maxVal = 0;
		int minVal = intAry[0];
		for (int i = 0; i < intAry.length; i++) {
			if (maxVal < intAry[i]) {
				maxVal = intAry[i];
			}
			if (minVal > intAry[i]) {
				minVal = intAry[i];
			}
		}
		System.out.println("배열 요소들 중 최대값은 " + maxVal + "입니다.");
		System.out.println("배열 요소들 중 최솟값은 " + minVal + "입니다.");

	}
}
