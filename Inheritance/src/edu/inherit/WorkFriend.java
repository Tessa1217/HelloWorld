package edu.inherit;

public class WorkFriend extends Friend {

	// WorkFriend Field
	private String company;
	private String department;

	// Constructor
	public WorkFriend(String name, String contact, //
			String company, String department) {
		super(name, contact);
		this.company = company;
		this.department = department;
	}

	// Getters & Setters
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	// Method
	@Override
	public String toString() {
		// 별도 메소드 오버라이딩 없었기 때문에 부모의 getters 호출
		return "WorkFriend\n[name = " + super.getName() + "\ncontact = " + super.getContact() //
				+ "\ncompany = " + company + "\ndepartment = " + department + "]";
	}

}
