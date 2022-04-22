package edu.api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date now = new Date();
		String date = now.toString();
		System.out.println(date);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd"); // builder 매개변수 = 문자열

		LocalDateTime ldt = LocalDateTime.now();
		String date2 = ldt.toString();
		date2 = dtf.format(ldt);
		System.out.println(date2);
	}

}
