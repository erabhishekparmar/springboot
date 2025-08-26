package staticclass;

import staticclass.OuterClass.NestedClass;

public class Main {
	public static void main(String args[]) {
		 OuterClass outerClass = new OuterClass();
		 outerClass.showOuter(); // OuterClass Show!
		 
		 NestedClass nestedClass = new NestedClass();
		 nestedClass.show(); //NestedClass Show!

		 
		 
		 
	}
}
