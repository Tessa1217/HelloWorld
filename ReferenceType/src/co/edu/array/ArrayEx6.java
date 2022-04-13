package co.edu.array;

import java.util.Scanner;

public class ArrayEx6 {
	public static void main(String[] args) {
		// 학생 이름, 점수 - 배열, 배열 => 학생, 90점
		Scanner scn = new Scanner(System.in);

		String[] names = new String[3];
		int[] scores = new int[3];

		for (int i = 0; i < names.length; i++) {
			System.out.println((i + 1) + "번째 학생의 이름을 입력하세요 >>> ");
			names[i] = scn.nextLine();
			System.out.println((i + 1) + "번째 학생의 성적을 입력하세요 >>> ");
			scores[i] = scn.nextInt(); // score + Enter
			scn.nextLine(); // 넣어주지 않을 경우 2번째 이름 + 성적이 한꺼번에 나옴

			// 이름: 홍길동, 김길동, 박길동
			// 성적: 70, 80, 55
		}

		System.out.println("조회할 학생의 이름을 입력하세요 >>> ");
		String searchName = scn.nextLine();
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(searchName)) {
				System.out.println(names[i] + " 학생의 성적은 " + scores[i] + "점 입니다.");
			}
		}

		System.out.println("end of program");
	}

}
