package co.loop;

public class ForEx {
	public static void main(String[] args) {
		
		//for문
		
		//구구단 3단 출력해보기
		int num = 3;
		for(int i=1;i<=9;i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
		
		//10이하 짝수만 더하기 1
		int sum1 = 0;
		for(int i=0;i<=10;i+=2) {
			sum1 = sum1 + i;
		}
		System.out.println(sum1);
		
		//10이하 짝수만 더하기 2
		int sum2 = 0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				sum2 += i;
			}
		}
		System.out.println(sum2);
	}
}
