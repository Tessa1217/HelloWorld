package co.edu.variable;

public class IfExample {
	public static void main(String[] args) {
		/* 기본 구문
		if(boolean) {
		}
		 */
		int myAge = 19;
		boolean over20;
		over20 = myAge > 20; //over20 == (myAge > 20)
		/* JAVA 변수명: 
		 * 첫 글자에 숫자 사용 X
		 * 대문자는 클래스, 변수는 첫 글자 소문자
		 * 의미있는 변수명 사용 필요
		 */
		if(over20) {
			System.out.println(myAge + " is over 20.");
		} else {
			System.out.println(myAge + " is under 20.");
		}
	}

}
