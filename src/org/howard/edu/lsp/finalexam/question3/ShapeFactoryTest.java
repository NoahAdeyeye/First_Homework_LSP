package org.howard.edu.lsp.finalexam.question3;

import org.junit.Test;
import static org.junit.Assert.*;

public class ShapeFactoryTest {

    @Test
    public void testCreateCircle() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.createShape("circle");
        assertTrue("Shape should be a Circle", shape instanceof Circle);
    }

    @Test
    public void testCreateRectangle() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.createShape("rectangle");
        assertTrue("Shape should be a Rectangle", shape instanceof Rectangle);
    }

    @Test
    public void testCreateTriangle() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.createShape("triangle");
        assertTrue("Shape should be a Triangle", shape instanceof Triangle);
    }

    @Test
    public void testUnknownShape() {
        ShapeFactory factory = ShapeFactory.getInstance();
        try {
            factory.createShape("hexagon");
            fail("Expected IllegalArgumentException for unknown shape type");
        } catch (IllegalArgumentException e) {
            assertEquals("Unknown shape type: hexagon", e.getMessage());
        }
    }

    @Test
    public void testSingletonInstance() {
        ShapeFactory factory1 = ShapeFactory.getInstance();
        ShapeFactory factory2 = ShapeFactory.getInstance();
        assertSame("ShapeFactory should be a singleton", factory1, factory2);
    }
}
