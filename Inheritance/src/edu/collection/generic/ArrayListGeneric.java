package edu.collection.generic;

import java.util.ArrayList;

import edu.inherit.Friend;
import edu.inherit.UnivFriend;
import edu.inherit.WorkFriend;

public class ArrayListGeneric {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		System.out.println(list.get(0));

		ArrayList<Friend> friends = new ArrayList<Friend>();
		friends.add(new Friend("김길동", "010-1212-1212"));
		friends.add(new WorkFriend("박길동", "010-1111-1111", "ACompany", "IT"));
		friends.add(new UnivFriend("최길동", "010-3333-3333", "대구대학교", "컴퓨터정보"));

		for (int i = 0; i < friends.size(); i++) {
			System.out.println(friends.get(i).toString());
			System.out.println();
		}

	}

}
