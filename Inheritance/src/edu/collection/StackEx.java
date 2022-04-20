package edu.collection;

import java.util.Iterator;
import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		// Stack = LIFO
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < 5; i++) {
			stack.push(i + 1);
		}

		// Stack Iterator
		Iterator<Integer> itr = stack.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println();

		stack.pop(); // 5
		stack.pop(); // 4

		itr = stack.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
}
