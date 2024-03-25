package Practicals_Practice.c_pdeu;
import Practicals_Practice.c_pdeu.c_Drawing;

public class c_DrawingTest {
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
            System.out.println("Color: " + maxAreaShape.color);
            System.out.println("Pattern: " + maxAreaShape.pattern);
            System.out.println("Area: " + maxArea);
        }
    }
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Square("Red", "Striped", 5.0);
        shapes[1] = new Circle("Blue", "Dotted", 3.0);
        shapes[2] = new Rectangle("Green", "Solid", 4.0, 6.0);
        shapes[3] = new Triangle("Yellow", "Zigzag", 3.0, 4.0, 5.0);

        highestArea(shapes);
    }

}
