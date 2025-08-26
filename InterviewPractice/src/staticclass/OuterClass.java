package staticclass;

public class OuterClass {

	public void showOuter() {
		System.out.println("OuterClass Show!");
	}
	
	public static class NestedClass{
		public void show() {
			System.out.println("NestedClass Show!");
		}
	}
	
	
}
