package co.edu.array;
import java.util.Scanner;

public class ArrayEx5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		//학생 5명의 수학 점수를 담을 수 있도록 정수 배열 선언
		int[] scores = new int[5];
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println("학생 점수 입력>>>");
			scores[i] = scn.nextInt();
		}
		
		//학생 중에서 최고점, 
		int maxVal = 0;
		int minVal = scores[0];
		
		for(int i = 0; i < scores.length; i++) {
			if(maxVal < scores[i]) {
				maxVal = scores[i];
			}
			if(minVal > scores[i]) {
				minVal = scores[i];
			}
		}
		System.out.printf("최고점은 %d점이고 최저점은 %d입니다.\n", maxVal, minVal);
	}
}
