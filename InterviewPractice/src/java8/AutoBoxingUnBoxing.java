package java8;

public class AutoBoxingUnBoxing {
	
	public static void main(String[] args) {
		
		int i = 10;
		Integer a = i; // autoboxing : interally Integer.valueOf(i)
		
		System.out.println(a);
		
		Integer b = 20;
		int x = b;	// unboxing 
		
		System.out.println(x);
		
		
	}
	
}
