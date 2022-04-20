package edu.project;

public class User {

	private String id;
	private String password;
	private String userName;
	private boolean status = false;

	User(String id, String password) {
		this.id = id;
		this.password = password;
	}

	User(String id, String password, String userName) {
		this.id = id;
		this.password = password;
		this.userName = userName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "My user name: " + userName;
	}

}
