package co.conditions;

public class IfEx3 {
	public static void main(String[] args) {
		//중첩문
		//90점 이상이면 A학점, 80점 이상이면 B학점, 70점 이상이면 C학점, 70점 미만이면 F
		//90점 이상 중에서도 95점 이상인 사람들은 A+, 80점대 중에서도 85점 이상인 경우는 B+ 
		int score = 88;
		
		if(score >= 90) {
			if(score >= 95) {
			System.out.println("A+학점");	
			} else {
			System.out.println("A학점");
			}
		} else if(score >= 80) {
			if(score >= 85) {
				System.out.println("B+학점");
			} else {
			System.out.println("B학점");
			}
		} else if(score >= 70) {
			if(score >= 75) {
				System.out.println("C+학점");
			} else {
			System.out.println("C학점");
			}
		} else {
			System.out.println("F학점");
		}
	}
}
