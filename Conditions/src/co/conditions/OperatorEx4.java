package co.conditions;

public class OperatorEx4 {
	public static void main(String[] args) {
		//삼항 연산자
		int num = 10;
		String msg = "";
		
		//if문을 사용할 경우
		if (num%2 == 0) {
			msg = "짝수입니다.";
		} else {
			msg = "홀수입니다.";
		}
		System.out.println(num + "은 " + msg);
		
		//삼항 연산자를 사용할 경우
		msg = (num%2==0) ? "짝수입니다." : "홀수입니다."; //조건 ? 참일 때 : 거짓일 때
		System.out.println(num + "은 " + msg);
	}
}
