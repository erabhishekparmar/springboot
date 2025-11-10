package interview;

import java.lang.reflect.Constructor;

public class ReflectionDemo {
	public static void main(String[] args) throws Exception {
		// 1. Get Class object
		Class<?> clazz = Class.forName("interview.Car");

		// 2. Print class name
		System.out.println("Class Name: " + clazz.getName());

		// 3. Get methods
		System.out.println("Methods:");
		for (var method : clazz.getDeclaredMethods()) {
			System.out.println(" - " + method.getName());
		}

		// 4. Get fields
		System.out.println("Fields:");
		for (var field : clazz.getDeclaredFields()) {
			System.out.println(" - " + field.getName());
		}

		// 5. Get constructors
		System.out.println("constructor:");
		Constructor<?> defaultConstructor = clazz.getDeclaredConstructor();
		defaultConstructor.setAccessible(true);
		
		
	}
}
