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
		
		// 별찍기
		int star = 5;
		for (int i = 1; i <= star; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 반대로 별찍기
		for (int x = 1; x <= star; x++) {
			for (int y = 5; y >= x; y--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 별 오른쪽에 찍기
		for (int a = 1; a <= 5; a++) {
			for (int c = 4; c >= a; c--) {
				System.out.print(" ");
			}
			for (int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 별 오른쪽에서 반대로 짝기
		for (int d = 1; d <= star; d++) {
			for (int e = 0; e <= star; e++) {
				System.out.print(" ");
			}
			for (int f = 5; f >= d; f-- ) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
