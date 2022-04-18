package edu.inherit2;

import edu.inherit.Friend;

class Friend2 extends Friend {

	public Friend2() {
		super(); // 부모 생성자 호출
		this.getName(); // protected
	}

}

public class ProtectedEx {

	public static void main(String[] args) {
		Friend2 friend = new Friend2();

	}
}
