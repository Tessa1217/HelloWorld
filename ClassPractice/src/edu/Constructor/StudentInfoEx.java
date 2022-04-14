package edu.Constructor;

public class StudentInfoEx {
	public static void main(String[] args) {

		// 필드
		Student stud1 = new Student();
		//Student() 생성자 호출
		stud1.name = "홍길동";
		stud1.studNo = "22-1234567";
		stud1.age = 20;
		stud1.height = 174.5;

		Student stud2 = new Student();
		stud2.name = "권유진";
		stud2.studNo = "22-1234789";
		stud2.age = 27;
		stud2.height = 163.5;

		// 필드의 초기값
		Student stud3 = new Student("권유진", "22-876456");
		System.out.println(stud3.name); // null => 권유진(생성자를 통해 필드에 값 전달)
		System.out.println(stud3.studNo); // null => 22-876456
		System.out.println(stud3.age); // 0
		System.out.println(stud3.height); // 0.0
		stud3.age = 25;
		stud3.height = 163.5;
		
		Student stud4 = new Student("홍길동", "22-12387384", 25);
		stud4.showInfo();
		
		
		Student stud5 = new Student("김길동", "22-113389854", 29, 180);
		stud5.showInfo(); 
		
		//Student stud6 = new Student("박길동");
		//stud6.showInfo(); 
		
		// 메소드
		stud1.study();
		stud2.study();
		stud1.eat();
		stud2.eat();
		stud1.showInfo();
		stud2.showInfo();
		stud3.showInfo();

	}
}
