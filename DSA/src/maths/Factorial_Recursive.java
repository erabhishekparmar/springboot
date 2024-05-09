package maths;

public class Factorial_Recursive {
	
	public static int factorial(int n) {
		 if(n==0)
			 return 1;
		 else 
			return n*factorial(n-1);
		
	}
	
	public static void main(String[] args) {
		
		int n=5;
		System.out.println(factorial(n));
	
		int n1 = 0;
		System.out.println(factorial(n1));
		
	}	
}


//TC : O(n)  
//AS : O(n)