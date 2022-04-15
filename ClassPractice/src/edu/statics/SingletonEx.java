package edu.statics;
class Car {

}
public class SingletonEx {
	public static void main(String[] args) {
		//외부에서는 new 연산자로 생성 불가 => Singleton singleton1 = new Singleton();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		// s1이 참조하는 값과 s2가 참조하는 값이 동일 (하나의 인스턴스만 존재하고 s1, s2는 해당 인스턴스를 참조)
		if(s1 == s2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
