package edu.statics;

//edu.statics.Person => 상위패키지.하위패키지.클래스
public class Person {
	// final 필드 = 초기값을 주면 최종적인 값이 되어 수정 불가한 필드
	// 객체마다 가지는 불변의 '인스턴스' 필드
	// final 필드 초기값 지정 = 필드 선언 시, 생성자를 통해서
	// 변경은 불가하지만 인스턴스마다 다른 값을 가질 수는 있음
	final String nation = "Korea";
	final String ssn; // social security number
	static final double PI = 3.14159;
	String name;

	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
		
	// 상수(static final) = 객체마다 존재하지 않고 클래스에 존재
	// final 필드와는 달리 인스마다 존재하지 않고 공용성을 띠는 차이가 있음
	// 모두 대문자로 작성하는 것이 관례, 단어 혼합은 언더바로 연결 
	}
}
