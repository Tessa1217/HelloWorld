package edu.collection;

import java.util.Scanner;

import edu.inherit.Friend;

// App의 용도: 친구 목록 저장하기 위한 앱
// App의 기능: 추가, 수정, 삭제, 조회
// 1) 배열, 2) 컬랙션 <= 인터페이스 구현
public class FriendApp {
	public static void main(String[] args) {
		// 추가, 수정, 삭제, 조회 => 컨트롤 역할
		FriendService service = new FriendServiceArray();
		service = new FriendServiceList();
		service = new FriendServiceStream();
		Scanner scn = new Scanner(System.in);

		while (true) {

			System.out.println("====================================================");
			System.out.println("1.추가 | 2.수정 | 3.삭제 | 4.조회 | 5. 전체 리스트 | 6.종료");
			System.out.println("====================================================");
			System.out.println("선택 >>> ");
			int menu = scn.nextInt();

			if (menu == 1) {
				System.out.println("친구 이름 >>> ");
				String name = scn.next();
				scn.nextLine();
				System.out.println("친구 연락처 >>> ");
				String contact = scn.nextLine();
				Friend friend = new Friend(name, contact);
				service.addFriend(friend);

			} else if (menu == 2) {
				System.out.println("친구 이름 >>> ");
				String name = scn.next();
				scn.nextLine();
				System.out.println("새로운 연락처 >>> ");
				String contact = scn.nextLine();
				Friend friend = new Friend(name, contact);
				service.modFriend(friend);

			} else if (menu == 3) {
				System.out.println("삭제할 친구 이름 >>> ");
				String name = scn.next();
				scn.nextLine();
				service.remFriend(name);

			} else if (menu == 4) {
				System.out.println("조회할 친구 이름 >>> ");
				String name = scn.next();
				Friend friend = service.findFriend(name);
				if (friend != null) {
					System.out.println("조회된 친구 정보: ");
					System.out.println(friend.toString());
				}

			} else if (menu == 5) {
				service.listFriend();
			} else if (menu == 6) {
				System.out.println("End of program");
				break;

			} else {
				System.out.println("유효한 값을 입력하세요");
			}
		}
	}
}
