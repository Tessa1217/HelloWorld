package edu.Constructor;

//객체(Object) => 도면(Class) => 텔레비젼(Instance)

//라이브러리(API)용 클래스
public class Television {
	// 추상화(Abstraction): 텔레비젼의 속성 중 필요한 부분만 정의

	// 속성(Field)
	String company;
	String model;
	int price;
	String color;

	// 생성자(Constructor)
	Television() {

	}

	// 기능(Method)
	// 메소드의 구성: 반환 유형, 메소드명, 매개변수
	void turnOn() {
		System.out.println("텔레비젼을 켭니다.");
	}

	void turnOff() {
		System.out.println("텔레비젼을 끕니다.");
	}

	void changeChannel(int channel) {
		System.out.println(channel + "번 채널로 변경합니다.");
	}

}
