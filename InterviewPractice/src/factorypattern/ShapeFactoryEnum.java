package factorypattern;

public class ShapeFactoryEnum {

    // Returns object based on shapetype
    public Shape getShape(ShapeType shapeType) {
       return switch(shapeType) {
       case RECTANGLE -> new Rectangle();
       case CIRCLE -> new Circle();
       case SQUARE -> new Square();
       };

    }
}

