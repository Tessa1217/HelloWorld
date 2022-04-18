package edu.inherit;

public class CarEx {
	public static void main(String[] args) {

		Bus bus = new Bus(); // 부모 생성자 호출 > 자식 생성자 호출
		// Parent field, method
		bus.model = "45인승 버스";
		bus.drive();
		bus.carDrive();

		// Child field, method
		bus.busNo = "777";
		System.out.println(bus.toString());
		int busFee = 1700;
		bus.fee(busFee);

		Taxi taxi = new Taxi(); // 부모 생성자 호출 > 자식 생성자 호출
		// 힙 영역: 부모 인스턴스 생성 후 자식 인스턴스 생성

		// Parent field, method
		taxi.model = "소나타";
		taxi.drive();

		// Child field, method
		taxi.type = "개인 택시";
		System.out.println(taxi.toString());
		int taxiFee = 6500;
		taxi.meter(taxiFee);

		// 자식 클래스의 인스턴스 => 부모 클래스 참조변수 할당 가능
		Bus[] buses = new Bus[10];
		Taxi[] taxies = new Taxi[10];

		// Promotion을 통해 부모 클래스 배열에 자식 클래스 인스턴스 할당이 가능
		Car[] cars = new Car[10];
		cars[0] = bus;
		cars[1] = taxi;
		// System.out.println(cars[0]);
		// System.out.println(cars[1]);
		// cars[0].drive();
		// cars[1].drive();

	}
}
