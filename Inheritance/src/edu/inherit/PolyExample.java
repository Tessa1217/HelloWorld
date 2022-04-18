package edu.inherit;

class Driver {
	public void drive(Car car) {
		car.drive();
	}
}

public class PolyExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Car car = new Car();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		driver.drive(car); // 매개변수의 다형성
		driver.drive(bus); // 매개변수의 다형성
		driver.drive(taxi); // 매개변수의 다형성
	}
}
