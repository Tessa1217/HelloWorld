package co.loop;

public class DiceWhileEx {
	public static void main(String[] args) {
		// 두 개의 주사위 합이 5가 아니면 계속 던지고 합이 5면 실행을 멈추는 코드
		int sum = 0;
		int cnt = 0;

		while (true) {
			int dice1 = (int) (Math.random() * 5) + 1;
			int dice2 = (int) (Math.random() * 5) + 1;
			System.out.printf("(%d, %d)\n", dice1, dice2);
			sum = dice1 + dice2;
			cnt++;
			if (sum == 5) {
				System.out.println(cnt + "번 만에 프로그램이 종료되었습니다.");
				break;
			}
		}

		// 두 개의 주사위 합이 6이 되는 케이스를 전부 출력하는 코드

		System.out.println();

		sum = 0;
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < 7; j++) {
				if (i + j == 6) {
					System.out.printf("(%d, %d)", i, j);
				}
			}
			System.out.println();
		}

	}

}
