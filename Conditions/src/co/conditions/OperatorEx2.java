package co.conditions;

public class OperatorEx2 {
	public static void main(String[] args) {
		//비트 연산자 ~, 십진수 10을 이용하여 비트 연산자 계산 + 2진수
		int num10 = 10;
		System.out.println(num10); //10
		System.out.println(~num10); //-11
		
		//논리 부정 연산자
		boolean isTrue = false;
		System.out.println(isTrue);
		System.out.println(!isTrue);
		
		if(!(num10 > 5)) {
			System.out.println("참입니다.");
		} else {
			System.out.println("거짓입니다.");
		}	
	}
}
