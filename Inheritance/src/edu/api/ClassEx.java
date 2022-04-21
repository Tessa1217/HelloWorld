package edu.api;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ClassEx {
	public static void main(String[] args) {
		try {
			Class cls = Class.forName("java.lang.String");
			Method[] methods = cls.getDeclaredMethods();
			Set<Method> methodList = new HashSet<Method>(Arrays.asList(methods));
			for (Method method : methods) {
				System.out.println(method.getName());
			}
			System.out.println("=================");
			for (Method method : methodList) {
				System.out.println(method.getName());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Class obj = ObjectEx.class;
		Constructor[] cons = obj.getDeclaredConstructors();
		for (Constructor construct : cons) {
			System.out.println(construct.getName());
		}

		Class member = Member.class;
		Constructor[] cons2 = member.getDeclaredConstructors();
		for (Constructor construct : cons2) {
			System.out.println(construct.getName());
		}

	}
}
