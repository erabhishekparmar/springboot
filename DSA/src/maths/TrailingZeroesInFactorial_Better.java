package maths;

public class TrailingZeroesInFactorial_Better {
	
	public static int factorial(int n) {
		int f=1;

		while(n!=0) {
			f = f*n;
			n--;
		}
		
		return f;
	}
	
	public static int trailingZeroes(int n) {
		int zeroes = 0;
		
		int fact = factorial(n);
		
		while(fact%10==0){
			zeroes++;
			fact = fact/10;
		}
		
		return zeroes;
	}
	
	public static void main(String[] args) {
		
		int n=5;
		System.out.println(trailingZeroes(n));
	
		int n1 = 0;
		System.out.println(trailingZeroes(n1));
		
		int n2 = 20;
		System.out.println(trailingZeroes(n2));
		
	}	
}


//TC : O(n^2) because we are calculating factorial inside trailing zeroes  
//AS : O(1)