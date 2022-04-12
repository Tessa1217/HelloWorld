package co.conditions;
import java.util.Scanner;

public class RockScissorPaperEx {
	public static void main(String[] args) {
		int computer = (int) (Math.random()*3) + 1;
		Scanner scn = new Scanner(System.in);
		int user = scn.nextInt();
		//가위 1, 바위 2, 보 3
		
		if(computer == user) {
			System.out.println("비겼습니다.");
		} else if(computer==1) {
			
		} else if(computer==2) {
		
		} else if(computer==3) {
			
		}
	}
}
