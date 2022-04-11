package co.edu.variable;
import java.util.Scanner;

public class BoxHomework {
	// 오렌지 127개, 10개씩 담을 수 있는 상자와 5개씩 담을 수 있는 상자 구하기
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("박스에 담을 오렌지의 개수를 입력하세요: ");
		int orange;
		orange = scn.nextInt();
		
		int tenbox = orange/10;
		int fivebox;
		if((orange%10)%5==0) {
			fivebox = (orange%10)/5;
		} else {
			fivebox = (orange%10)/5 + 1;
		}
		System.out.printf("오렌지의 개수: %d\n", orange);
		System.out.printf("10개씩 들어가는 박스: %d\n", tenbox);
		System.out.printf("5개씩 들어가는 박스: %d\n", fivebox);
		
		System.out.println();
		int orange2 = 127;
		int tenbox2 = orange2/10;
		int orangeRemain = orange%10;
		int fivebox2 = orangeRemain/5;
		if(orangeRemain%5 > 0) {
			fivebox2 += 1;
		}
		System.out.printf("오렌지의 개수: %d\n", orange2);
		System.out.printf("10개씩 들어가는 박스: %d\n", tenbox2);
		System.out.printf("5개씩 들어가는 박스: %d\n", fivebox2);
	}	
}
