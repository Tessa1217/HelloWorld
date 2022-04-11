package co.edu.variable;

public class VarExample6 {
	public static void main(String[] args) {
		String myName = "권유진"; //char = 문자, String =문자열 (클래스) - 참조 데이터 타입(reference type)
		
		char firstChar = myName.charAt(0);
		System.out.println(firstChar); //권
		System.out.println((int)firstChar); //44428
		
		for(int i=0;i<3;i++) {
			System.out.println(myName.charAt(i));
		}
			
		int age = 25; //기본 데이터 타입(primitive type)
		double height = 167.4;
		int mathScore, engScore; 
		mathScore = 80;
		engScore = 90;
		
		/* System.out.println(myName + "의 나이는 " + age 
				+ "이고 키는 " + height + "이고 영어와 수학 점수의 합은 " 
				+ mathScore + engScore + "입니다."); => mathScore + engScore = 8090 
		처음 나오는 값이 문자열일 경우 뒤에 나오는 값도 모두 문자열 처리 (자바는 항상 자료형이 동일하여야 합니다.)		
				*/
		System.out.println(myName + "의 나이는 " + age 
				+ "이고 키는 " + height + "이고 영어와 수학 점수의 합은 " 
				+ (mathScore + engScore) + "입니다."); //먼저 연산 처리 필요한 부분은 괄호로 처리
	}

}
