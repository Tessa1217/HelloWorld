package edu.Constructor;

import java.util.Scanner;

public class MemberEx {
	public static void main(String[] args) {
		Member member1 = new Member();
		member1.showInfo();

		System.out.println();

		Member member2 = new Member("myid1234", "홍길동", "010-1234-5678", 25);
		member2.showInfo();
		// member2.memberAge = 29;
		member2.showInfo();
		// member2.memberID = "user1234"; => this field is not visible (private)

		// private로 접근을 제어할 경우 생성자나 메소드를 통해서만 변경 가능
		member2.setMemberAge(0); // 메소드 내 지정한 조건을 만족하지 못하여
		System.out.println("나이는 " + member2.getMemberAge() + "살 입니다."); // 디폴트로 지정된 10이 출력
		member2.setMemberAge(-25);
		System.out.println("나이는 " + member2.getMemberAge() + "살 입니다.");
		member2.setMemberAge(30);
		System.out.println("나이는 " + member2.getMemberAge() + "살 입니다.");

		member1.setMemberID("user12");
		System.out.println("변경된 회원 아이디: " + member1.getMemberID());

		// 새로운 멤버 여러명의 정보를 members 배열에 담기
		Scanner scn = new Scanner(System.in);

		Member[] members = new Member[2];

		for (int i = 0; i < members.length; i++) {
			System.out.println("회원아이디 이름 연락처 나이 순으로 입력해주세요 >>> ");
			String id = scn.next();
			String name = scn.next();
			String phone = scn.next();
			int age = Integer.parseInt(scn.next());

			Member newMember = new Member(id, name, phone, age);
			// 새로운 인스턴스 생성

			members[i] = newMember;
		}

		/*
		 * for (Member member : members) { member.showInfo(); System.out.println(); }
		 * System.out.println("end of program");
		 */

		// 1. 조회, 2.변경 (아이디, 해당하는 아이디의 연락처 변경) 3. 조회(입력 나이보다 큰 회원) 4. 종료
		while (true) {
			System.out.println("=========================================");
			System.out.println("01.이름 조회 02.연락처 변경 03.나이 조회 04.종료");
			System.out.println("=========================================");
			System.out.println("선택 >>> ");

			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {
				System.out.println("조회할 이름 >>> ");
				String searchName = scn.nextLine();
				for (int i = 0; i < members.length; i++) {
					if (members[i].getMemberName().equals(searchName)) {
						members[i].showInfo();
						System.out.println();
					}
				}
			} else if (selectNo == 2) {
				System.out.println("연락처 변경할 아이디 >>> ");
				String searchID = scn.nextLine();
				for (int i = 0; i < members.length; i++) {
					if (members[i].getMemberID().equals(searchID)) {
						
						System.out.println("변경할 연락처 >>> ");
						String newPhone = scn.nextLine();
						
						System.out.println("연락처를 변경하시겠습니까? (yes/no)");
						String confirm = scn.nextLine();
						
						if (confirm.equals("yes")) {
							members[i].setMemberPhone(newPhone);
							System.out.println("변경이 완료되었습니다.");
						} else if (confirm.equals("no")) {
							System.out.println("변경이 정상적으로 완료되지 않았습니다.");
						} 
					}
				}

			} else if (selectNo == 3) {
				System.out.println("조회할 연령대 >>> ");
				int searchAge = Integer.parseInt(scn.nextLine());
				for (int i = 0; i < members.length; i++) {
					if (members[i].getMemberAge() > searchAge) {
						members[i].showInfo();
						System.out.println();
					}
				}

			} else if (selectNo == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("유효한 값을 선택해주세요.");
			}
		}
	}
}
