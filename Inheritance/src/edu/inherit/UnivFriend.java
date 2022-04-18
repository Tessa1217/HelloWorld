package edu.inherit;

public class UnivFriend extends Friend {

	// UnivFriend Field
	private String univ;
	private String major;

	// Constructor
	public UnivFriend(String name, String contact, String univ, String major) {
		super(name, contact);
		this.univ = univ;
		this.major = major;
	}

	// Getters & Setters
	public String getUniv() {
		return univ;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	// Method
	@Override
	public String toString() {
		// 부모의 getters 상속 받기 때문에 this도 가능
		return "UnivFriend\n[name = " + this.getName() + //
				"\ncontact = " + this.getContact() + "\nuniv = " + univ //
				+ "\nmajor = " + major + "]";
	}
}
