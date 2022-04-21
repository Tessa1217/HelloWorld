package edu.api;

public class StringEx {
	public static void main(String[] args) {
		// 주민번호 => 생년월일-남/여
		// ssn의 형식 : 950405-1000000 => 95년생 4월 5일 남자
		// 9704051234567 => 97년 4월 5일생, 남자
		// 0505053456789 => 05년 5월 5일생, 남자

		String ssn = "950405-1000000";

		System.out.println(ssn.length());
		System.out.println(ssn.codePointAt(3));
		System.out.println("99년 10월 1일생, 남자입니다.");
		System.out.println(ssn.substring(2, 4));
		System.out.println(ssn.substring(7, 8));

		// 주민번호로 생년월일, 성별 판독 프로그램

	}

}
