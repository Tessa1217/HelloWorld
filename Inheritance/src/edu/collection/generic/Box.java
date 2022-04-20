package edu.collection.generic;

// Generic
public class Box<T> {

	T field; // 클래스의 최상단(제일 부모) 클래스

	public void setField(T field) {
		this.field = field;
	}

	public T getField() {
		return field;
	}
}
