package edu.except;

public class ClassNotFoundEx {
	public static void main(String[] args) {

		// ClassNotFoundException extends ... Exception
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 실행 전 에러 처리 해주어야 실행 가능
	}

}
