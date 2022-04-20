package edu.collection;

import java.util.Scanner;

class Member {
	private String name;
	private int age;

	Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		Member member = (Member) obj;
		// return this.name.equals(member.name));
		boolean b1 = this.age == member.age ? true : false;
		boolean b2 = this.name == member.name ? true : false;
		return b1 && b2;
	}

}

public class MultiLineExam {
	public static void main(String[] args) {

		Member m1 = new Member("홍길동", 10);
		Member m2 = new Member("홍길동", 10);

		if (m1.equals(m2)) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}

		String str = "오늘은 \n 날씨가 \n 좋군요\n";
		str = "";
		str += "오늘은 \n";
		str += "날씨가\n";
		str += "좋구나!!!\n";
		System.out.println(str.toString());

		str = "";

		Scanner scn = new Scanner(System.in);
		System.out.println("내용: ");
		str = "";

		while (true) {
			String temp = scn.nextLine();
			if (temp.trim().equals("")) {
				break;
			}
			str += temp + "\n";
		}

		System.out.println(str);

	}

}
