package java8;

public class LambdaExpressions {

	public static void main(String[] args) {
		
		FunctionalInterface f = ()->{
			return "Hi there!";
		};
		
		System.out.println(f.test());
		
	}
	
}
