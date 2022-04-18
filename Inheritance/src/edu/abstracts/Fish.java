package edu.abstracts;

public class Fish extends Animal {

	@Override
	public void eat() {
		System.out.println("물고기가 먹이를 먹습니다.");
	}

	@Override
	public void run() {
		System.out.println("물고기가 헤엄을 칩니다.");
	}

	@Override
	public void sleep() {
		System.out.println("물고기가 잠을 잡니다.");
	}

}
