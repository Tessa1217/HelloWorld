package edu.collection.generic;

class Orange {
}

public class BoxEx {
	public static void main(String[] args) {
		Box box = new Box();
		box.setField("Orange");
		// Object result = box.getField();
		String result = (String) box.getField();
		System.out.println(result);

		// Runtime exception (ClassCastException)
		// String cannot be cast to class
		// Orange orange = (Orange) box.getField();

		// Generic
		Box<String> box2 = new Box<String>();
		box2.setField("Banana");
		String str = box2.getField();
		System.out.println(str);

		Box<Integer> box3 = new Box<Integer>();
		box3.setField(13);
		int num = box3.getField();
		System.out.println(num);
	}
}
