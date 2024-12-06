package org.howard.edu.lsp.finalexam.question3;

/**
 * Factory class to create shape objects.
 */
public class ShapeFactory {
    private static ShapeFactory instance;

    // Private constructor for Singleton
    private ShapeFactory() {}

    // Public method to get the single instance of ShapeFactory
    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    // Factory method to create shapes
    public Shape createShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("triangle")) {
            return new Triangle();
        } else {
            throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        }
    }
}
