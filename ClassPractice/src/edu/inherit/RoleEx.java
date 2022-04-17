package edu.inherit;

public class RoleEx {
	public static void main(String[] args) {
		Parent parent1 = new Parent();
		parent1.showInfo();
		parent1.familyRole(parent1.name);

		Parent parent2 = new Parent(45, "parent", "박길동", "사진작가");
		parent2.showInfo();
		parent2.familyRole(parent2.name);

		Child child1 = new Child(10, "child", "홍길이", "예일");
		child1.showInfo();
		child1.familyRole(child1.name);

		if (child1 instanceof Parent) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		Parent child2 = new Child(11, "child", "박길이", "예일");
		child2.showInfo();
		child2.familyRole(child2.name);

		// Parent child3 = new Child(); - Child 클래스에 해당 생성자는 구현 안 되어있어 사용 불가
		// child3.showInfo();

	}

}
