package edu.dao;

import java.util.Scanner;

public class MainExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DAO dao = new MySqlDAO();
		dao = new OracleDAO();

		while (true) {
			System.out.println("=====================================");
			System.out.println("1.입력 | 2.수정 | 3.삭제 | 4.목록 | 5.종료");
			System.out.println("=====================================");
			System.out.println("선택 >>> ");
			int menu = scn.nextInt();

			if (menu == 1) {
				dao.insert();
			} else if (menu == 2) {
				dao.update();
			} else if (menu == 3) {
				dao.delete();
			} else if (menu == 4) {
				dao.list();
			} else if (menu == 5) {
				System.out.println("End of program");
				break;
			} else {
				System.out.println("유효한 값을 입력해주세요.");
			}
		}
	}
}
