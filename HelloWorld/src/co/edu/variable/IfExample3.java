package co.edu.variable;
import java.util.Scanner;

public class IfExample3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("첫번째 정수를 입력하세요: ");
		num1 = scn.nextInt(); //사용자 입력값을 읽고 읽어드린 값을 int형으로 반환
		System.out.println("입력값은 " + num1 + "입니다.");
		
		System.out.println("두번째 정수를 입력하세요: ");
		num2 = scn.nextInt();
		System.out.println("입력값은 " + num2 + "입니다.");
		
		// 큰 수에서 작은 수를 뺀 결과값을 result에 저장하여 출력
		int result;
		if(num1 > num2) {
			result = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + result);
		} else {
			result = num2 - num1;
			System.out.println(num2 + " - " + num1 + " = " + result);
		}
		
		System.out.printf("결과값: %d", result);
	}
}
