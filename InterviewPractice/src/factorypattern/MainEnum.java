package factorypattern;

public class MainEnum {
    public static void main(String[] args) {

    	ShapeFactoryEnum shapeFactory = new ShapeFactoryEnum();

        // Get an object of Circle and call its draw method
        Shape shape1 = shapeFactory.getShape(ShapeType.CIRCLE);
        shape1.draw();

        // Get an object of Rectangle and call its draw method
        Shape shape2 = shapeFactory.getShape(ShapeType.RECTANGLE);
        shape2.draw();

        // Get an object of Square and call its draw method
        Shape shape3 = shapeFactory.getShape(ShapeType.SQUARE);
        shape3.draw();
    }
}

