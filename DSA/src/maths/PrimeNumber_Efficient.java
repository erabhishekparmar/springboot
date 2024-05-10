package maths;

public class PrimeNumber_Efficient {
	
	public static boolean isPrime(int n) {
		 if(n==1)
			 return false;
		 
		 if(n==2 || n==3)
			 return true;
		 
		 if(n%2==0 || n%3==0)
			 return false;
		 
		 for(int i=5;i*i<n;i=i+6) {
			 if(n%i==0 || n%(i+2)==0)
				 return false;
		 }
		 return true;
	}
	
	public static void main(String[] args) {
		
		int n = 5;
		System.out.println(n+":"+isPrime(n));
	
		int n1 = 2;
		System.out.println(n1+":"+isPrime(n1));
		
		int n2 = 1;
		System.out.println(n2+":"+isPrime(n2));
		
		int n3 = 28;
		System.out.println(n3+":"+isPrime(n3));
		
		int n4 = 29;
		System.out.println(n4+":"+isPrime(n4));
		
		 
		
	}	
}


//TC : O(sqrt(n))
//AS : O(1)