package co.edu.dimension;
import java.util.Scanner;

public class StudentEx2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Student s1 = new Student();
		System.out.println("학생 이름 점수 나이 순으로 입력하세요."); //홍길동 80 20
		// scn.next(): 스페이스를 기준으로 하나씩 들고온다 (읽어오는 값 = String)
		s1.studName = scn.next();
		s1.score = Integer.parseInt(scn.next()); //읽어온 숫자형 문자열 값을 정수로 가져옴 
		s1.age = Integer.parseInt(scn.next());
		
		// Student[] students = new Student[3];
		// System.out.println(students[0]); 참조 타입 = 초기값 null
		
		Student[] students = {new Student(), new Student(), new Student()};
		// System.out.println(students[0]); 39fb3ab6, 배열 변수의 참조값 리턴
		students[0].studName = scn.next(); 
		students[0].score = Integer.parseInt(scn.next());
		students[0].age = Integer.parseInt(scn.next());
		
	}
}
