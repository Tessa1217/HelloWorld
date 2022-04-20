package edu.inherit;

// 친구의 주소록: 이름, 연락처
// 학교 친구: 학교 이름, 전공 과목
// 직장 친구: 회사 이름, 부서 정보
public class Friend {

	// Field
	// 하위 자식 객체들도 공통적으로 가져야 하는 속성들: 부모 필드에 작성
	private String name;
	private String contact;
	private Gender gender;

	// Constructor
	protected Friend() {

	}

	public Friend(String name, String contact) {
		this.name = name;
		this.contact = contact;
	}

	public Friend(String name, String contact, Gender gender) {
		super();
		this.name = name;
		this.contact = contact;
		this.gender = gender;
	}

	// Getters & Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	// Method
	@Override
	public String toString() {
		return "Friend\n[name = " + name + "\ncontact = " + contact + "\ngender = " + gender + "]";
	}
}
