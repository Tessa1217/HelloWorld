package co.edu;

public class ReferenceEx {
	public static void main(String[] args) {
		// 기본 타입 - 실제 값을 변수 안에 저장

		int num1 = 100;
		int num2 = 100;

		if (num1 == num2) {
			System.out.println("같은 값입니다.");
		} else {
			System.out.println("다른 값입니다.");
		}

		// 참조 타입 - 값의 주소값을 통해 참조
		 		
		String str1 = new String("홍길동"); //인스턴스
		String str2 = new String("홍길동"); //인스턴스
		str1 = null; // 참조 영역과의 연결이 끊기고 아무것도 참조하는 값이 없습니다.
		str1 = "김길동";
		
		//if (str1 == str2) { 참조 변수의 주소값을 비교
		if (str1.equals(str2)) { //equals 메소드를 통해 값 비교 
			////str1 = null일 때/참조 변수가 null값을 가지고 있을 때 => NullPointerException
			System.out.println("같은 값입니다..");
		} else {
			System.out.println("다른 값입니다.");
		}		
	}
}
