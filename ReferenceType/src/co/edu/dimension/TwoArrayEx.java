package co.edu.dimension;

public class TwoArrayEx {
	public static void main(String[] args) {
		int[][] intAry = new int[4][3];
		intAry[0][0] = 10; //배열 첫번째 행의 첫번째 열의 값을 지정
		intAry[1][0] = 20; //배열 두번째 행의 첫번째 열의 값을 지정
		intAry[3][2] = 100; 
		
		//각 행의 열 요소들 출력
		for(int i = 0; i < intAry[0].length; i++) {
			System.out.println(intAry[0][i]);
		}
		
		for(int i = 0; i < intAry[1].length; i++) {
			System.out.println(intAry[1][i]);
		}
		
		for(int i = 0; i < intAry[2].length; i++) {
			System.out.println(intAry[2][i]);
		}
		
		for(int i = 0; i < intAry[3].length; i++) {
			System.out.println(intAry[3][i]);
		}
		
		// 2차원 배열 전체 출력 
		for(int i = 0; i < intAry.length; i++) {
			for(int j = 0; j < intAry[0].length; j++) {
				System.out.printf("[%d][%d] = %d ", i, j, intAry[i][j]);
			}
			System.out.println();
		}
	}
}
