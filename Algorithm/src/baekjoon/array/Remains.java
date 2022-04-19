package baekjoon.array;

public class Remains {
	public static void main(String[] args) {
		int[] intAry = { 39, 40, 41, 42, 43, 44, 82, 83, 84, 85 };
		int cnt = 0;
		for (int i = 0; i < intAry.length; i++) {
			intAry[i] %= 42;
			System.out.println(intAry[i]);
		}
	}
}
