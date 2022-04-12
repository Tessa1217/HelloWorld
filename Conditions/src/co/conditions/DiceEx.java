package co.conditions;
import java.util.Scanner;

public class DiceEx {
	public static void main(String[] args) {
		int dice = (int) (Math.random()*6) + 1;
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.print("주사위의 눈을 맞춰보세요 >> \n");
			int guess = scn.nextInt();
			if(dice == guess) {
				System.out.println("정답입니다. 랜덤 주사위 눈은 " + dice + "이었습니다.");
				break;
			} 
			if(dice > guess) {
				System.out.println("UP");
			} else if((guess > 6) || (guess <= 0)) {
				System.out.println("유효한 값을 입력하세요.");
			} else {
				System.out.println("DOWN");
			}
		}
	}
}
