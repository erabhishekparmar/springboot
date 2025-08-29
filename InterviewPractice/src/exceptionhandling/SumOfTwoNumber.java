package exceptionhandling;

public class SumOfTwoNumber {

	public static void main(String[] args) {
		int a = 10 ;
		int b = 0 ;
		
		try {
			int c = a/b;
		}
		catch(ArithmeticException ex) {
			ex.printStackTrace();
			System.out.println("No cannot be divided by zero!");
		}
		finally {
			System.out.println("Inside finally");
		}

	}

}
