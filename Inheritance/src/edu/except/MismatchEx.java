package edu.except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MismatchEx {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("선택 >>> ");

			int menu = 0;
			try {
				menu = scn.nextInt();

			} catch (InputMismatchException | NumberFormatException e) { // 다중 예외 처리 가능
				System.out.println("*** 숫자만 입력해주세요. ***");
				scn.nextLine();

			} catch (RuntimeException e1) {
				System.out.println("*** 알 수 없는 예외 발생***");
				scn.nextLine();
//				=> RuntimeException을 상속받으므로 상위/부모 클래스인
//				Runtime Exception을 선언해주어도 됨
//				다만 상위 클래스가 먼저 올 경우 상위 클래스 예외 처리 블록에서 다 걸러지므로
//				예외 처리 시 순서에 유의
			}

			if (menu == 1) {
				System.out.println("메뉴 1");
			} else if (menu == 2) {
				System.out.println("메뉴 2");
				break;
			}
		}

		System.out.println("end of program");

	}
}
