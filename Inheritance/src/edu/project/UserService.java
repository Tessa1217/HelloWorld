package edu.project;

public interface UserService {

	int LOGIN = 1;
	int SIGNUP = 2;
	int LOGOUT = 3;
	int MYNAME = 4;
	int BOARD = 5;

	public void logIn(User user);

	public void signUp(User user);

	public void logOut();

	public User chgMyName(User user);

	public boolean goToBoard();

}
