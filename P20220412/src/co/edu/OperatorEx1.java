package co.edu;

public class OperatorEx1 {
	public static void main(String[] args) {
		//증감 연산자(Increment operators)
		int num1 = 10;
		int num2 = 20;
		num1 = num1 + 4; //num1의 값을 읽고 처리된 결과값을 대입
		System.out.println(num1);
		
		num1 = num1 + 1;
		num1 += 1;
		num1++; //1을 누적연산
		System.out.println(num1);
		
		//++의 방향에 따른 연산 처리 순서
		System.out.println(++num1); //++1 연산을 처리 후 18 출력 처리
		System.out.println(num1++); //18 출력 처리 후 ++1 연산을 처리
		System.out.println(num1); //19
		
		int result = num1++ + ++num2; //19 + 21 = 40
		System.out.println(result);
		System.out.println(num1); //20
		System.out.println(num2); //21
		
		//byte 타입의 연산
		byte num3 = 10; //byte < short < int < long
		//num3 = num3 + 1; => 정수연산에서는 int 타입으로 처리하므로 byte + int일 경우 타입을 int로 변경해야함
		num3 = (byte) (num3 + 1); // byte type으로 casting
		num3 += 1; 
		num3++;
		num3 = 125;
		num3++; //126
		num3 += 3; //바이트의 범위 -128~127 => (-127)
		num3++; //-126
		System.out.println(num3);
	
	}

}
