package edu.polymorphism;

public class CarEx {
	public static void main(String[] args) {
		Car car = new Car();

		for (int i = 0; i < 8; i++) {
			int problemLocation = car.run();
			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 재생타이어로 교체합니다.");
				car.frontLeft = new Tire("앞왼쪽", 3);
				break;
			case 2:
				System.out.println("앞오른쪽 중고타이어로 교체합니다.");
				car.frontRight = new Tire("앞오른쪽", 2);
				car.frontLeft.accumulateRotation -= 1;
				break;
			case 3:
				System.out.println("뒤왼쪽 한국타이어로 교체합니다.");
				car.backLeft = new HankookTire("뒤왼쪽", 12);
				car.frontLeft.accumulateRotation -= 1;
				car.frontRight.accumulateRotation -= 1;
				break;
			case 4:
				System.out.println("뒤오른쪽 금호타이어로 교체합니다.");
				car.backRight = new KumhoTire("뒤오른쪽", 15);
				car.frontLeft.accumulateRotation -= 1;
				car.frontRight.accumulateRotation -= 1;
				car.backLeft.accumulateRotation -= 1;
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("--------------------------");
		}
	}
}
