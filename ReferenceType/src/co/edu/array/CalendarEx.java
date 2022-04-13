package co.edu.array;

public class CalendarEx {
	public static void main(String[] args) {

		// 변수를 이용한 배열의 크기 선언
		int month = 10;
		int lnth = getLastDayInfo(month);
		int[] intAry = new int[lnth];

		// 요일 출력을 위한 문자열 배열 선언
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };

		// intAry 배열에 1~31일까지 일수 지정
		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = i + 1;
		}

		System.out.printf("%13s%s월", " ", month);
		System.out.println();

		// 요일을 첫 줄에 출력
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println(); // 요일 배열 출력 후 줄바꿈

		// 매월 1일이 해당하는 요일에 맞는 공간으로 이동하게 스페이스 출력
		int spaces = getDayInfo(month);
		for (int i = 0; i < spaces; i++) {
			System.out.printf("%4s", " ");
			// System.out.printf("%4s", "*");
		}

		// 실제 날짜 출력
		for (int i = 0; i < intAry.length; i++) {
			// 스페이스 출력을 printf로 해주었으므로 스페이스 + 숫자 출력
			System.out.printf("%4d", intAry[i]);
			if ((i + spaces) % 7 == 6) { // 일주일씩 끊어서 출력
				System.out.println();
			}
		}
	} // end of main();

	public static int getDayInfo(int month) {
		switch (month) {
		case 1:
			return 6;
		case 2:
			return 2;
		case 3:
			return 2;
		case 4:
			return 5; // break; return 구문은 메소드의 끝을 의미하므로 break 생략
		case 5:
			return 0;
		case 6:
			return 3;
		case 7:
			return 5;
		case 8:
			return 1;
		case 9:
			return 4;
		case 10:
			return 6;
		case 11:
			return 2;
		case 12:
			return 4;
		default:
			return 0;
		}
	}

	public static int getLastDayInfo(int month) {
		switch (month) {
		case 1:
			return 31;
		case 2:
			return 28;
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;
		default:
			return 31;
		}
	}
}
