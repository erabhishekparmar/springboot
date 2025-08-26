package superdemo;

public class Derived extends Base {

	public Derived() {
		// explicitly call the constructor of base class to avoid compile time exception
		super(10);
		System.out.println("Constructor of Derived");
	}
	
	public void show() {
		super.show();
		System.out.println("show of Derived...");
	}
}
