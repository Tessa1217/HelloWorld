package co.edu.variable;
import java.util.Scanner;

public class ReceiptHomework {
	public static void main(String[] args) {
		/*
		 영수증: 물건의 가격과 현금을 입력값으로 받습니다. 
		 물건 가격은 부가세 포함가, 부가세 계산식 = 물건 가격 * (10/110)
		 잔돈 = 현금 - 물건 가격
		 */
		Scanner scn = new Scanner(System.in);
		
		System.out.println("가지고 있는 현금은 얼마입니까?");
		int money = scn.nextInt();
		System.out.printf("현금: %d\n", money);
		
		System.out.println("물건의 가격은 얼마입니까?");
		int price = scn.nextInt();
		System.out.printf("물건 가격: %d원\n", price);
		
		//부가세 (정수로 정확하게 나누어떨어지지 않아 반올림)
		double tax = price * (10.0/110);
		System.out.printf("부가세: %d원\n", Math.round(tax));
		
		//잔돈
		int remain = money - price;
		
		if(remain > 0) {
			System.out.printf("잔돈이 %d원 남았습니다.", remain);
		} else {
			System.out.println("가지고 있는 현금이 적어 물건을 살 수 없습니다.");
		}
		
	}

}
