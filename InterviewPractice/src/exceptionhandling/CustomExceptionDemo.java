package exceptionhandling;


public class CustomExceptionDemo {
	public static void main(String args[]) {
		int a = 0;
		int b = 10;
		
		try {
			if(a==0)
				throw new InvalidNumberException();
		} catch (Exception e) {
			System.out.println("Number should not be zero");
		}
		
	}
}
