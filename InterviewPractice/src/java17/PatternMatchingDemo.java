package java17;

public class PatternMatchingDemo {

	// assume we have class Shape, Circle, Square Rectangle
	/*
	 // run this code in cmd with below command 
	  E:\>javac --enable-preview --release 17 Main.java
	  java --enable-preview Main

	output : 78.53981633974483
24.0

	public static double area(Shape shape) {
        return switch (shape) {
            case Circle c -> Math.PI * c.radius * c.radius;
            case Rectangle r -> r.width * r.height;
        };
    }

    public static void main(String[] args) {
        System.out.println(area(new Circle(5)));      // 78.5
        System.out.println(area(new Rectangle(4, 6))); // 24
    }
    */
	
}
