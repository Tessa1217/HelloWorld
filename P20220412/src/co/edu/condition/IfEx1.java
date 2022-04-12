package co.edu.condition;

public class IfEx1 {
	public static void main(String[] args) {
		//IF문
		int score = 80;
		
		//90점보다 크면 A, 80점보다 크면 B, 70점보다 크면 C, 나머지는 F 
		
		//중첩 if문 사용
		if (score >= 90) {
			System.out.println("A학점입니다.");
		} else {
			if(score >= 80) {
				System.out.println("B학점입니다.");
			} else {
				if(score >= 70) {
					System.out.println("C학점입니다.");
				} else {
				System.out.println("F학점입니다.");
				}
			}
		}
		
		//else if문 사용
		if(score >= 90) {
			System.out.println("A학점입니다.");
		}else if(90 > score & score >= 80) {
			System.out.println("B학점입니다."); 
		}else if(80 > score & score >= 70) {
			System.out.println("C학점입니다.");
		}else {
			System.out.println("F학점입니다.");
		}
		
		if(score >= 90) {
			System.out.println("A학점입니다.");
		}else if(score >= 80) {
			System.out.println("B학점입니다."); 
		}else if(score >= 70) {
			System.out.println("C학점입니다.");
		}else {
			System.out.println("F학점입니다.");
		}
		
		//if 구분
		if(score >= 90) {
			System.out.println("A학점입니다.");
		}
		if(score >= 80) {
			System.out.println("B학점입니다."); //score = 85, 출력
		}
		if(score >= 70) {
			System.out.println("C학점입니다."); //score = 85, 출력
		}
		if(score < 70) {
			System.out.println("F학점입니다.");
		}
	}

}
