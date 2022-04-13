package co.edu.array;

public class ArrayEx2 {
	public static void main(String[] args) {
		int[] intAry = {10, 20, 30, 40, 50};
		
		// 배열 내 원소들 출력
		for(int i = 0; i < 5; i++) {
			System.out.println(intAry[i]);
		}
		
		// 배열 중 가장 큰 수 찾기
		int maxVal = 0;
		for(int i = 0; i < 5; i++) {
			if(maxVal < intAry[i]) {
				maxVal = intAry[i];
			}
		}
		System.out.println("최대값은 " + maxVal + "입니다.");
		
		// 배열 내 원소들의 합
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			sum += intAry[i];
		}
		System.out.println("배열 원소들의 합은 " + sum + "입니다.");
	}
}
