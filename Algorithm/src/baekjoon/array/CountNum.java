package baekjoon.array;

import java.util.Scanner;
import java.util.stream.Stream;

public class CountNum {
	public static void main(String[] args) {
		// 숫자 3개의 합에서 0~9까지 각각의 숫자가 몇 번씩 쓰였는지 구하는 프로그램
		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		int num3 = scn.nextInt();
		int multiple = num1 * num2 * num3;
		// 곱의 결과를 문자열로 변환
		String number = String.valueOf(multiple);
		// 문자열에서 숫자 배열로 변환
		int[] intAry = Stream.of(number.split("")).mapToInt(Integer::parseInt).toArray();
		for (int i = 0; i < 10; i++) {
			int cnt = 0;
			for (int j = 0; j < intAry.length; j++) {
				if (intAry[j] == i) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}

	}

}
