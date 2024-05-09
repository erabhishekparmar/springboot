package maths;

public class NumberOfDigits_Log {
	
	public static int numberofDigits(int n) {
		
		 return (int) Math.floor(Math.log10(n))+1 ;
	}
	
	public static void main(String[] args) {
		
		int n=1254;
		//int n=0;
		System.out.println(numberofDigits(n));
		
		
	}	
}

//TC : O(number of digits) or  O(log10(n))
//AS : O(1)