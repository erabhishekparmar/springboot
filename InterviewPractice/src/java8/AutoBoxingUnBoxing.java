package java8;

public class AutoBoxingUnBoxing {
	
	public static void main(String[] args) {
		
		int i = 10;
		Integer a = i; // auto-boxing : internally Integer.valueOf(i)
		
		System.out.println(a);
		
		Integer b = 30;
		int x = b;	// un-boxing 
		
		System.out.println(x);
		
		
	}
	
}
