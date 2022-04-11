package co.edu.variable;

public class VarExample2 {
	public static void main(String[] args) {
		/* 국어점수 80점, 영어점수 70점, 수학점수 69점
		평균을 담을 수 있는 변수 선언 */
		int korScore = 80;
		int engScore = 70;
		int mathScore = 63;
		
		int avg_i = (korScore + engScore + mathScore)/3;
		double avg_f = (korScore + engScore + mathScore)/3.0;
		// 정수 타입/정수 타입할 경우 double 선언해도 값은 정수로 나오기 때문에 두 값 중 하나는 실수 타입으로 변경 필요
		
		/* 국어 85, 영어 75, 수학 60 */
		
		korScore = 85;
		engScore = 75;
		mathScore = 60;
		
		avg_i = (korScore + engScore + mathScore)/3;
		avg_f = (korScore + engScore + mathScore)/3.0;
		
		//System.out.println("80점, 70점, 63점의 평균: " + avg_i);
		//System.out.println("80점, 70점, 63점의 평균: " + avg_f);
		System.out.println("85점, 75점, 60점의 평균: " + avg_i);
		System.out.println("85점, 75점, 60점의 평균: " + avg_f);
		
	}

}
