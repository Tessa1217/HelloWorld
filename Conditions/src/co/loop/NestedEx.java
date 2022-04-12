package co.loop;

public class NestedEx {
	public static void main(String[] args) {
		// 중첩 반복문, 구구단 예제(2~9단까지 출력)
		System.out.println("**********");
		for (int j = 2; j <= 9; j++) {
			int dan = j;
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
				if (i == 9) {
					System.out.println("**********");
				}
			}
		}
		
		System.out.println();

	}
}
