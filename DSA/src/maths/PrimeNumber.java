package maths;

public class PrimeNumber {
	
	
	// TC : O(sqrt(n))
	public static boolean isPrimeEfficent(int n) {
		 if(n==1)
			 return false;
		 
		 for(int i=2;i*i<=n;i++) {
			 if(n%i==0)
				 return false;
		 }
		 return true;
	}
	
	// TC : O(n)
	public static boolean isPrime(int n) {
		 if(n==1)
			 return false;
		 
		 for(int i=2;i<n;i++) {
			 if(n%i==0)
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
		
		int n3 = 8;
		System.out.println(n3+":"+isPrime(n3));
		
		System.out.println("_______ Efficient Method_______________");
		
		int n4 = 5;
		System.out.println(n4+":"+isPrimeEfficent(n));
	
		int n5 = 2;
		System.out.println(n5+":"+isPrimeEfficent(n1));
		
		int n6 = 1;
		System.out.println(n6+":"+isPrimeEfficent(n2));
		
		int n7 = 8;
		System.out.println(n7+":"+isPrimeEfficent(n3));
		
		
	}	
}


//TC : O(n)  and O(sqrt(n))
//AS : O(1)