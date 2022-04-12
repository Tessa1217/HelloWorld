package co.loop;
import java.util.Scanner;

public class WhileEx1 {
	public static void main(String[] args) {
		
		//1~10까지의 합 (while 구문 이용)
		int sum = 0;
		int i = 1;
		while(i <= 10) {
			sum += i;
			//System.out.println(sum);
			i++;
		}
		System.out.println("1부터 10까지의 합은 " + sum);
		
		//while구문 - 종료 조건 만들기 
		Scanner scn = new Scanner(System.in);
		boolean isTrue = true;
		sum = 0;
		while(isTrue) {
			System.out.println("숫자를 입력하세요 (종료하려면 -1을 입력하세요): ");
			int temp = scn.nextInt();
			if(temp == -1) {
				isTrue = false;
				continue; //or break;
			}
			sum += temp;
		}
		System.out.println("입력값의 합은 " + sum);
		
	}
}
