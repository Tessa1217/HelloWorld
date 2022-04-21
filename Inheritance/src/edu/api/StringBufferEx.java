package edu.api;

public class StringBufferEx {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();

		// append method
		sb.append("hello");
		sb.append(" ");
		sb.append("world!");

		String sentence = sb.toString();
		System.out.println(sentence);
		System.out.println(sb.reverse());

		// capacity method
		System.out.println(sb.capacity());

	}
}
