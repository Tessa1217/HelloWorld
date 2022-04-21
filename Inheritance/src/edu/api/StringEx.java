package edu.api;

import java.io.UnsupportedEncodingException;

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

		// String 바이트 타입 배열로 반환
		byte[] bytes = null;
		try {
			bytes = ssn.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < bytes.length; i++) {
			System.out.print(bytes[i] + " ");
		}
		System.out.println();

		// 바이트 타입에서 다시 String으로 변환
		String str = new String(bytes);
		System.out.println(str);

		// 특정 값의 시작 인덱스 얻기
		int index = ssn.indexOf("95");
		System.out.println(index);

		// 문자열 대치하기
		ssn = ssn.replace("-", "").substring(0, 7);
		System.out.println(ssn);

		// 대소문자 변환
		String case1 = "CAse";
		System.out.println(case1);
		case1 = case1.toLowerCase();
		System.out.println(case1);
		case1 = case1.toUpperCase();
		System.out.println(case1);
		case1 = "  CaSE ";
		System.out.println(case1);
		// 공백 문자 제거
		case1 = case1.trim();
		System.out.println(case1);
	}

}
