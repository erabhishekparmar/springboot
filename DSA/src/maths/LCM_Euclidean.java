package maths;

public class LCM_Euclidean {
	
	
	public static int lcm(int a,int b) {
		return (a*b)/hcf(a,b);
	}
	
	public static int hcf(int a, int b) {
		 
		 // find min of both 
		 int min = a<b ? a : b;
		 
		 // loop from min to 1 
		 for(int i=min;i>=1;i--) {
			 if( (a%i==0) && (b%i==0) ) 
				 return i;
			 
		 }
		 
		 return 1;
		 
	}
	
	public static void main(String[] args) {
		
		int a=10, b=5;
		System.out.println(lcm(a,b)); // 10
	
		int a1=20, b1=28;
		System.out.println(lcm(a1,b1)); // 140
		
	}	
}


//TC : O(log(minimum of (a,b) ) )
//AS : O(1)