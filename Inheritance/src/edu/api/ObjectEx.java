package edu.api;

import java.util.ArrayList;
import java.util.HashSet;

class Member {

	String name;
	int age;

	Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
//		return super.hashCode();
//		비교 전 hashCode를 기준으로 그룹핑지어 검색/비교의 효율성 높임
		return age;
	}

	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return this.name == member.name ? true : false;
		}
		return false;
	}

	@Override
	public String toString() {
//		return super.toString();
		return "Member [name = " + name + ", age = " + age + "]";
	}

}

public class ObjectEx {
	public static void main(String[] args) {

		ArrayList<Member> members = new ArrayList<Member>();
		// ArrayList => 인덱스로 요소를 구분하여 중복된 값도 저장 가능
		for (int i = 0; i < 10; i++) {
			members.add(new Member("홍길동", 20));
		}
		System.out.println(members.size()); // 10

		// Set(집합) => 값으로 요소를 구분하기 때문에 중복값을 허용하지 않음
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(200);

		System.out.println(set.size()); // 3

		HashSet<Member> memberSet = new HashSet<Member>();
		for (int i = 0; i < 10; i++) {
			memberSet.add(new Member("홍길동", 20));
		}

		// Object 클래스의 equals는 (this == obj)이므로 새로운 인스턴스 생성 시
		// 속에 있는 값은 동일할지라도 다르게 취급
		System.out.println(memberSet.size()); // 10

		memberSet.add(new Member("김길동", 20));

		memberSet.add(new Member("박길동", 21)); // hashCode = age일 때 2
		// name을 equals의 비교대상으로 두었을 때 3 (홍길동 != 김길동)

		System.out.println(new Member("홍길동", 20).toString());

	}
}
