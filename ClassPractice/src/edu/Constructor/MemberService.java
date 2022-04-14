package edu.Constructor;

public class MemberService {
	boolean login(String id, String password) {
		if((id == "hong") & (password == "12345")) {
			return true;
		} else {
			return false;
		}
	}
	
	void logout(String id) {
		if(id=="hong") {
			System.out.println("로그아웃 되었습니다.");
		} else {
			System.out.println("로그아웃이 실패하였습니다.");
		}
	}

}
