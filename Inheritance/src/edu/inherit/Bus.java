package edu.inherit;

public class Bus extends Car {

	// Field
	String busNo;

	// Constructor
	public Bus() {
		super(); // 부모-자식 관계에서 super는 부모를 지칭 (부모의 기본 생성자 호출)
		System.out.println("Bus() 생성자 호출");
	}

	// Method
	public void fee(int busFee) {
		System.out.println("버스 요금: " + busFee + "원");
	}

	@Override
	public void drive() {
		System.out.println("버스가 운행을 합니다.");
	}

	// 부모 메소드 호출
	public void carDrive() {
		super.drive();
	}

	@Override
	public String toString() {
		return "Bus [busNo = " + busNo + ", model = " + super.model + "]";
		// Object (상속 순서: Object > Car > Bus) toString (메모리 주소 출력)
		// return super.toString();
	}
}
