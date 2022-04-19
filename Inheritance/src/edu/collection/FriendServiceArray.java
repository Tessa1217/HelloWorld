package edu.collection;

import edu.inherit.Friend;

public class FriendServiceArray implements FriendService {

	Friend[] friends = new Friend[10];

	@Override
	public void addFriend(Friend friend) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				System.out.println("친구 추가가 완료되었습니다.");
				break;
			}
		}
	}

	@Override
	// 이름을 받아서 연락처를 수정
	public void modFriend(Friend friend) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(friend.getName())) {
				friends[i].setContact(friend.getContact());
				System.out.println("연락처 수정이 완료되었습니다.");
				break;
			}
		}
	}

	@Override
	public void remFriend(String name) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(name)) {
				friends[i] = null;
				System.out.println("친구 삭제가 완료되었습니다.");
				break;
			}
		}

	}

	@Override
	public Friend findFriend(String name) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(name)) {
				return friends[i];
			}
		}
		return null;
	}

	@Override
	public void listFriend() {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				System.out.println(friends[i].toString());
				System.out.println();
			}
		}
	}

}
