package maths;

public class NumberOfDigits {
	
	public static int numberofDigits(int n) {
		int count=0;
		
		while(n!=0) {
			count++;
			n = n/10;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		int n=0;
		//int n =1254
		System.out.println(numberofDigits(n));
		
		
	}	
}


//TC : O(number of digits) or O(log10(n))
//AS : O(1)