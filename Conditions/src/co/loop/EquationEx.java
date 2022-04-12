package co.loop;

public class EquationEx {
	public static void main(String[] args) {
		
		//중첩 반복문을 이용하여 해 구하기
		
		for(int x=1;x<=10;x++) {
			for(int y=1;y<=10;y++) {
				int equation = (4*x) + (5*y);
				if(equation == 60) {
					System.out.printf("(%d, %d)\n", x, y);
				}
			}
		}
	}
}
