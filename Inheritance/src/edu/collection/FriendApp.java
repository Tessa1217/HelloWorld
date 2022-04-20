package edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import edu.inherit.Friend;
import edu.inherit.Gender;

// App의 용도: 친구 목록 저장하기 위한 앱
// App의 기능: 추가, 수정, 삭제, 조회
// 1) 배열, 2) 컬랙션 <= 인터페이스 구현
public class FriendApp {
	public static void main(String[] args) {
		// 추가, 수정, 삭제, 조회 => 컨트롤 역할
		FriendService service = new FriendServiceArray();
		// service = new FriendServiceList();
//		service = new FriendServiceStream();
		Scanner scn = new Scanner(System.in);

		while (true) {

			System.out.println("===============================================================================");
			System.out.println("1.추가 | 2.연락처 수정 | 3.삭제 | 4.조회 | 5. 전체 리스트 | 6.성별조회 | 7.이름 변경 8.종료");
			System.out.println("===============================================================================");
			System.out.println("선택 >>> ");
			int menu = scn.nextInt();

			if (menu == FriendService.ADD) {
				System.out.println("친구 이름과 연락처 >>> ");
				String name = scn.next();
				String contact = scn.next();
				System.out.println("친구 성별 >>> ex) 남자, 여자");
				String gen = scn.next();
				Gender gender = FriendService.findGender(gen);
				Friend friend = new Friend(name, contact, gender);
				service.addFriend(friend);

			} else if (menu == FriendService.MOD) {
				System.out.println("친구 이름 >>> ");
				String name = scn.next();
				System.out.println("새로운 이름 >>> ");
				String contact = scn.next();
				Friend friend = new Friend(name, contact, Gender.Male);
				service.modFriend(friend);

			} else if (menu == FriendService.DEL) {
				System.out.println("삭제할 친구 이름 >>> ");
				String name = scn.next();
				service.remFriend(name);

			} else if (menu == FriendService.SEARCH) {
				System.out.println("조회할 친구 이름 >>> ");
				String name = scn.next();
				Friend friend = service.findFriend(name);
				if (friend != null) {
					System.out.println("조회된 친구 정보: ");
					System.out.println(friend.toString());
				}

			} else if (menu == FriendService.LIST) {
				service.listFriend();

			} else if (menu == FriendService.GENDERLIST) {
				System.out.println("조회할 성별 >>> ex) 남, 여");
				String gen = scn.next();
				Gender gender = FriendService.findGender(gen);
				ArrayList<Friend> genderList = new ArrayList<Friend>(service.findGender(gender));
				for (Friend friend : genderList) {
					System.out.println(friend.toString());
				}

			} else if (menu == FriendService.NAMECHG) {
				System.out.println("친구 이름 >>> ");
				String name = scn.next();
				System.out.println("수정할 친구 이름 >>> ");
				String newName = scn.next();
				Friend friend = new Friend(name, null, null);
				service.changeName(friend, newName);

			} else if (menu == 8) {
				System.out.println("End of program");
				break;

			} else {
				System.out.println("유효한 값을 입력하세요");

			}
		}
	}
}
