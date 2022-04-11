package co.edu.variable;

public class BoxHomework {
	// 오렌지 127개, 10개씩 담을 수 있는 상자와 5개씩 담을 수 있는 상자 구하기
	public static void main(String[] args) {
		int orange = 127;
		int tenbox = orange/10;
		int fivebox = orange/5;
		System.out.printf("10개씩 담을 수 있는 박스: %d박스\n", tenbox);
		System.out.printf("5개씩 담을 수 있는 박스: %d박스\n", fivebox);
	}	
}
