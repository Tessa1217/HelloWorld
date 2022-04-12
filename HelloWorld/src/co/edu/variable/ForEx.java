package co.edu.variable;

public class ForEx {
	public static void main(String[] args) {
		int sum = 0;
		for (int i=1; i<=5; i++) {
			sum = sum + 3;
		}
		System.out.println(sum);
		
		int num = 3;
		for (int i=1; i<10; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}

}
