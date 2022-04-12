package co.loop;
import java.util.Scanner;

public class BankEx {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		boolean run = true;
		int balance = 0;
		int money = 0;
		
		while(run) {
			System.out.println("______________________");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("______________________");
			System.out.print("선택 >> ");
			int menu = scn.nextInt();
			
			if(menu == 1) {
				//예금 기능
				System.out.print("예금액 >> ");
				money = scn.nextInt();
				balance += money;
				System.out.println("정상적으로 처리되었습니다.");
			} else if(menu == 2) {
				//출금 기능
				System.out.print("출금액 >> ");
				money = scn.nextInt();
				if(balance < money) {
					System.out.println("잔고가 부족합니다.");
				} else {
					balance -= money;
					System.out.println("정상적으로 처리되었습니다.");
				}
			} else if(menu == 3) {
				//조회 기능
				System.out.printf("잔고 >> %d\n", balance);
			} else if(menu == 4) {
				//종료 기능
				run = false;
				continue;
			} else {
				System.out.println("잘못된 메뉴를 선택했습니다.");
			}
		} //end of program
		System.out.println("프로그램 종료");
	}
}
