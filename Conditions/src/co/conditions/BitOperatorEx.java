package co.conditions;

public class BitOperatorEx {
	public static void main(String[] args) {
		//비트 연산
		int num1 = 8;
		int result1 = num1 << 2;
		System.out.println(result1); // 십진수 8은 이진수 1000 => 비트 연산자 << 실행 후 이진수 100000, 십진수로 32
		
		int num2 = 10;
		int result2 = num2 << 2;
		System.out.println(result2); // 1010 => 101000, 십진수로 40
		
		result1 = num1 >> 2;
		System.out.println(result1); //1000 => 10, 십진수로 2
		
		result2 = num2 >> 2;
		System.out.println(result2); // 2
	}
}
