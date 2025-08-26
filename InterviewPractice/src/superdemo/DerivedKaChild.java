package superdemo;

public class DerivedKaChild extends Derived {
	
	
	public DerivedKaChild() {
		System.out.println("Constructor of DerivedKaChild");
	}

	public void show() {
		super.show();
		System.out.println("show of DerivedKaChild...");
	}
}
