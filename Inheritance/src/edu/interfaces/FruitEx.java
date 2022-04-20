package edu.interfaces;

public class FruitEx {
	public void countFruit(Fruit type, int cnt) {
		System.out.println(type + "의 개수: " + cnt);
	}

	public static void main(String[] args) {
		FruitEx practice = new FruitEx();

		// Enum 리스트 출력
		for (Fruit type : Fruit.values()) {
			System.out.println(type);
		}

		// Enum 값 담기
		Fruit fruit = Fruit.APPLE;
		System.out.println(fruit);

		int cnt = 10;
		practice.countFruit(Fruit.BANANA, 10);
		practice.countFruit(Fruit.LEMON, 5);
	}
}
