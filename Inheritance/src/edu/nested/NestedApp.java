package edu.nested;

import java.util.InputMismatchException;
import java.util.Scanner;

class Friend {

	String name;
	String phone;
	int age;
	AgeGroup group;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public AgeGroup getGroup() {
		return group;
	}

	public void setGroup(AgeGroup group) {
		this.group = group;
	}

	public static AgeGroup friendGroup(int age) {
		AgeGroup group = AgeGroup.Adult;
		if (12 < age && age < 19) {
			group = AgeGroup.Teenager;
		} else if (age <= 12) {
			group = AgeGroup.Child;
		} else if (19 <= age && age < 60) {
			group = AgeGroup.Adult;
		} else if (60 <= age) {
			group = AgeGroup.Elderly;
		}

		return group;
	}

	@Override
	public String toString() {
		return "Friend [name = " + name + ", phone = " + phone + ", age = " + age + ", age group = " + group + "]";
	}

}

// 중첩클래스, 중첩인터페이스
public class NestedApp {

	static Scanner scn = new Scanner(System.in);
	static Friend[] friends = new Friend[10];

	interface FriendService {

		// Constant
		int ADD = 1;
		int MOD = 2;
		int LIST = 3;
		int AGEGROUP = 4;

		// Method
		void add();

		void modify();

		void list();

		void ageGroup();

	}

	static class FriendApp implements FriendService {

		@Override
		public void add() {
			System.out.println("친구 이름, 연락처, 나이 (공백 구분) >>> ");
			String name = scn.next();
			String phone = scn.next();
			int age = Integer.parseInt(scn.next());

			Friend friend = new Friend();
			friend.setName(name);
			friend.setPhone(phone);
			friend.setAge(age);
			AgeGroup group = Friend.friendGroup(age);
			friend.setGroup(group);

			for (int i = 0; i < friends.length; i++) {
				if (friends[i] == null) {
					friends[i] = friend;
					break;
				}
			}

		}

		@Override
		public void modify() {
			System.out.println("친구 이름, 변경할 연락처 (공백 구분) >>> ");
			String name = scn.next();
			String newPhone = scn.next();
			for (int i = 0; i < friends.length; i++) {
				if (friends[i] != null && friends[i].getName().equals(name)) {
					friends[i].setPhone(newPhone);
					break;
				}
			}
		}

		@Override
		public void list() {
			for (Friend friend : friends) {
				if (friend != null) {
					System.out.println(friend.toString());
				}
			}

		}

		@Override
		public void ageGroup() {
			System.out.println("조회할 연령대: (아이, 청소년, 어른, 노인)");
			String srchGroup = scn.next();
			AgeGroup group = AgeGroup.Adult;
			if (srchGroup.equals("아이")) {
				group = AgeGroup.Child;
			} else if (srchGroup.equals("청소년")) {
				group = AgeGroup.Teenager;
			} else if (srchGroup.equals("어른")) {
				group = AgeGroup.Adult;
			} else if (srchGroup.equals("노인")) {
				group = AgeGroup.Elderly;
			}
			for (Friend friend : friends) {
				if (friend != null && friend.getGroup() == group) {
					System.out.println(friend.toString());
				}
			}

		}

	}

	public static void main(String[] args) {
		FriendApp app = new FriendApp();

		while (true) {
			System.out.println("==============================================================");
			System.out.println("1. 친구추가 | 2. 연락처수정 | 3. 친구리스트 | 4. 연령대별 조회 | 5. 종료");
			System.out.println("==============================================================");
			System.out.println("메뉴 >>> ");

			int menu = 0;
			try {
				menu = Integer.parseInt(scn.next());
			} catch (NumberFormatException e) {
				System.out.println("*** 숫자를 입력해주세요 ***");
				scn.nextLine();

			}

			if (menu == FriendService.ADD) {
				app.add();
			} else if (menu == FriendService.MOD) {
				app.modify();
			} else if (menu == FriendService.LIST) {
				app.list();
			} else if (menu == FriendService.AGEGROUP) {
				app.ageGroup();
			} else if (menu == 5) {
				System.out.println("End of program");
				break;
			} else {
				System.out.println("메뉴를 다시 선택해주세요.");
			}
		}
	}

}
