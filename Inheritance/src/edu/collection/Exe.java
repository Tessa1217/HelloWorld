package edu.collection;

import edu.inherit.Friend;
import java.util.Arrays;
import java.util.stream.Stream;

public class Exe {
	public static void main(String[] args) {
		Stream<Friend> friends = Arrays.stream(new Friend[10]);
		friends.getClass();
	}

}
