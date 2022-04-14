package edu.Constructor;

public class PrintEx {
	public static void main(String[] args) {
		Print pr1 = new Print();
		System.out.println(pr1.println(10));
		System.out.println(pr1.println(true));
		System.out.println(pr1.println(3.5));
		System.out.println(pr1.println("자바"));
	}
}
