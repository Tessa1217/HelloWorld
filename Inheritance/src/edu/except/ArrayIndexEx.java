package edu.except;

public class ArrayIndexEx {
	public static void main(String[] args) {

		String[] strList = new String[3];
		strList[0] = "hello";
		strList[1] = "java";

		for (int i = 0; i < 4; i++) {
			try {
				System.out.println(strList[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 범위를 넘어섰습니다.");
			}
		}

	}

}
