package lab5.prob3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(4.0, 5.0));
        shapes.add(new Triangle(3.0, 6.0));
        shapes.add(new Circle(3.0));

        double totalArea = 0.0;
        for (Shape shape : shapes) {
            totalArea += shape.computeArea();
        }

        System.out.printf("Sum of Areas = %.2f%n", totalArea);
    }
}
