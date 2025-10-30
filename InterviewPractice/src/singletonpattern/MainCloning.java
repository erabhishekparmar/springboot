package singletonpattern;

public class MainCloning {
	public static void main(String args[]) throws Exception {
		 SingletonCloning singleton1 = SingletonCloning.getInstance();
		 SingletonCloning singleton2 = (SingletonCloning) singleton1.clone();
		 System.out.println(singleton1==singleton2); // false 
	}
}
