package maths;

public class HCF_EuclideanAlgo {
	
	public static int hcf(int a, int b) {
		 
		 while(a!=b) {
			 if(a>b)
				 a=a-b;
			 else 
				b=b-a;
		 }
		 return a;
 
	}
	
	
	public static int hcf_efficient(int a, int b) {
		 
		 if(b==0)
			 return a;
		 else
			 return hcf_efficient(b, a%b);

	}
	
	
	public static void main(String[] args) {
		
		int a=10, b=5;
		System.out.println(hcf(a,b)); // 5
	
		int a1=20, b1=28;
		System.out.println(hcf(a1,b1));
		
		System.out.println("_____________ Efficeint _____________");
		
		int a2=10, b2=5;
		System.out.println(hcf(a2,b2)); // 5
	
		int a3=20, b3=28;
		System.out.println(hcf(a3,b3));
		
	}	
}


//TC : O(log(min of (a,b)  ))
//AS : O(1)