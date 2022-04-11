package co.edu.variable;

public class BoxHomework {
	// 오렌지 127개, 10개씩 담을 수 있는 상자와 5개씩 담을 수 있는 상자 구하기
	public static void main(String[] args) {
		int orange = 127;
		int tenbox = orange / 10;
		int fivebox = (orange - (10*tenbox))/5;
		int remain = (orange - (10*tenbox))%5;
		if(5 > remain & remain > 0) {
			fivebox += 1;
		}
		System.out.printf("10개씩 담을 수 있는 상자: %d", tenbox);
		System.out.printf("5개씩 담을 수 있는 상자: %d", fivebox);
	}	
}
