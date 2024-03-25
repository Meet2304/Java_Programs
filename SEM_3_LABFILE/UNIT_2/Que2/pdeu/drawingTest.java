package Que2.pdeu;
import Que2.pdeu.drawing.*;

public class drawingTest {
    public static void highestArea(Shape[] shapes) {
        Shape maxAreaShape = null;
        double maxArea = 0.0;

        for (Shape shape : shapes) {
            double area = shape.calculateArea();
            if (area > maxArea) {
                maxArea = area;
                maxAreaShape = shape;
            }
        }

        if (maxAreaShape != null) {
            System.out.println("Shape with the highest area:");
            System.out.println("Color: " + maxAreaShape.Color);
            System.out.println("Pattern: " + maxAreaShape.Pattern);
            System.out.println("Area: " + maxArea);
        }
    }

    public static void resizableShapes(Shape[] shapes) {
        System.out.println("Resizable Shapes:");
        for (Shape shape : shapes) {
            if (shape instanceof Resizable) {
                System.out.println("Color: " + shape.Color);
                System.out.println("Pattern: " + shape.Pattern);
            }
        }
    }

    public static double totalDecorativeMaterialForCircle(Shape[] shapes) {
        double totalDecorativeMaterial = 0.0;
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                totalDecorativeMaterial += shape.calculatePerimeter();
            }
        }
        return totalDecorativeMaterial;
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Square("Red", "Striped", 5.0);
        shapes[1] = new Circle("Blue", "Dotted", 3.0);
        shapes[2] = new Rectangle("Green", "Solid", 4.0, 6.0);
        shapes[3] = new Triangle("Yellow", "Zigzag", 3.0, 4.0, 5.0);

        highestArea(shapes);
        System.out.println("Total Decorative Material for Circles: " + totalDecorativeMaterialForCircle(shapes));
    }
}
