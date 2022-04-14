package edu.Constructor;

public class Student {

	// 필드(속성)
	String name;
	String studNo;
	int age;
	double height;

	// 생성자
	// 인스턴스를 만들어줄 때 처리할 기능을 정의, 반환값이 존재하지 않음
	
	//매개값이 없는 생성자 = 기본 생성자 (만약 생성자 지정하지 않을 시 자바가 기본 생성자 자동으로 생성)
	
	/* public Student() {
		System.out.println("Student() 생성자가 호출되었습니다.");
	}
	
	// 생성자의 기능: 주로 필드의 값 지정 용도
	
	public Student(String nm, String sn) {
		name = nm;
		studNo = sn;
	}
	
	public Student(String nm, String sn, int ag) {
		name = nm;
		studNo = sn;
		age = ag;
	}
	
	public Student(String nm, String sn, int ag, double hg) {
		name = nm;
		studNo = sn;
		age = ag;
		height = hg;
	} */
	

	//생성자 오버라이딩
	public Student() {
		
	}
	public Student(String name) {
		this(name, null, 0, 0.0);
	}
	
	public Student(String name, String studNo) {
		this(name, studNo, 0, 0.0);
	}
	public Student(String name, String studNo, int age) {
		this(name, studNo, age, 0.0);
	}
	
	public Student(String name, String studNo, int age, double height) {
		// this: 객체 자신의 참조(this.필드 = this라는 참조 변수로 필드를 사용하는 것) 
		this.name = name;
		this.studNo = studNo;
		this.age = age;
		this.height = height;
	}

	// 메소드(동작, 기능)
	void study() {
		System.out.println(name + "은/는 공부 중입니다.");
	}

	void eat() {
		System.out.println(name + "은/는 밥 먹는 중입니다.");
	}

	void showInfo() {
		System.out.println(name + "의 학생번호는 " + studNo + //
				"이고 나이는 " + age + "살 이고 키는 " + height + "cm 입니다.");
	}
}
