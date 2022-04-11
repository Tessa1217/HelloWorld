package co.edu.variable;
import java.io.IOException;
import java.util.Scanner;

public class SystemExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); //System.in = 키보드 (표준 입력)
		System.out.println("세 개의 단어를 입력하세요 예) 안녕 방가 잘가: "); //System.out (표준 출력)
		//Scanner scn = new Scanner("안녕 방가 잘가"); 
		//키보드 입력값뿐 아니라 String 값을 직접 입력하거나 파일을 읽어들일 수도 있다.
		while(scn.hasNext()) {//asking whether scanner has another token
			String str = scn.next();
			System.out.println(str);
			if(str.equals("exit")) { //exit 입력 시 while 루프를 종료
				break;
			}
		}	
		System.out.println("end of program");
		
		//System.in.read() - 키보드를 통해 읽어들인 값을 리턴
		System.out.println("숫자를 입력하세요: ");
		while(true) {
			int readByte;
			try{
				readByte = System.in.read();
				System.out.println(readByte);
				if(readByte == 49) { //49 = keyboard 1
					break;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("end of program");
	}
}
