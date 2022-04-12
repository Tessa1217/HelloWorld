package co.conditions;
import java.util.Scanner;

public class IfEx2 {
	public static void main(String[] args) {
		
		int num;
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자를 넣어주세요: ");
		num = scn.nextInt();
		
		//2의 배수인지, 3의 배수인지, 아니면 2와 3의 공배수인지 체크
		if(num > 0) {
			if((num%2==0) & (num%3==0)) {
				System.out.println(num + "은/는 2와 3의 공배수입니다.");
			} else if(num%2==0) {
				System.out.println(num + "은/는 2의 배수입니다.");
			} else if(num%3==0) {
				System.out.println(num + "은/는 3의 배수입니다.");
			} else {
				System.out.println(num + "은/는 2의 배수도 3의 배수도 아닙니다.");
			}
		} else {
			System.out.println("유효한 값을 넣어주세요.");
		}
	}

}
