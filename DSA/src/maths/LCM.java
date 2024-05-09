package maths;

public class LCM {
	
	public static int lcm(int a, int b) {
	
		 // find max of both 
		 int max = a>b ? a : b;
		 
		 int res = max;
		 
		 while(res<=a*b) {
			 if( (res%a==0) && (res%b==0) )
				 return res;
			 res++;
		 }
		 
		 return a*b;
		 
	}
	
	public static void main(String[] args) {
		
		int a=10, b=5;
		System.out.println(lcm(a,b)); // 10
	
		int a1=20, b1=28;
		System.out.println(lcm(a1,b1)); // 120
		
	}	
}


//TC : O(a*b) 
//AS : O(1)