package co.edu.variable;

public class VarExample {
	public static void main(String[] args) {
		// 변수의 선언
		int age = 20; // "="의 의미: 오른쪽의 값을 왼쪽 변수에다가 할당
		double height = 163.6;
		String myName = "권유진";
		
		age = 23;
		
		System.out.println("이름은 " + myName);
		System.out.println("나이는 " + age + "살 입니다.");
		System.out.println("키는 " + height + "cm 입니다.");
		
		//영어점수: 85; engScore 할당
		int engScore = 85;
		int mathScore = 90;
		
		int result = engScore + mathScore;
		
		// 변수 선언부는 한번만 선언. 값 재할당 시 변수이름 = 새로운 값
		engScore = 80;
		mathScore = 70;
		result = engScore + mathScore; //eng + math 재할당 후에는 result 역시 재할당 필요
		
		System.out.println("영어 점수 " + engScore + "점과 수학점수 " 
		+ mathScore + "점의 합은 " + result + "점 입니다.");
		
	}
}
