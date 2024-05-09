package maths;

public class Factorial {
	
	public static int factorial(int n) {
		int f=1;

		while(n!=0) {
			f = f*n;
			n--;
		}
		
		return f;
	}
	
	public static void main(String[] args) {
		
		int n=5;
		System.out.println(factorial(n));
	
		int n1 = 0;
		System.out.println(factorial(n1));
		
	}	
}


//TC : O(number of digits)  
//AS : O(1)