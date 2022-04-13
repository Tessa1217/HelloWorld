package co.edu.array;

public class ArrayEx4 {
	public static void main(String[] args) {
		// 1부터 30 범위의 임의의 값이 만들어지도록
		int[] intAry = new int[5];
		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = (int) (Math.random() * 30) + 1;
		}
		
		//for(int i = 0; i < intAry.length; i++) {
		//	System.out.println(intAry[i]);
		//}
		
		// 합과 평균 구하기
		int sum = 0;
		int cnt = 0;
		for (int i = 0; i < intAry.length; i++) {
			if (intAry[i] > 15) {
				System.out.println(intAry[i]);
				sum += intAry[i];
				cnt++;
			}
		}
		double avg = sum / (cnt * 1.0);
		System.out.println("15 초과 값들의 합은 " + sum + "입니다.");
		System.out.println("15 초과 값들의 평균은 " + avg + "입니다.");
	}
}
