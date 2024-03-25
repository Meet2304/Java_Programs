package SEM_4.Structural_Design_Pattern.FlyWeight_Design_Pattern.Shape;
import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap circleMap = new HashMap<>();
    
    @SuppressWarnings("unchecked")
    public static Shape getCircle(String color)
    {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null)
        {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of Color: " + color);
        }
        return circle;
    }
}
