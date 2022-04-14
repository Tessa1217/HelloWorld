package edu.Constructor;

//접근제어자: public, default, private, protected
public class Member {
	// 회원정보 (회원 아이디, 회원의 이름, 회원 연락처, 회원의 나이)
	private String memberID = "unknown"; //필드를 멤버 클래스 안에서만 접근하고 처리
	private String memberName = "unknown";
	private String memberPhone = "unknown";
	private int memberAge = 0; // 나이는 0보다 커야함
	// 필드의 접근을 제안할 경우 생성자나 메소드를 이용할 수 있음 (캡슐화)
	
	// 생성자

	public Member() {

	}

	public Member(String memberID, String memberName, String memberPhone, int memberAge) {
		super();
		this.memberID = memberID;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.memberAge = memberAge;
	}
	
	//메소드
	
	//멤버 이름 지정과 가져오기
	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	//멤버 연락처 지정과 가져오기
	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	
	//멤버 아이디 지정과 가져오기
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}
	
	String getMemberID() {
		return memberID; //필드의 memberID
	}
	
	//멤버 나이의 지정과 가져오기
	void setMemberAge(int memberAge) {
		if(memberAge > 0) {
			this.memberAge = memberAge;
		} else {
			this.memberAge = 10;
		}
	}
	
	int getMemberAge() {
		return memberAge;
	}
	
	//멤버 정보 출력 
	void showInfo() {
		System.out.println("회원 아이디: " + memberID);
		System.out.println("회원 이름: " + memberName);
		System.out.println("회원 연락처: " + memberPhone);
		System.out.println("회원의 나이: " + memberAge);
	}

}
