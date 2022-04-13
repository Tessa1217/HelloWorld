package co.edu.dimension;
import java.util.Scanner;

public class StudentEx {
	public static void main(String[] args) {
		// 학생 이름, 점수 => names, scores

		// 학생 1
		Student s1 = new Student(); // 학생 이름, 점수
		s1.studName = "홍길동";
		s1.score = 80;
		s1.age = 20;
		s1.grade = 'A';

		// 학생 2
		Student s2 = new Student();
		s2.studName = "김길동";
		s2.score = 75;
		s2.age = 25;
		s2.grade = 'B';

		// 학생 3
		Student s3 = new Student();
		s3.studName = "박길동";
		s3.score = 82;
		s3.age = 27;
		s3.grade = 'C';

		Student[] students = { s1, s2, s3 };

		Scanner scn = new Scanner(System.in);
		System.out.println("조회할 학생 이름 >>> ");
		String searchName = scn.nextLine();
		for(int i=0; i < students.length; i++) {
			if(students[i].studName.equals(searchName)) {
				System.out.println("점수: " + students[i].score + "점");
				System.out.println("나이: " + students[i].age + "살");
				System.out.println("학점: " + students[i].grade);
			}
		}
		
		System.out.println();
		
		//23살 보다 나이가 많은 사람 출력하기
		int searchAge = 10;
		System.out.printf("나이가 %d살 보다 많은 사람:\n", searchAge);
		for(int i = 0; i < students.length; i++) {
			if(students[i].age > searchAge) {
				System.out.println(students[i].studName);
			}
		}

	}
}
