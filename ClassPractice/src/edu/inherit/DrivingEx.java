package edu.inherit;

public class DrivingEx {
	public static void main(String[] args) {
		Driver driver1 = new Driver();
		Bus bus1 = new Bus();

		// 자동 타입 변환 : Vehicle vehicle = bus;
		driver1.drive(bus1);
		driver1.stop(bus1);
		System.out.println();

		Driver driver2 = new Driver();
		Taxi taxi1 = new Taxi();

		// Vehicle vehicle = taxi;
		driver2.drive(taxi1);
		driver2.stop(taxi1);
		System.out.println();

		Driver driver3 = new Driver();
		Vehicle vehicle1 = bus1;

		driver3.drive(vehicle1);
		driver3.stop(vehicle1);
		System.out.println();

		Driver driver4 = new Driver();
		Vehicle vehicle2 = taxi1;

		driver4.drive(vehicle2);
		driver4.stop(vehicle2);
		System.out.println();

		Driver driver5 = new Driver();
		Vehicle vehicle3 = new Bus();

		driver5.drive(vehicle3);
		driver5.stop(vehicle3);
		System.out.println();

		Driver driver6 = new Driver();
		Vehicle vehicle4 = new Taxi();

		driver6.drive(vehicle4);
		driver6.stop(vehicle4);
		System.out.println();

		boolean result = bus1 instanceof Vehicle;
		System.out.println(result);
		result = taxi1 instanceof Vehicle;
		System.out.println(result);
		result = bus1 instanceof Bus;
		System.out.println(result);
		result = taxi1 instanceof Taxi;
		System.out.println(result);
		result = vehicle3 instanceof Bus;
		System.out.println(result);
		result = vehicle4 instanceof Taxi;
		System.out.println(result);

	}

}
