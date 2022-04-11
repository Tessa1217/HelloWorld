package co.edu.variable;

public class VarExample5 {
	public static void main(String[] args) {
		int val = 214748364; // 4 * 1byte = 4 * 8bit = 32bit => 1byte = 8 * 1 bit; 값이 on/off 
		System.out.println(Long.MAX_VALUE);
		
		long val2 = 2147483648L; //2147483648 = int, long형 선언 시에는 값 + L
		long val3 = 10; //자바에서는 왼쪽 변수 타입과 값의 타입이 일치하여야 한다. 
		//10(값이 정수 표현 범위 내의 값일 경우)=> long 변환(promotion, 자동 형변환)
		
		int val4 = (int) 2147483648L; //long => int (casting, 강제 형변환)
		/* casting(큰값 => 작은값) - 해당 타입 범위 내로 표현되는 값은 손실값이 발생하지 않지만(ex - 10L, 4bit) 
		 * 타입 범위 보다 큰 값(ex - 2147483648L)의 경우 강제 형변환 시 손실값 발생 */
		
		//casting 예시
		int result = (int) 100L/5; // 자바 내부: 보통 큰 타입으로 변환하여 연산이 됨 (L/I => L/L), 따라서 연산의 값이 long
		System.out.println(result);
		
		long val5 = 10000000000L;
		long val6 = 10L;
		result = (int) (val5 - val6); //casting
		
		long result_l = val5 - val6;
		
		System.out.println(result); //1410065398 (손실값)
		System.out.println(result_l); //9999999990
		
		char charLit = 97; //char => 0~65535까지의 정수값에 숫자에 해당되는 문자값을 매핑, 담고있는 값은 정수 타입
		System.out.println(charLit); //a = 97
		charLit = 44032;
		System.out.println(charLit); //가 = 44032
		System.out.println((int)charLit); //44032
		
		for(int i=0; i<10; i++) {
			System.out.println(charLit++);
		}
	}

}
