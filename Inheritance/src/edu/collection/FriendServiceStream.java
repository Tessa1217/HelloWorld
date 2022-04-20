package edu.collection;

import java.util.ArrayList;
import java.util.stream.Stream;

import edu.inherit.Friend;

public class FriendServiceStream extends FriendServiceList {

	Stream<Friend> stream = friends.stream();

	// Stream으로 전체 리스트 출력
	@Override
	public void listFriend() {
		super.emptyFriend("");
		stream.forEach((e) -> System.out.println(e.toString()));
		System.out.println();

	}
}
