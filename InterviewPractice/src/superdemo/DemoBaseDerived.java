package superdemo;

public class DemoBaseDerived {
	public static void main(String args[]) {
		Base base = new Base(0); //Constructor of Base : 0
		Derived derived = new Derived(); 
		// Constructor of Base : 10
		// Constructor of Derived
		
		base.show(); //show of Base...
		derived.show(); //show of Derived...
		
		// calling object of based using derived object then use super keyword in method
		derived.show(); 
		//show of Base...
		//show of Derived...
		
		DerivedKaChild derivedKaChild = new DerivedKaChild(); 
		derivedKaChild.show();
	}
}
