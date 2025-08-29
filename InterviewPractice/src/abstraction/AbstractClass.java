package abstraction;

public class AbstractClass {

	public static void main(String[] args) {
		 
		Shape shape = new Circle(10);
		
		shape.nonAbstract();
		
		shape.staticMethod();
		// or 
		Shape.staticMethod();
		
		shape.showShape();

	}

}
