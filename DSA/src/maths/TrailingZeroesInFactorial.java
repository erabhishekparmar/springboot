package maths;

public class TrailingZeroesInFactorial {

	public static int trailingZeroes(int n) {
		int zeroes = 0;
		
		for(int i=5;i<=n;i=i*5) {
			zeroes = zeroes + n/i;
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
		
		int n3 = 25;
		System.out.println(trailingZeroes(n3));
		
		int n4 = 100;
		System.out.println(trailingZeroes(n4));
		
		
		
	}	
}


//TC : O(log5(n))
//AS : O(1)