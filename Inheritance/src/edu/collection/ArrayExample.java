package edu.collection;

import java.util.ArrayList;

import edu.inherit.Friend;

// 배열 vs. 컬랙션
// 배열 활용한 프로그램, 컬랙션을 활용한 프로그램
// 인터페이스 선언 => 구현하는 클래스
public class ArrayExample {
	public static void main(String[] args) {
		// 배열은 크기 고정, null 값의 경우 별도 처리 필요, 배열 인덱스 이상에 추가할 경우 에러 발생
		Friend[] friendAry = new Friend[10];
		friendAry[0] = new Friend("홍길동", "010-1111-1111"); // 배열에 추가
		friendAry[1] = new Friend("박길동", "010-2222-2222");
		friendAry[0] = null; // 삭제

		for (int i = 0; i < friendAry.length; i++) {
			if (friendAry[i] != null) {
				System.out.println(friendAry[i].toString());
			}
		}

		Friend f1 = friendAry[0];
		System.out.println(f1.toString());

		System.out.println();

		// 컬랙션 활용 (인터페이스 => List 컬랙션 => ArrayList)
		ArrayList<Friend> friendList = new ArrayList<Friend>();
		// ArrayList friendList = new ArrayList();
		friendList.add(new Friend("김길동", "010-1111-1111")); // 추가
		friendList.add(new Friend("박길동", "010-2222-2222"));
		friendList.remove(0); // 삭제

		for (int i = 0; i < friendList.size(); i++) {
			System.out.println(friendList.get(i).toString()); // 인덱스 위치의 요소 가져오기
		}

		if (friendList.isEmpty()) { // 배열 요소가 있는지 확인
			System.out.println("friendList 배열 리스트가 비었습니다.");
		} else {
			System.out.println("friendList 배열 리스트가 비어있지 않습니다.");
		}

		friendList.clear(); // 배열의 요소들 삭제
		if (friendList.isEmpty()) {
			System.out.println("friendList 배열 리스트가 비었습니다.");
		} else {
			System.out.println("friendList 배열 리스트가 비어있지 않습니다.");
		}

		// Generic 미선언 시 Object 타입으로 리턴되므로 별도로 casting 필요
		// Friend f2 = (Friend) friendList.get(0);

		// Friend f2 = friendList.get(0);
		// System.out.println(f2.toString());

	}
}
