package co.edu.variable;

public class VarExample3 {
	
	public static void main(String[] args) {
		{
		//변수는 선언된 블록 내에서만 유효
			int age = 20;
			System.out.println("나이는 " + age);
		}
		int age = 25;
		System.out.println("나이는 " + age);
	
		//조건문 if 
		if(age > 20) {
			System.out.println(age + "는 20보다 큽니다.");
		}
			
		//참, 거짓을 담을 수 있는 불린형 	
		boolean isTrue = true; //true or false
		isTrue = age > 20;
		if(isTrue) {
			System.out.println(age + "는 20보다 큽니다.");
		}
	}

}
