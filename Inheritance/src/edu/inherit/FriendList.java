package edu.inherit;

import java.util.Scanner;

public class FriendList {
	public static void main(String[] args) {
		Friend[] friends = new Friend[10];

		Scanner scn = new Scanner(System.in);

//		friends[0] = new UnivFriend("홍길동", "010-1111-1111", "대구대학교", "컴퓨터정보");
//		friends[1] = new WorkFriend("김길동", "010-1212-1212", "A company", "개발팀");
//		friends[2] = new Friend("박길동", "010-1313-1313");

		while (true) {
			System.out.println("=====================================================");
			System.out.println("1.친구 등록 | 2.친구 목록 | 3.이름 조회 | 4.친구 삭제 | 5.종료");
			System.out.println("=====================================================");
			System.out.println("선택 >>> ");
			int menu = 0;
			try {
				menu = Integer.parseInt(scn.next());
			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력입니다.");
			}

			if (menu == 1) {
				System.out.println("=======================================");
				System.out.println("친구 구분 (1.친구 | 2.학교 친구 | 3.회사 친구)");
				System.out.println("=======================================");
				System.out.println("선택 >>> ");
				int friendMenu = 0;
				try {
					friendMenu = Integer.parseInt(scn.next());
				} catch (NumberFormatException e) {
					System.out.println("잘못된 입력입니다.");
					continue;
				}
				Friend friend = new Friend();

				System.out.println("친구 이름 >>> ");
				String name = scn.next();
				scn.nextLine();
				System.out.println("친구 연락처 >>> ");
				String contact = scn.nextLine();

				if (friendMenu == 1) {
					friend = new Friend(name, contact);
				} else if (friendMenu == 2) {
					System.out.println("친구 학교 >>> ");
					String school = scn.next();
					scn.nextLine();
					System.out.println("친구 전공 >>> ");
					String major = scn.next();
					friend = new UnivFriend(name, contact, school, major);
				} else if (friendMenu == 3) {
					System.out.println("친구 회사 >>> ");
					String company = scn.next();
					scn.nextLine();
					System.out.println("친구 부서 >>> ");
					String department = scn.nextLine();
					friend = new WorkFriend(name, contact, company, department);
				}

				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = friend;
						System.out.println("등록을 완료했습니다.");
						break;
					}
				}

			} else if (menu == 2) {
				for (Friend friend : friends) {
					if (friend != null) {
						System.out.println(friend.toString());
						System.out.println();
					}
				}

			} else if (menu == 3) {
				System.out.println("조회할 친구 이름 >>> ");
				String searchName = scn.next();
				scn.nextLine();
				for (Friend friend : friends) {
					if (friend != null && friend.getName().equals(searchName)) {
						System.out.println(friend.toString());
						System.out.println();
					}
				}

			} else if (menu == 4) {
				System.out.println("삭제할 친구 이름 >>> ");
				String deleteName = scn.next();
				scn.nextLine();
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null && friends[i].getName().equals(deleteName)) {
						friends[i] = null;
					}
				}

			} else if (menu == 5) {
				System.out.println("End of program");
				break;
			} else {
				System.out.println("유효한 메뉴를 선택해주세요.");
			}

		}
	}

}
