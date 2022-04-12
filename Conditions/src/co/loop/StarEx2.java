package co.loop;

import java.util.Scanner;

public class StarEx2 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("정수를 입력하세요: ");
		int star = scn.nextInt();

		/*
		 * 별찍기 7
		 *********
		 *******
		 *****
		 ***
		 * 
		 */

		for (int i = 1; i <= star; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = (2 * star) - 1; k >= (i * 2) - 1; k--) {
				// k = 9, k >= 1, k--
				// k = 9, k >= 3, k--
				// k = 9, k >= 5, k-- ...
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		
		/*
		 별찍기 8
		 *
		 ***
		 *****
		 *******
		 *********
		 *******
		 *****
		 ***
		 *
		 */
		
		for (int i = 1; i <= star*2; i++) {
			if (i < (star*2)/2) {
				for(int j = 1; j <= (i*2)-1; j++) {
					System.out.print("*");
				}
			} else  {
				for(int j = star*2-1; j >= (i-star)*2+1; j--) { 
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println();

		/*
		 * 별찍기 9
		 *
        ***
       *****
      *******
     *********
      *******
       *****
        ***
         *
		 */
		
		for (int i = 1; i <= star * 2; i++) {
			if (i < (star * 2) / 2) {
				for (int j = i; j < star; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= (2 * i) - 1; k++) {
					System.out.print("*");
				}
			} else if (i > (star * 2) / 2) {
				for (int j = 1; j <= (i - star); j++) {
					System.out.print(" ");
				}
				for (int k = (2 * (star - 1)) - 1; k >= (i - star) * 2 - 1; k--) {
					System.out.print("*");
				}
			} else {
				for (int k = 1; k <= (2 * star) - 1; k++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}
}