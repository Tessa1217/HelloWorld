package edu.Constructor;

public class CarEx {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println(car1.model); // truck
		System.out.println(car1.color); // Silver
		System.out.println(car1.maxSpeed); // 250

		Car car2 = new Car("bus");
		System.out.println(car2.model); // bus
		System.out.println(car2.color); // Silver
		System.out.println(car2.maxSpeed); // 250

		Car car3 = new Car("taxi", "white");
		System.out.println(car3.model); // taxi
		System.out.println(car3.color); // white
		System.out.println(car3.maxSpeed); // 250

		Car car4 = new Car("automobile", "black", 300);
		System.out.println(car4.model); // automobile
		System.out.println(car4.color); // black
		System.out.println(car4.maxSpeed); // 300
		
		car4.setGas(3);
		car4.canRun();
		car4.drive();
		car4.canRun();
		car4.drive();
		car4.canRun();
		car4.drive();
		car4.canRun();
	}

}
