package edu.except;

public class FinallyEx {
	public static void main(String[] args) {
		int[] intAry = new int[3];
		try {
			for (int i = 0; i < 4; i++) {
				System.out.println(intAry[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 넘어 처리하려고 합니다.");
		} finally {
			System.out.println("End of program");
		}
		// Finally 구문은 반드시 처리
	}

}
