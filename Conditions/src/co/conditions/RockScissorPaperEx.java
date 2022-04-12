package co.conditions;
import java.util.Scanner;

public class RockScissorPaperEx {
	public static void main(String[] args) {
		int computer = (int) (Math.random()*3) + 1;
		Scanner scn = new Scanner(System.in);
		System.out.println("Rock, Scissor, Paper!");
		int user = scn.nextInt();
		//가위 1, 바위 2, 보 3
		// You win, You lose (비기는 건 없음)
		
		if(computer==1) {
			if(user == 2) {
				System.out.println("You Win!");
			} else {
				System.out.println("You Lose!");
			}
		} else if(computer==2) {
			if(user == 3) {
				System.out.println("You Win!");
			} else {
				System.out.println("You Lose!");
			}
		} else if(computer==3) {
			if(user == 1) {
				System.out.println("You Win!");
			} else {
				System.out.println("You Lose!");
			}
		} 
		System.out.printf("User: %d, Computer: %d", user, computer);
	}
}
