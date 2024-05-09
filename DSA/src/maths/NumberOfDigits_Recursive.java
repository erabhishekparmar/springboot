package maths;

public class NumberOfDigits_Recursive {
	
	public static int numberofDigits(int n) {
		
		if(n==0)
			return 0;
		
		else 
			return 1+numberofDigits(n/10);
	}
	
	public static void main(String[] args) {
		
		int n=1254;
		//int n=0;
		System.out.println(numberofDigits(n));
		
		
	}	
}

//TC : O(number of digits) or  O(log10(n))
//AS : O(1)