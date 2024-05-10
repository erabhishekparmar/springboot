package maths;

public class PrimeFactors_Efficient {
	

	public static void primeFactors(int n) {
		  
		if(n<=1) {
			  System.out.println("No prime factors available");
			  return;
		 }
		
		while(n%2==0) {
			System.out.print(2+" ");
			n/=2;
		}
		
		while(n%3==0) {
			System.out.print(3+" ");
			n/=3;
		}
	 
		for (int i = 5; i <= Math.sqrt(n); i+= 6)
        {
            
            while (n%i == 0)
            {
                System.out.print(i + " ");
                n /= i;
            }
            
            while (n%(i+2) == 0)
            {
                System.out.print((i+2) + " ");
                n /= (i+2);
            }
            
        }

		if(n>3) {
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


//TC : O(sqrt(n))
//AS : O(1)