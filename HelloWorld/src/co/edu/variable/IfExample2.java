package co.edu.variable;

public class IfExample2 {
	public static void main(String[] args) {
		int num1, num2;
		num1 = 150;
		num2 = 248;
		
		num1 = 350;
		num2 = 127;
		
		if(num1 > num2) {
			System.out.println("큰 수는 " + num1);
		} else {
			System.out.println("큰 수는 " + num2);
		}
	}
}
