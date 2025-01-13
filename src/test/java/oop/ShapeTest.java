package oop;

import org.example.oop.Circle;
import org.example.oop.Shape;
import org.example.oop.Square;
import org.example.oop.Triangle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {
    @Test
    @DisplayName("Test de polimorfismo")
    public void testPolimorfismo() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Square(4));
        shapes.add(new Triangle(3, 4, 5, 3, 4));

        double totalArea = 0;

        for (Shape shape : shapes) {
            totalArea += shape.area();
        }

        double expectedArea = (Math.PI * 5 * 5) + (4 * 4) + (0.5 * 3 * 4);
        double delta = 0.001;

        assertEquals(expectedArea, totalArea, delta, "La suma total de áreas debe coincidir con el valor esperado calculado.");
    }
}
