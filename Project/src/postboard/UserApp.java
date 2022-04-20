package postboard;

import java.util.ArrayList;
import java.util.Scanner;

public class UserApp implements UserService {

	// BoardApp과 연동 위하여 정적 필드 선언
	static ArrayList<User> users = new ArrayList<User>();
	static boolean check = false;
	static int userIdx = -1;

	Scanner scn = new Scanner(System.in);

	public void execute() {

		while (true) {
			System.out.println("==============================================================================");
			System.out.println("0. 계정 생성 | 1. 로그인 | 2. 로그아웃 | 3. 내 계정 정보 | 4. 이름 변경 | 5. 내 게시판 가기");
			System.out.println("==============================================================================");
			System.out.println("선택 >>> ");

			int menu = -1;
			try {
				menu = Integer.parseInt(scn.nextLine());

			} catch (NumberFormatException e) {
				System.out.print("올바른 입력이 아닙니다. ");
			}

			if (menu == UserService.SIGNUP) {
				if (check == false) {
					String id = askId();

					for (User user : users) {
						while (user.getId().equals(id)) {
							System.out.println("중복된 아이디입니다.");
							id = askId();
						}
					}

					String password = askPassword();
					System.out.println("*** 비밀번호 재확인 ***");
					String confirmPwd = askPassword();

					while (!(password.equals(confirmPwd))) {
						System.out.println("Error: 처음 지정하신 비밀번호와 다른 비밀번호입니다.");
						password = askPassword();
						System.out.println("다시 확인해주세요.");
						confirmPwd = askPassword();
					}

					String userName = askName();
					for (User user : users) {
						while (user.getUserName().equals(id)) {

							System.out.println("중복된 아이디입니다.");
							userName = askName();

						}
					}

					signUp(new User(id, password, userName));

				} else if (check == true) {
					System.out.println("로그인 상태에서는 계정을 생성하실 수 없습니다.");
				}

			} else if (menu == UserService.LOGIN) {

				if (check == false) {
					userIdx = logIn();
					try {
						check = logInStatus(users.get(userIdx));
					} catch (IndexOutOfBoundsException e) {
						System.out.println("로그인 정보가 올바르지 않습니다.");
					}
					if (check == false) {
						System.out.println("로그인에 실패하였습니다.");
					}
				} else if (check == true) {
					System.out.println("이미 로그인 상태입니다.");
				}

			} else if (menu == UserService.LOGOUT) {
				if (check == true) {
					check = logOut();
				} else if (check == false) {
					System.out.println("로그인 상태가 아닙니다.");
				}

			} else if (menu == UserService.MYINFO) {
				if (check == true) {
					myInfo();
				} else if (check == false) {
					System.out.println("로그인 중인 유저가 없습니다.");
				}

			} else if (menu == UserService.CHGNAME) {
				if (check == true) {
					chgName();
				} else if (check == false) {
					System.out.println("로그인이 필요한 작업입니다.");
				}

			} else if (menu == UserService.BOARD) {

				if (check == true) {
					System.out.println(users.get(userIdx).getUserName() + " 님의 게시판");
					goToBoard();
				} else if (check == false) {
					System.out.println("로그인이 필요한 작업입니다.");
				}
			} else if (menu == UserService.END) {

				System.out.println("프로그램을 종료합니다.");
				users.clear();
				check = false;
				userIdx = -1;
				break;
			} else if (menu == 119) {
				for (User user : users) {
					System.out.println(user.toString());
				}
			} else {
				System.out.println("메뉴를 다시 선택해주세요.");
			}
		}

	}

	public String askId() {
		System.out.println("아이디 >>> ");
		String id = scn.nextLine();
		return id;
	}

	public String askPassword() {
		System.out.println("비밀번호 >>> ");
		String password = scn.nextLine();
		return password;
	}

	public String askName() {
		System.out.println("유저 이름 >>> ");
		String userName = scn.nextLine();
		return userName;
	}

	@Override
	public int logIn() {
		String id = askId();
		String password = askPassword();
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getId().equals(id) && users.get(i).getPassword().equals(password)) {
				System.out.println("로그인 되었습니다.");
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean logInStatus(User user) {
		boolean check = false;
		if (user != null) {
			check = true;
		}
		return check;
	}

	@Override
	public void signUp(User user) {
		users.add(user);
		System.out.println("*** 계정 생성을 완료하였습니다. ***");
	}

	@Override
	public boolean logOut() {
		boolean check = false;
		System.out.println("로그아웃 하시겠습니까? (yes/no)");
		String answer = scn.nextLine();
		if (answer.startsWith("y")) {
			System.out.println("로그아웃 하셨습니다.");
			check = false;
		} else if (answer.startsWith("n")) {
			System.out.println("로그인 상태가 유지됩니다.");
			check = true;
		}
		return check;
	}

	@Override
	public void myInfo() {
		System.out.println(users.get(userIdx).toString());
	}

	@Override
	public void chgName() {
		System.out.println("변경할 유저 이름 >>> ");
		String newName = scn.nextLine();

		for (User user : users) {
			while (user.getUserName().equals(newName)) {
				System.out.println("중복된 유저 이름입니다.");
				System.out.println();
				System.out.println("변경할 유저 이름 >>> ");
				newName = scn.nextLine();
			}
		}

		users.get(userIdx).setUserName(newName);
		System.out.println("유저 이름이 변경되었습니다.");

	}

	@Override
	public void goToBoard() {
		BoardExe.main(null);
	}

}
