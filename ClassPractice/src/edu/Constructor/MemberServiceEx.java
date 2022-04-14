package edu.Constructor;

public class MemberServiceEx {
	public static void main(String[] args) {
		MemberService member1 = new MemberService();
		boolean result = member1.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			member1.logout("hong");
		} else {
			System.out.println("아이디 또는 패스워드가 올바르지 않습니다.");
		}
	}

}
