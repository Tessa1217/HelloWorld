package co.loop;

public class ForEx3 {
	public static void main(String[] args) {
		
		//1~100까지 반복, sum이 1,000보다 큰 값 중 최솟값 구하기 
		int sum = 0;
		for(int i=1;i<=100;i++) {
			sum += i;
			if(sum > 1000) {
				System.out.println("1,000보다 큰 최소 sum의 값은 " + sum + "이고 " + i + "번째 입니다.");
				break;
			}
		}
		
		//1~10번을 반복, sum = sum * 1
		int sumMul = 1;
		for(int i=1;i<=10;i++) {
			sumMul *= i;
		}
		System.out.println("10! = " + sumMul);	
		
		//숫자 100의 약수를 구하는 프로그램을 작성하세요
		int num1 = 100;
		for(int i=1;i<=num1;i++) {
			if(num1%i==0) {
				System.out.println(i + "은/는 100의 약수입니다.");
			}
		}
	}
}
