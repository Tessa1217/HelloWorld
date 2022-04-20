package postboard;

public interface UserService {

	int SIGNUP = 0;
	int LOGIN = 1;
	int LOGOUT = 2;
	int MYINFO = 3;
	int CHGNAME = 4;
	int BOARD = 5;
	int END = 6;

	public int logIn();

	public void signUp(User user);

	public boolean logOut();

	public void myInfo();

	public void chgName();

	public void goToBoard();

	public boolean logInStatus(User user);

}
