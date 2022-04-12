package co.loop;

public class MultiplicationEx {
	public static void main(String[] args) {
		
		//구구단 만들기
		
		System.out.println("==========");
		for(int mul=1;mul<=9;mul++) {
			System.out.println(mul + "단");
			for(int i=1;i<=10;i++) {
				if(i==10) {
					System.out.println("==========");
					continue;
				}
				System.out.printf("%d * %d = %d\n", mul, i, (mul*i));
			}
		}
	}
}
