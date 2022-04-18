package baekjoon.loop;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		// 단이 주어지면 해당 단 출력하기
		Scanner scn = new Scanner(System.in);
		int dan = scn.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}

}
