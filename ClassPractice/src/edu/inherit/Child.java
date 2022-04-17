package edu.inherit;

public class Child extends Parent {
	String school;

	public Child(int age, String role, String name, String school) {
		super(age, role, name, school);
		this.school = school;
	}

	@Override
	public void familyRole(String name) {
		System.out.println(name + "은 자식입니다.");
	}

	@Override
	public void showInfo() {
		System.out.printf("이름: %s\n역할: %s\n이름: %s\n학교: %s\n", age, role, name, school);
	}
}
