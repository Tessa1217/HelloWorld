package edu.collection;

import java.util.ArrayList;
import java.util.stream.Stream;

import edu.inherit.Friend;
import edu.inherit.Gender;

public class FriendStream {
	public static void main(String[] args) {

		ArrayList<Friend> friends = new ArrayList<Friend>();
		friends.add(new Friend("박길동", "010-1111", Gender.Male));
		friends.add(new Friend("김길동", "010-2222", Gender.Male));

		Stream<Friend> stream = friends.stream();
		stream.forEach((e) -> System.out.println(e.toString()));

	}
}
