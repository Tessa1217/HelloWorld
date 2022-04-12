package co.conditions;

public class IfEx4 {
	public static void main(String[] args) {
		//임의의 값을 생성해주는 Math.random() 메소드 사용
		// Math.random() 메소드의 반환값 = double (0.0 <= 값 < 1.0)
		int randomVal = (int) (Math.random() * 100) + 1; //1 <= randomVal <= 100
		System.out.println(randomVal);
		String msg = "";
		
		//생성된 값이 1 ~ 50까지인지 51 ~ 60까지인지, 61 ~ 70, 71 ~ 80, 81 ~ 90, 91 ~ 100 범위
		if(randomVal > 90) {
			msg = "91~100까지";
		} else if(randomVal > 80) {
			msg = "81~90까지";
		} else if (randomVal > 70) {
			msg = "71~80까지";
		} else if (randomVal > 60) {
			msg = "61~70까지";
		} else if (randomVal > 50) {
			msg = "51~60까지";
		} else {
			msg = "1~50까지";
		}
		System.out.printf("생성된 값은 %s의 범위에 속하는 값입니다.", msg);
	}
}

