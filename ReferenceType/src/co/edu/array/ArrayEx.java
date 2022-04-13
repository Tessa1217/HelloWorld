package co.edu.array;

public class ArrayEx {
	public static void main(String[] args) {
		//배열의 목적: 여러 개의 같은 유형의 값을 저장
		
		//학생 30명의 점수
		int[] intAry = new int[30];
		//정수(int) 배열([]) 변수(배열) 이름 (스택 영역에서 주소값을 가지고 있음) 
		//= new(인스턴스 생성) 배열의 크기; => (힙 영역에) 정수 int 30개 담을 공간 생성
		
		double[] dblAry = new double[10]; //실수(double) 형태의 값을 담을 수 있는 배열
		
		intAry[0] = 30;
		intAry[4] = 40;
		// intAry[30] = 55; -> 선언한 배열 저장 공간을 넘어설 경우 ArrayIndexOutOfBoundsException
		intAry[29] = 55;
		
		System.out.println(intAry[0]); //30
		System.out.println(intAry[4]); //40
		System.out.println(intAry[5]); //0, 정수형 배열은 선언 시 기본값 0이 저장되어 있음
		System.out.println(intAry[29]); //55
		
		String[] strAry = new String[5];
		System.out.println(strAry[0]); //null, 문자열 배열(reference type)은 기본값이 null
		
		// 배열의 초기값 지정
		int[] otherAry = {10, 20, 30, 40};
		for(int i = 0; i <= 3; i++) {
			System.out.println(otherAry[i]);
		}
		int[] theOtherAry = {10, 20, 30, 40};
		
		// 배열 내 값은 같을지라도 참조하는 값(주소값)이 다름
		if(otherAry == theOtherAry) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		if(otherAry[0] == theOtherAry[0]) { //가르키는 값 = 정수(실제 값), 같은 정수값이므로 same이 출력
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		
	}
}
