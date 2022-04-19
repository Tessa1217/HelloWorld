package edu.collection;

import java.util.ArrayList;
import java.util.stream.Stream;

import edu.inherit.Friend;

public class FriendServiceStream implements FriendService {

	ArrayList<Friend> friends = new ArrayList<Friend>();
	Stream<Friend> stream = friends.stream();

	@Override
	public void addFriend(Friend friend) {
		friends.add(friend);
		System.out.println("친구 추가가 완료되었습니다.");
	}

	@Override
	public void modFriend(Friend friend) {
		String sentence = " 수정할 친구를 추가해주세요.";
		for (int i = 0; i < friends.size(); i++) {
			if (friends.get(i).getName().equals(friend.getName())) {
				friends.get(i).setContact(friend.getContact());
				System.out.println("연락처 수정이 완료되었습니다.");
			}
		}
	}

	@Override
	public void remFriend(String name) {
		String sentence = " 삭제할 친구를 추가해주세요.";
		this.emptyFriend(sentence);
		for (int i = 0; i < friends.size(); i++) {
			if (friends.get(i).getName().equals(name)) {
				friends.remove(i);
				System.out.println("친구 삭제가 완료되었습니다.");
			}
		}
	}

	@Override
	public Friend findFriend(String name) {
		String sentence = " 조회할 친구를 추가해주세요.";
		this.emptyFriend(sentence);
		stream.filter(friend -> friend.getName().equals(name))
				.forEach((friend) -> System.out.println(friend.toString()));
		/*
		 * for (int i = 0; i < friends.size(); i++) { if
		 * (friends.get(i).getName().equals(name)) { return friends.get(i); } } return
		 * null;
		 */
		return null;
	}

	@Override
	public void listFriend() {
		this.emptyFriend("");
		stream.forEach((e) -> System.out.println(e.toString()));
	}
}
