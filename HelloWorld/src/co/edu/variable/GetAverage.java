package co.edu.variable;
import java.util.Scanner;

public class GetAverage {
	public static void main(String[] args) {
		//입력값을 num1, num2, num3, 총 3개 받는다.
		Scanner scn = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("첫번째 정수를 입력하세요: ");
		num1 = scn.nextInt();
		System.out.println("두번째 정수를 입력하세요: ");
		num2 = scn.nextInt();
		System.out.println("세번째 정수를 입력하세요: ");
		num3 = scn.nextInt();
		
		//double 타입으로 
		//정수 연산 => (결과값) 정수, 따라서 double 타입 결과값을 위해 두 값 중 하나를 double로 사용
		double avg;
		avg = (num1 + num2 + num3)/3.0;
		
		//결과값: 입력한 세 정수는 10, 15, 15이고, 평균은 13.3333 입니다.
		System.out.println("입력한 세 정수는 " + num1 + " ," + num2 + " ,"
				+ num3 + "이고 평균은 " + avg + "입니다.");
		// 평균에 대한 결과값을 소숫점 2자리까지만 출력할 경우 (형식 문자열)
		System.out.printf("입력한 세 정수는 %d, %d, %d이고 평균은 %.2f입니다.\n", num1, num2, num3, avg);
		
		
		/* 형식 문자열 
		 * %d = 정수
		 * %s = 문자열
		 * %f = 실수 
		 * %n = 줄바꿈 */
		String myName = "홍길동";
		int age = 10;
		System.out.printf("이름은 %3s이고 평균은 %.2f이고 나이는 %d입니다.\n", myName, avg, age);
		
		int hourWage = 8000;
		int monthWage = 30 * hourWage;
		System.out.printf("시급은 %06d원이고 월급은 %06d원 입니다.\n", hourWage, monthWage);
		
		int radius = 8;
		double area = 3.14159 * radius * radius;
		System.out.printf("원의 반지름은 %d미터이고 원의 넓이는 %.2f 제곱미터입니다.\n", radius, area);
		
		int price = 1500;
		System.out.printf("%d원\n", price);
		System.out.printf("%08d원\n", price);
		System.out.printf("%8d원\n", price);
		System.out.printf("%-8d원\n", price);
	}

}
