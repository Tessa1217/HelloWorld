package co.edu.dimension;

import java.util.Scanner;

public class TwoArrayEx4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 변수 vs. 배열
		// 변수 활용
		int num1, num2, num3, num4;
		System.out.println("첫번째 값 입력 >> ");
		num1 = scn.nextInt();
		System.out.println("두번째 값 입력 >> ");
		num2 = scn.nextInt();
		System.out.println("세번째 값 입력 >> ");
		num3 = scn.nextInt();
		System.out.println("네번째 값 입력 >> ");
		num4 = scn.nextInt();
		
		//변수를 활용하여 오름차순 출력
		
		// 제일 작은 수 ~ 제일 큰 수 순으로 출력
		int[] intAry = { num1, num2, num3, num4 };
		for (int i = 0; i < intAry.length - 1; i++) {
			for (int j = 0; j < intAry.length - 1; j++) {
				if (intAry[j] > intAry[j + 1]) {
					int temp = intAry[j];
					intAry[j] = intAry[j + 1];
					intAry[j + 1] = temp;
				}
			}
			
		}
		System.out.println(intAry[0] + " " + intAry[1] + " " + intAry[2] + " " + intAry[3]);
		
		//제일 큰 수 ~ 제일 작은 수 순으로 출력
		for(int i = 0; i < intAry.length - 1; i++) {
			for(int j = 0; j < intAry.length - 1; j++) {
				if(intAry[j] < intAry[j+1]) {
					int temp = intAry[j];
					intAry[j] = intAry[j+1];
					intAry[j+1] = temp;
				}
			}
		}
		System.out.println(intAry[0] + " " + intAry[1] + " " + intAry[2] + " " + intAry[3]);
	}
}
