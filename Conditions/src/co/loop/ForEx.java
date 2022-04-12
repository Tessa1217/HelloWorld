package co.loop;

public class ForEx {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=9;i++) {
			
		}
		int sum1 = 0;
		for(int i=1;i<=10;i+=2) {
			sum1 = sum1 + i;
		}
		System.out.println(sum1);
		int sum2 = 0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				sum2 += i;
			}
		}
		System.out.println(sum2);
	}

}
