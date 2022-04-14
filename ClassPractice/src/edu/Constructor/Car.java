package edu.Constructor;

public class Car {

	// 필드
	String model;
	String color;
	int maxSpeed;
	private int gas;

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
	
	//메소드
	public void setGas(int gas) {
		this.gas = gas;
	}
	
	public void drive() {
		gas -= 1;
	}
	
	public void canRun() {
		while(true) {
			if(gas > 0) {
				System.out.println("가스가 " + gas + "만큼 남아 차가 달릴 수 있습니다.");
				break;
			} else {
				System.out.println("가스가 " + gas + "만큼 남아 차가 달릴 수 없습니다.");
				return; 
			}
			
		}
	}

}
