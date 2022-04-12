package co.loop;
import java.util.Scanner;

public class StarEx1 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("정수를 입력해주세요: ");
		int star = scn.nextInt();
		
		System.out.println();
		
		/* 
		 별찍기 1
		 *****
		 *****
		 *****
		 *****
		 *****
		 */
		
		for(int i = 1; i <= star;i++) {
			for(int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/* 
		 별찍기 2
		 *
		 **
		 ***
		 ****
		 *****
		 */
		for(int i = 1; i <= star; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/* 
		 별찍기 3
		 *****
		 ****
		 ***
		 **
		 *
		 */
		
		for(int i = 1; i <= star; i++) {
			for(int j = star; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		 별찍기 4
		     *
		    **
		   ***
		  ****
		 *****
		 */
		
		for(int i = 1; i<=star; i++) {
			for(int j = (star-1); j >= i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		 별찍기 5
		 *****
		  ****
		   ***
		    **
		     *
		 */
		
		for(int i = 1; i <= star; i++) {
			for(int j = 0; j < (i-1); j++) {
				System.out.print(" ");
			}
			for(int k = star; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/* 별찍기 6
		     *
		    ***
		   *****
		  *******
		 *********
		 */
		
		for(int i = 1; i <= star; i++) {
			for(int j = 1; j <= (star - i); j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= (2*i)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
			
	}
}
