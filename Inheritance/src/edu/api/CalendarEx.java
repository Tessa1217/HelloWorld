package edu.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class CalendarEx {
	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		System.out.println(cal1);
		int year = 2022;
		int month = 5;

		cal1.set(2021, 1, 1);
		cal1.set(year, month - 1, 1);

		System.out.println("년도: " + cal1.get(Calendar.YEAR));
		System.out.println("월: " + cal1.get(Calendar.MONTH)); // 1월은 0부터 시작
		System.out.println("일: " + cal1.get(Calendar.DATE));
		System.out.println("요일: " + cal1.get(Calendar.DAY_OF_WEEK)); // 1 = 일요일
		System.out.println("달의 마지막날: " + cal1.getActualMaximum(Calendar.DATE)); // 마지막날
		System.out.println("달의 마지막날: " + cal1.getActualMaximum(Calendar.DAY_OF_MONTH));

		// 월별 마지막 날
		for (int i = 0; i < 12; i++) {
			month = i;
			cal1.set(year, month, 1);
			System.out.println(cal1.getActualMaximum(Calendar.DATE));
		}

		Date today = new Date();
		System.out.println(today);
		today = new Date("2021/05/05");
		today.setYear(2022); // 1900 + 2022 => 3992
		System.out.println(today.toString());

		// LocalDate ldate = new LocalDate(2022, 10, 10); public type X

		// 날짜
		LocalDate ldate = LocalDate.of(2022, 10, 10);
		System.out.println(ldate.toString());

		// 시간
		LocalTime ltime = LocalTime.of(10, 32);
		System.out.println(ltime.toString());

		String time = "";
		time += ldate;
		time += " " + ltime;
		System.out.println(time);

		// 날짜 + 시간
		LocalDateTime ldf = LocalDateTime.now();
		System.out.println(ldf.toString());

		// 날짜 형식 (포맷형)
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시:mm분:ss초");
		System.out.println(ldf.format(dft));

		dft = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		ldf = LocalDateTime.of(2022, 4, 21, 0, 0, 0);
		System.out.println(ldf.format(dft));
		ldf = LocalDateTime.of(2022, 10, 5, 10, 20, 30);
		System.out.println(ldf.format(dft));

	}

}
