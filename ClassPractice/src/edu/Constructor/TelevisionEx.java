package edu.Constructor;

public class TelevisionEx {
	public static void main(String[] args) {
		// 실행 클래스
		Television tv1 = new Television();
		// 클래스 이름 인스턴스 이름 = new 연산자 클래스 생성자;
		// new 연산자를 통해 인스턴스 생성 시 힙 영역에 인스턴스(객체) 생성 + tv1 변수에(스택 영역) 해당하는 객체의 주소값을 담음
		// tv1 = Television 클래스의 인스턴스

		System.out.println(tv1);

		// 속성
		tv1.company = "Samsung";
		tv1.color = "Black";
		tv1.price = 300000;
		tv1.model = "UHD";
		System.out.println("제조사: " + tv1.company);
		System.out.println("색상: " + tv1.color);
		System.out.println("가격: " + tv1.price + "원");
		System.out.println("모델: " + tv1.model);

		System.out.println();

		// 기능
		tv1.turnOn();
		tv1.changeChannel(10);
		tv1.turnOff();

		System.out.println();

		Television tv2 = new Television();

		System.out.println(tv2);

		tv2.company = "LG";
		tv2.color = "White";
		tv2.price = 500000;
		tv2.model = "UHD";

		System.out.println("제조사: " + tv2.company);
		System.out.println("색상: " + tv2.color);
		System.out.println("가격: " + tv2.price + "원");
		System.out.println("모델: " + tv2.model);

		// 같은 클래스에서 생성한 인스턴스들이지만 참조하는 주소값이 다르기 때문에 false
		if (tv1 == tv2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		// tv1.model, tv2.model에는 UHD라는 값이 담겨있으므로 true
		if (tv1.model == tv2.model) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		if (tv1.model.equals(tv2.model)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
	}

}
