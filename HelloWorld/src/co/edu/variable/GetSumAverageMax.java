package co.edu.variable;
import java.util.Scanner;

public class GetSumAverageMax {
	public static void main(String[] args) {
		// 점수 세 개를 입력 받아 합, 평균, 고득점 구하기
		Scanner scn = new Scanner(System.in);
		int grade1, grade2, grade3;
		System.out.println("첫 번째 점수를 입력하세요: ");
		grade1 = scn.nextInt();
		System.out.println("두 번째 점수를 입력하세요: ");
		grade2 = scn.nextInt();
		System.out.println("세 번째 점수를 입력하세요: ");
		grade3 = scn.nextInt();
		
		//합
		int sum = grade1 + grade2 + grade3;
		
		//평균
		double avg = sum/3.0;
		
		//최고점 1
		int max_grade;
		if(grade1 > grade2 & grade1 > grade3) {
			max_grade = grade1;
		} else if (grade2 > grade1 & grade2 > grade3) {
			max_grade = grade2;
		} else {
			max_grade = grade3;
		}
		
		/* 최고점 2
		max_grade = 0;
		if (grade1 > grade2) {
			max_grade = grade1;
		} else {
			max_grade = grade2;
		}
		if (max_grade < grade3) {
			max_grade = grade3;
		} */
		
		/* 최고점 3
		max_grade = grade1;
		if (max_grade < grade2) {
			max_grade = grade2;
		}
		if (max_grade < grade3) {
			max_grade = grade3;
		} */
		
		// 합, 평균(소숫점 2자리까지), 최고점 출력하기
		System.out.printf("합은 %3d점이고, 평균은 %.2f점이고 최고점은 %3d점입니다.", sum, avg, max_grade);
	}
}
