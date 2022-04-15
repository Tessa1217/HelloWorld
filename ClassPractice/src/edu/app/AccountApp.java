package edu.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountApp {
	Account[] accounts = new Account[100]; // 계좌 정보 저장하기 위한 배열 선언
	Scanner scn = new Scanner(System.in);

	// 기능 1. 인스턴스 호출하는 execute() 기능
	public void execute() {
		while (true) {
			System.out.println("=============================");
			System.out.println("0. 계좌정보 1.계좌생성 2.입금 3.출금 4.목록조회 5.종료");
			System.out.println("=============================");
			System.out.println("선택 >>> ");

			int choice = -1;
			try {
				choice = scn.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못된 처리를 시도하셨습니다.");
				scn.nextLine();
			}
			if (choice == 0) {
				myAccount();
			} else if (choice == 1) {
				createAccount();
			} else if (choice == 2) {
				deposit();
			} else if (choice == 3) {
				withdraw();
			} else if (choice == 4) {
				accountList();
			} else if (choice == 5) {
				System.out.println("은행 앱을 종료합니다.");
				break;
			} else {
				System.out.println("다시 시도해주세요.");
			}
		}
	}

	// 기능 2. 계좌 생성
	public void createAccount() {
		System.out.println("________________");
		System.out.println("    계좌 생성    ");
		System.out.println("________________");

		System.out.println("예금주 명 설정 >>> ");
		String accName = scn.next();
//		scn.nextLine();
		System.out.println("초기 입금액 >>> ");
		int initBalance = scn.nextInt();
		int randomAcc = (int) (Math.random() * 899) + 100;
		int randomAcc2 = (int) (Math.random() * 899) + 100;
		String accNum = String.valueOf(randomAcc) + "-" + String.valueOf(randomAcc2);

		Account account = new Account(accNum, accName, initBalance);

		// 다 차면 예외처리 하기
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				System.out.println("* 계좌 생성이 완료되었습니다. *");
				account.accInfo();
				accounts[i] = account;
				break;
			}

		}

	}

	// 기능 3. 입금
	public void deposit() {
		System.out.println("_________________");
		System.out.println("       입금       ");
		System.out.println("_________________");

		System.out.println("예금주 명을 입력해주세요 >>> ");
		String accName = scn.next();
//		scn.nextLine();
		for (Account account : accounts) {
			if (account != null) {
				if (account.getAccName().equals(accName)) {
					System.out.println("안녕하세요 " + accName + " 님.");
					System.out.println("얼마를 입금하시겠습니까? >>> ");
					int addBalance = 0;
					try {
						addBalance = scn.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("숫자를 입력해주세요.");
					}
					account.setBalance(account.getBalance() + addBalance);

					System.out.println("* 입금이 정상적으로 완료되었습니다. *");
					account.accInfo();
				}
			}
		}

	}

	// 기능 4. 출금
	public void withdraw() {
		System.out.println("_________________");
		System.out.println("       출금       ");
		System.out.println("_________________");
		System.out.println("예금주 명을 입력해주세요 >>> ");
		String accName = scn.next();
//		scn.nextLine();
		for (Account account : accounts) {
			if (account != null) {
				if (account.getAccName().equals(accName)) {
					System.out.println("안녕하세요. " + accName + " 님");
					System.out.println("얼마를 출금하시겠습니까? >>> ");
					int drawBalance = 0;
					try {
						drawBalance = scn.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("숫자를 입력해주세요.");
					}
					if ((account.getBalance() == 0) || (account.getBalance() < drawBalance)) {
						System.out.println("잔고가 부족합니다.");
						continue;
					} else {
						account.setBalance(account.getBalance() - drawBalance);
						System.out.println("* 출금이 정상적으로 완료되었습니다. *");
						account.accInfo();
					}
				}
			}
		}

	}

	// 기능 5. 목록조회
	// 특정 사용자만 가능하도록 만들어보기
	public void accountList() {
		System.out.println("관리자 아이디를 입력하세요 >>> ");
		String id = scn.next();
		if (Account.getManageID().equals(id)) {
			System.out.println("관리자 패스워드를 입력하세요 >>> ");
			String password = scn.next();
			if (Account.getManagePW().equals(password)) {
				System.out.println("관리자 로그인에 성공하셨습니다.");
				System.out.println("_________________");
				System.out.println("      목록조회     ");
				System.out.println("_________________");
				for (Account account : accounts) {
					if (account != null) {
						account.accInfo();
					}
				}
			} else {
				System.out.printf("잘못된 비밀번호 입니다./n다시 로그인 해주세요./n");
			}
		} else {
			System.out.printf("잘못된 아이디 입니다./n다시 로그인 해주세요./n");
		}
	}

	// 기능 6. 예금주 계좌 조회
	public void myAccount() {
		System.out.println("_________________");
		System.out.println("       출금       ");
		System.out.println("_________________");
		System.out.println("예금주 명을 입력해주세요 >>> ");
		String accName = scn.next();
		for (Account account : accounts) {
			if (account != null) {
				if (account.getAccName().equals(accName)) {
					System.out.println("안녕하세요 " + accName + " 님. 고객님의 계좌 정보입니다.");
					account.accInfo();
				}
			}
		}
	}
}
