package edu.project;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserApp implements UserService {

	ArrayList<User> users = new ArrayList<User>();
	Scanner scn = new Scanner(System.in);

	public void execute() {

		while (true) {
			System.out.println("1. 로그인 | 2. 계정 생성 | 3. 로그아웃 | 4. 유저 이름 확인 | 5. 게시판 가기");
			System.out.println("선택 >>> ");
			int choice = 0;
			try {
				choice = Integer.parseInt(scn.nextLine());
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해주세요.");
			}

			if (choice == UserService.LOGIN) {
				System.out.println("아이디 >>> ");
				String id = scn.nextLine();
				System.out.println("비밀번호 >>> ");
				String password = scn.nextLine();
				User user = new User(id, password);
				logIn(user);

			} else if (choice == UserService.SIGNUP) {
				System.out.println("아이디 >>> ");
				String id = scn.nextLine();
				System.out.println("비밀번호 >>> ");
				String password = scn.nextLine();
				System.out.println("유저 이름 >>> ");
				String userName = scn.nextLine();

				User user = new User(id, password, userName);
				signUp(user);

			} else if (choice == UserService.LOGOUT) {

			} else if (choice == UserService.MYNAME) {

			} else if (choice == UserService.BOARD) {
				for (User user : users) {
					if (user.getStatus() == true) {
						BoardApp app = new BoardApp();
						app.execute();
					} else if (user.getStatus() == false) {
						System.out.println("로그인이 필요합니다.");
						choice = 1;
					}
				}

			}
		}
	}

	@Override
	public void logIn(User user) {

		for (User usr : users) {
			if (usr.getId().equals(user.getId()) && usr.getPassword().equals(user.getPassword())) {
				System.out.println(usr.getUserName() + " 님, 로그인에 성공하셨습니다.");
				user.setStatus(true);
			}
		}

	}

	@Override
	public void signUp(User user) {
		users.add(user);
		System.out.println("계정 생성을 완료하였습니다.");
	}

	@Override
	public void logOut() {

	}

	@Override
	public User chgMyName(User user) {
		if (user.getStatus() == true) {
			System.out.println("변경할 유저 아이디 >>> ");
			String newName = scn.nextLine();
			user.setUserName(newName);
			System.out.println("유저 이름 변경이 완료되었습니다.");
			return user;
		} else if (user.getStatus() == false) {
			System.out.println("로그인 하세요.");
		}
		return null;
	}

	@Override
	public boolean goToBoard() {

	}

}
