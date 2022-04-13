package co.edu.dimension;

public class TwoArrayEx2 {
	public static void main(String[] args) {
		
		// 1~25까지 숫자판 만들기 
		int[][] intAry = new int[5][5];
		int num = 1;
		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry.length; j++) {
				intAry[i][j] += num++;
				System.out.printf("%3d", intAry[i][j]);
				// num++;
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry.length; j++) {
				System.out.printf("%3d", intAry[j][i]);
			}
			System.out.println();
		}

		System.out.println();

		for (int i = intAry.length - 1; i >= 0; i--) {
			for (int j = intAry.length - 1; j >= 0; j--) {
				System.out.printf("%3d", intAry[i][j]);
			}
			System.out.println();
		}

		System.out.println();

		for (int i = intAry.length - 1; i >= 0; i--) {
			for (int j = 0; j < intAry.length; j++) {
				System.out.printf("%3d", intAry[i][j]);
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < intAry.length; i++) {
			for (int j = intAry.length - 1; j >= 0; j--) {
				System.out.printf("%3d", intAry[i][j]);
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < intAry.length; i++) {
			for (int j = intAry.length - 1; j >= 0; j--) {
				System.out.printf("%3d", intAry[j][i]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 체크무늬
		int[][] intAry2 = new int[10][10];
		
		for (int i = 0; i < intAry2.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < intAry2.length; j++) {
					if (j % 2 == 0) {
						intAry2[i][j] = 1;
					}
					System.out.printf("%3d", intAry2[i][j]);
				}
			} else if (i%2 != 0) {
				for(int j = 0; j < intAry2.length; j++) {
					if(j%2 != 0) {
						intAry2[i][j] = 1;
					}
					System.out.printf("%3d", intAry2[i][j]);
				}
			}
			System.out.println();
		}

	}
}
