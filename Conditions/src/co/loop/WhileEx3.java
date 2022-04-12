package co.loop;
import java.util.Scanner;

public class WhileEx3 {
	public static void main(String[] args) {
		//Math.random()의 생성범위 1~10을 담은 randomVal
		//사용자의 입력값을 담은 변수 userVal
		//while구문을 사용해서 임의의 값이랑 입력값이 같으면 종료
		//사용자가 입력한 값과 비교하여 랜덤값이 크거나 작을 경우 힌트 메시지 출력
		
		Scanner scn = new Scanner(System.in);
		
		int randomVal = (int) (Math.random()*10)+1;
		
		while(true) {
			System.out.println("값을 입력하세요: ");
			int userVal = scn.nextInt();
			
			if(randomVal > userVal) {
				System.out.println("더 큰 값을 입력하세요.");
			} else if(randomVal < userVal) {
				System.out.println("더 작은 값을 입력하세요.");
			} else {
				System.out.println("정답입니다. 랜덤값은 " + randomVal + "였습니다.");
				break;
			}
		}
	}
}
