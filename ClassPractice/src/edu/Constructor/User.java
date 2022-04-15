package edu.Constructor;

import java.util.Scanner;

public class User {
	Scanner scn = new Scanner(System.in);
	private String userID;
	private String password;
	private String userName;

	User(String userID, String password, String userName) {
		this.userID = userID;
		this.password = password;
		this.userName = userName;

	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
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

	public void showUser() {
		System.out.println("아이디: " + userID + " 유저 이름: " + userName);
	}

	public void login(User user) {
		System.out.println("아이디 >>> ");
		String id = scn.next();
		scn.nextLine();
		if (user.getUserID().equals(id)) {
			System.out.println("비밀번호 >>> ");
			String password = scn.next();
			if (user.getPassword().equals(password)) {
				System.out.println(user.getUserName() + " 님, 로그인에 성공하셨습니다.");
			} else {
				System.out.println("비밀번호가 틀렸습니다. 재로그인 해주세요.");
			}
		} else {
			System.out.println("등록된 아이디가 없습니다.");
		}
	}
}
