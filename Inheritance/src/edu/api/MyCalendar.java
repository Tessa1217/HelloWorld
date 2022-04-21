package edu.api;

import java.util.Calendar;

public class MyCalendar {
	public static void main(String[] args) {
		String y = "2022";
		String m = "07";

		showCal(y, m);
	}

	public static void showCal(String year, String month) {

		Calendar cal1 = Calendar.getInstance();
		int srchYear = Integer.parseInt(year);
		int srchMonth = Integer.parseInt(month);
		cal1.set(srchYear, srchMonth - 1, 1);
		int lastDay = cal1.getActualMaximum(Calendar.DAY_OF_MONTH);
		int firstDay = cal1.get(Calendar.DAY_OF_WEEK);
		// System.out.println(firstDay);
		System.out.printf("%12s년 %4s월", year, month);
		System.out.println();
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		for (String day : days) {
			System.out.printf("%4s", day);
		}
		System.out.println();
		System.out.print("============================");
		System.out.println();
		for (int i = 0; i < firstDay - 1; i++) {
			System.out.printf("%4s", " ");
		}
		for (int i = 0; i < lastDay; i++) {
			System.out.printf("%4d", (i + 1));
			if ((i + firstDay) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("============================");

	}

}
