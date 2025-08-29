package abstraction;

public class Circle extends Shape {

	Circle(int x) {
		super(x); // constructor of Shape
	}

	@Override
	public void showShape() {
		System.out.println("Overridden method under Circle");
	}
	
}
