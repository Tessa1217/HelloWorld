package edu.inherit;

public class Parent {
	int age = 60;
	String role = "Parent";
	String name = "홍길동";
	private String job = "검사";

	public Parent() {
	}

	public Parent(int age, String role, String name, String job) {
		this.age = age;
		this.role = role;
		this.name = name;
		this.job = job;
	}

	public void showInfo() {
		System.out.printf("이름: %s\n역할: %s\n이름: %s\n직업: %s\n", age, role, name, job);
	}

	public void familyRole(String name) {
		System.out.println(name + "은 부모입니다.");
	}

}
