package singletonpattern;

import java.lang.reflect.Constructor;

public class MainReflection {
	public static void main(String args[]) throws Exception {
		 Singleton singleton1 = Singleton.getInstance();
		 Constructor<Singleton> construtor = Singleton.class.getDeclaredConstructor();
		 construtor.setAccessible(true);
		 Singleton singleton2 = construtor.newInstance();
		 System.out.println(singleton1==singleton2); // false 
	}
}
