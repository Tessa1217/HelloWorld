package co.edu.condition;
import java.util.Scanner;

public class SwitchEx1 {
	public static void main(String[] args) {
		//Switch문
		Scanner scn = new Scanner(System.in);
		System.out.println("피자의 종류를 선택해주세요: ");
	
		String pizza = scn.nextLine(); //사용자의 입력값을 스트링 타입으로 반환
		int price;
		
		switch(pizza) {
		case "콤비네이션":
			//price = 20000; break; 
			//case 아래부터 순차적으로 실행하므로 해당 case에서 멈추고 싶을 경우 break 작성
		case "슈퍼슈프림":
			price = 20000; break; //동일하게 실행하고 싶은 경우 (price가 둘 다 20000원)
		case "포테이토":
			price = 15000; break;
		case "쉬림프":
			price = 25000; break;
		default: 
			price = 0; break;
		}
		System.out.printf("%s 피자의 값은 %d원입니다.", pizza, price);
	}
}
