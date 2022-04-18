package edu.abstracts;

public class Bird extends Animal {

	@Override
	public void eat() {
		System.out.println("새가 먹이를 먹습니다.");
	}

	@Override
	public void run() {
		System.out.println("새가 날고 있습니다.");
	}

}
