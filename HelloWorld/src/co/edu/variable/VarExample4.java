package co.edu.variable;

public class VarExample4 {
	public static void main(String[] args) {
		// 영어 80, 수학 70, 불린형 변수 (영어 > 수학)
		int engScore = 80;
		int mathScore = 70;
		
		boolean isEngBig = engScore > mathScore;
		if(isEngBig) {
			System.out.println("영어점수가 수학점수보다 큽니다.");
		}
		
		if(engScore > mathScore) {
			System.out.println("영어점수가 수학점수보다 큽니다.");
		}
		
	}

}
