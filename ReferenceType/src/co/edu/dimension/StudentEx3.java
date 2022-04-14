package co.edu.dimension;
import java.util.Scanner;

public class StudentEx3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Student[] students = {new Student(), new Student(), new Student()};
		for(int i = 0; i < students.length; i++) {
			System.out.println("학생 이름 점수 나이 순으로 입력하세요.");
			students[i].studName = scn.next();
			students[i].score = Integer.parseInt(scn.next());
			students[i].age = Integer.parseInt(scn.next());
		}
		
		//조회하고 싶은 이름 입력
		//출력 형식: 해당 이름 홍길동은 20살이고 80점입니다.
		System.out.println("조회할 이름 >> ");
		String searchName = scn.next();
		for(int i=0; i < students.length; i++) {
			if(students[i].studName.equals(searchName)) {
				System.out.printf("%s은 %d살이고 %d점입니다.\n", students[i].studName, students[i].age, students[i].score);
			}
		}
	}
}
