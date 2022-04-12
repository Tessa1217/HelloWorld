package co.conditions;

public class OperatorEx3 {
	public static void main(String[] args) {
		//비교연산자, 논리연산자
		int num1 = 10;
		int num2 = 20;
		
		if(num1 == num2) {
			System.out.println("두 수는 같은 값입니다.");
		} else {
			System.out.println("두 수는 다른 값입니다.");
		}
		
		if(num1 != num2) {
			System.out.println("두 수는 같지 않습니다.");
		} else {
			System.out.println("두 수는 같습니다.");
		}
		
		if(num1 >= num2) {
			System.out.printf("%d은 %d보다 크거나 같습니다.\n", num1, num2);
		} else {
			System.out.printf("%d은 %d보다 큽니다.\n", num2, num1);
		}
		
		/* &&/||일 경우에는 앞쪽 조건이 F/T일 경우 뒤의 조건은 실행하지 않고 바로 결과를 리턴.
		 &/|의 경우 앞쪽 조건이 T이든 F이든 상관없이 뒤쪽 조건까지 실행하고 결과를 리턴 */
		
		if((++num1%2==0) && (num2++%2==0)) {
			System.out.println("두 수는 모두 짝수입니다."); //TT
		} else {
			System.out.println("두 수 모두 짝수는 아닙니다."); //TF, FT, FF
		}
		System.out.println(num1 + ", " + num2); //11, 20
		
		if((++num1%2==0) & (num2++%2==0)) {
			System.out.println("두 수는 모두 짝수입니다."); //TT
		} else {
			System.out.println("두 수 모두 짝수는 아닙니다."); //TF, FT, FF
		}
		System.out.println(num1 + ", " + num2); //12, 21
			
		if((num1%2==0) || (num2%2==0)) {
			System.out.println("두 수 중 한 수 이상이 짝수입니다."); //TT, TF, FT 
		} else {
			System.out.println("두 수 모두 짝수가 아닙니다."); //FF
		}
		
		if((num1%2==0) | (num2%2==0)) {
			System.out.println("두 수 중 한 수 이상이 짝수입니다."); //TT, TF, FT
		} else {
			System.out.println("두 수 모두 짝수가 아닙니다."); //FF
		}
	}
}
