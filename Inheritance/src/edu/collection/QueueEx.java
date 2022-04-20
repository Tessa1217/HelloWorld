package edu.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		// Queue FIFO
		// Java에서 Queue는 LinkedList를 활용하여 생성 필요
		Queue<Integer> queue = new LinkedList<Integer>();

		for (int i = 0; i < 5; i++) {
			queue.add(i + 1);
		}

		System.out.println(queue.peek());
		System.out.println(queue.contains(3));
	}
}
