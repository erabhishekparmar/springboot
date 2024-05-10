package maths;

public class DivisorsOfNumber {
	
	// TC : O(n)
	public static void allDivisors(int n) {
		  
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				System.out.print(i+" ");
		}
		
	}
	
	// TC : O(sqrt(n))
	public static void allDivisorsEfficient(int n) {
		  
		int i=1;
		for(;i<=Math.sqrt(n);i++) {
			if(n%i==0)
				System.out.print(i+" ");
		}
		
		for(;i<n;i++) {
			if(n%i==0)
				System.out.print(i+" ");
		}
		
		
	}
	  
	
	public static void main(String[] args) {
		
		int n = 135;
		allDivisorsEfficient(n);
		
		System.out.println( );
		
		int n1 = 100;
		allDivisorsEfficient(n1);
		
		System.out.println( );
		
		int n2 = 12;
		allDivisorsEfficient(n2);
		
		
		System.out.println();
		System.out.println("______ Efficient _____________");
		
		int n4 = 135;
		allDivisorsEfficient(n4);
		
		System.out.println( );
		
		int n5 = 100;
		allDivisorsEfficient(n5);
		
		System.out.println( );
		
		int n6 = 12;
		allDivisorsEfficient(n6);
		
	}	
}


//TC : O(n) and  O(sqrt(n))
//AS : O(1)