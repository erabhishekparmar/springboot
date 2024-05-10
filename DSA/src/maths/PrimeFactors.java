package maths;

public class PrimeFactors {
	

	public static void primeFactors(int n) {
		  
		if(n==0 || n==1) {
			  System.out.println("No prime factors available");
			  return;
		 }
		
		while(n%2==0) {
			System.out.print(2+" ");
			n/=2;
		}
		
		for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            // While i divides n, print i and divide n
            while (n%i == 0)
            {
                System.out.print(i + " ");
                n /= i;
            }
        }
		
		/*
		 * for(int i=3; i*i<n ;i+=2) {
		 * 
		 * while(n%i==0) { System.out.print(i+" "); n=n/i; }
		 * 
		 * }
		 */

		if(n>2) {
			System.out.println(n);
		}
		  
		  
	}
	  
	
	public static void main(String[] args) {
		
		int n = 135;
		primeFactors(n);
		
		int n1 = 20;
		primeFactors(n1);
		
		int n2 = 12;
		primeFactors(n2);
		
		 
		
	}	
}


//TC : O(logn*sqrt(n))
//AS : O(1)