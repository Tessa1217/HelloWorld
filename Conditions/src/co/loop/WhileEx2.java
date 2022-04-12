package co.loop;
import java.util.Scanner;

public class WhileEx2 {
	public static void main(String[] args) {
		//200이 넘게되면 반복문을 빠져나오도록 하는 구문
		Scanner scn = new Scanner(System.in);
		boolean isTrue = true;
		int sum = 0;
		while(isTrue) {
			System.out.println("숫자를 입력하세요: ");
			int temp = scn.nextInt();
			sum += temp;
			if(sum > 200) {
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.\n결과: " + sum + "입니다.");
	}
}
