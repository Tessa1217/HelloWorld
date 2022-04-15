package edu.statics;

public class PersonEx {
	public static void main(String[] args) {
		Person p1 = new Person("111111-1111111", "홍길동");
		p1.name = "김길동";
		// final 필드: p1.ssn = "111222-111333";
		
		Person p2 = new Person("112222-1111333", "박길동");
		
		//변경은 불가하나 각 객체(인스턴스)별로 다른 값을 가질 수 있음
		System.out.println(p1.ssn);
		System.out.println(p2.ssn);
		
		// 상수는 클래스 소속이므로 클래스.상수, 값 변경 불가 
		System.out.println(Person.PI);
	}

}
