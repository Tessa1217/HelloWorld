package co.loop;
import java.util.Scanner;

public class WhileEx4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int cnt = 0;
		int temp = num;
		while(true) {
			num = (10*(num%10)) + (num%10 + num/10)%10;
			System.out.println(num);
			cnt++;
			if(temp == num) {
				break;
			}
		}
		System.out.println("총 카운트 횟수: " + cnt);
	}
}
