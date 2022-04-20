package postboard;

public class User {

	private String id;
	private String password;
	private String userName;

	User() {

	}

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

	@Override
	public String toString() {
		String hidePwd = "";
		for (int i = 0; i < password.length(); i++) {
			hidePwd += "*";
		}
		return "[유저 이름: " + userName + " | 아이디: " + id + " | 비밀번호: " + hidePwd + "]";
	}

}
