package co.edu.condition;

public class CondEx {
	public static void main(String[] args) {
		//임의의 값을 생성해주는 Math.random()을 사용하여 51~100까지의 임의의 값을 생성
		int randomVal = (int)(Math.random() * 50) + 51;
		System.out.println(randomVal);
		String grade = "";
		
		if(randomVal >= 90) {
			grade = "A";
		} else if(randomVal >= 80) {
			grade = "B";
		} else if(randomVal >= 70) {
			grade = "C";
		} else if(randomVal >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		//100~90점까지는 A학점, ~80점까지는 B학점, ~70점까지는 C학점, ~60점까지는 D학점, 그외에는 F학점
		switch(grade) {
		case ("A"):
			System.out.println("A"); break;
		case ("B"):
			System.out.println("B"); break;
		case ("C"):
			System.out.println("C"); break;
		case ("D"):
			System.out.println("D"); break;
		default: 
			System.out.println("F");
		}
		
		randomVal /= 10;
		switch(randomVal) {
		case (10):
		case (9):
			System.out.println("A"); break;
		case (8):
			System.out.println("B"); break;
		case (7):
			System.out.println("C"); break;
		case (6):
			System.out.println("D"); break;
		default: 
			System.out.println("F");
		}
	}
}
