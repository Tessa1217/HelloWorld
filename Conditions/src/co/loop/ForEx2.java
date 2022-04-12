package co.loop;

public class ForEx2 {
	public static void main(String[] args) {
		
		//1부터 100까지 반복하여 31번째가 되면 종료
		int sum = 0;
		for(int i=1;i<=100;i++) {
			if (i==31) {
				System.out.println("31번째에서 종료하겠습니다.");
				break; //반복문 종료
			}
			sum += i;
		}
		System.out.println("1부터 30까지의 합은 " + sum);
		
		int sum1 = 0;
		//continue문을 사용하여 짝수일 경우에만 합하기
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				// System.out.println("현재 i의 값은 " + i + "입니다.");
				continue; //continue문 = 아래 코드 실행 없이 다음 순번
			}
			sum1 += i;
		}
		System.out.println("1부터 100까지 홀수의 합은 " + sum1);
	}
}
