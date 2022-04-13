package edu.Constructor;

public class Car {

	// 필드
	String model;
	String color;
	int maxSpeed;

	// 생성자
	Car() {
		this("truck", "Silver", 250);
	}

	Car(String model) {
		this(model, "Silver", 250);
	}

	Car(String model, String color) {
		this(model, color, 250);
	}

	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
