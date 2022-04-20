package edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import edu.inherit.Friend;
import edu.inherit.Gender;

public interface FriendService {

	public int ADD = 1;
	public int MOD = 2;
	public int DEL = 3;
	public int SEARCH = 4;
	public int LIST = 5;
	public int GENDERLIST = 6;

	// 추가, 수정, 삭제, 조회
	public void addFriend(Friend friend);

	public void modFriend(Friend friend);

	public void remFriend(String name);

	public Friend findFriend(String name);

	public void listFriend();

	public ArrayList<Friend> findGender(Gender gender);

	public default void emptyFriend(String sentence) {

	}

	public static Gender findGender(String gen) {
		Gender gender = Gender.Male;
		if (gen.startsWith("남")) {
			gender = Gender.Male;
		} else if (gen.startsWith("여")) {
			gender = Gender.Female;
		}

		return gender;
	}

}
