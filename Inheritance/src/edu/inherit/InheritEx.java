package edu.inherit;

public class InheritEx {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		// Field Inheritance
		c1.field1 = ""; //Parent class field
		c1.field2 = ""; //Child1 class field
		
		c2.field1 = ""; //Parent class field
		c2.field3 = ""; //Child2 class field
		
		if(c1.field1 == c2.field1) { //true (parent class field)
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		// Method Inheritance
		c1.method1(); //Parent method
		c1.method2(); //Child1 method
		
		c2.method1(); //Parent method
		c2.method3(); //Child2 method
		
		// 부모의 참조 변수에 자식 인스턴스 할당
		Parent p1 = new Parent();
		p1 = new Child1(); //Promotion (자식의 요소를 부모에 담음)
		Parent p2 = new Parent();
		p2 = new Child2(); 
		Parent p3 = new Parent();
		Parent p4 = new Child2(); 
		
		// p1.field3 = ""; 부모가 가지고 있는 필드, 메소드만 활용 가능
		p1.field1 = ""; // Parent class field
		p1.method1(); // Child1 class method (override)
		p3.method1(); //Parent class method
		// 단 자식 클래스에서 재정의된 메소드가 있다면 오버라이딩된 자식 클래스 메소드 참조
		
		
		c1 = (Child1) p1; //Casting(강제 형 변환) //부모의 요소를 자식에 담음
		c1.field1 = "";
		c1.field2 = ""; 
		c1.method1();
		c1.method2();//부모, 자식이 가지고 있는 필드 모두 활용 가능
		
	}
}
