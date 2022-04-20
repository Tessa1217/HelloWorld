package edu.collection;

import java.util.ArrayList;

import edu.inherit.Friend;
import edu.inherit.Gender;

public class FriendServiceList implements FriendService {

	ArrayList<Friend> friends = new ArrayList<Friend>();

	@Override
	public void emptyFriend(String sentence) {
		if (friends.isEmpty()) {
			System.out.println("친구 목록이 비었습니다." + sentence);
		}
	}

	@Override
	public void addFriend(Friend friend) {
		friends.add(friend);
		System.out.println("친구 추가가 완료되었습니다.");
	}

	@Override
	public void modFriend(Friend friend) {
		String sentence = " 수정할 친구를 추가해주세요.";
		this.emptyFriend(sentence);
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
		for (int i = 0; i < friends.size(); i++) {
			if (friends.get(i).getName().equals(name)) {
				return friends.get(i);
			}
		}
		return null;
	}

	@Override
	public void listFriend() {
		this.emptyFriend("");
		for (int i = 0; i < friends.size(); i++) {
			System.out.println(friends.get(i).toString());
			System.out.println();
		}
	}

	@Override
	public ArrayList<Friend> findGender(Gender gender) {
		ArrayList<Friend> genderList = new ArrayList<Friend>();
		for (int i = 0; i < friends.size(); i++) {
			if (friends.get(i).getGender() == gender) {
				// 열거형 타입 클래스 (==로 비교)
				genderList.add(friends.get(i));
			}
		}
		return genderList;
	}

}
