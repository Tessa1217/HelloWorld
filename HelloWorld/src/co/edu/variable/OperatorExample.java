package co.edu.variable;

public class OperatorExample {
	public static void main(String[] args) {
		// 나머지 연산자 %
		int a = 6;
		int b = 4;
		System.out.println(a/b);
		System.out.println(a%b);
		
		int money_origin = 116400;
		int money_left = 0;
		int bill50 = money_origin/50000;
		money_left = money_origin%50000;
		int bill10 = money_left/10000;
		money_left %= 10000;
		int bill5 = money_left/5000;
		money_left %= 5000;
		int bill1 = money_left/1000;
		money_left %= 1000;
		int coin5 = money_left/500;
		money_left %= 500;
		int coin1 = money_left/100;
		money_left %= 100;
		
		System.out.printf("금액 %d원은 5만원권 %d장, 1만원권 %d장, 5천원권 %d장, "
				+ "1천원권 %d장, 5백원 %d개, 1백원 %d개로 교환할 수 있습니다.", money_origin, 
				bill50, bill10, bill5, bill1, coin5, coin1);
		
	}
}
