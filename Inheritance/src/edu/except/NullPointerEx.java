package edu.except;

public class NullPointerEx {
	public static void main(String[] args) {
		String str = "Hello";
		str = null;
		try {
			System.out.println(str.toString()); // => NullPointerException
		} catch (NullPointerException e) {
			System.out.println("Null값을 참조");
		}
		System.out.println("end of program");
	}
}
