package co.conditions;
import java.util.Scanner;

public class CalTimeEx {
	public static void main(String[] args) {
		// 나누기, 나머지 연산자
		Scanner scn = new Scanner(System.in);
		System.out.println("초(second)를 입력해주세요: ");
		int time = scn.nextInt();
		
		//시, 분, 초 나타내기 => 5,000초
		// 시 계산 (5,000/3600) -> 나머지 계산 (5,000%(3600)) -> 분 계산 (1,400/600) ... 
		int hours, minutes, seconds;
		
		//시 계산
		hours = time/(60*60);
		time %= (60*60);
		
		//분 계산
		minutes = time/60;
		time %= 60;
		
		// 분 계산 후 나머지 = 초 
		seconds = time;
		
		System.out.printf("%02d시간 %02d분 %02d초 입니다.\n", hours, minutes, seconds);
		
		//검산 해보기
		int backToSeconds = seconds + minutes*60 + hours*3600;
		System.out.printf("%d초\n", backToSeconds);	
		
	}
}
