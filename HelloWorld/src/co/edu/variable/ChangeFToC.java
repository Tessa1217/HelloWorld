package co.edu.variable;
import java.util.Scanner;

public class ChangeFToC {
	public static void main(String[] args) {
		// 섭씨온도 <-> 화씨온도
		// 공식: c = 5/9*(f - 32)
		int far;
		Scanner scn = new Scanner(System.in);
		System.out.println("화씨 온도를 입력하세요: ");
		far = scn.nextInt();
		double cel = 5.0/9*(far - 32);
		System.out.printf("화씨 온도: %3d\n섭씨 온도: %.1f", far, cel);
	}
}
