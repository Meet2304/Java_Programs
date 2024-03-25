package SEM_4.Structural_Design_Pattern.FlyWeight_Design_Pattern.Shape;

public class Circle implements Shape{
    private String Color;
    private int x;
    private int y;
    private int radius;

    public Circle(String Color)
    {
        this.Color = Color;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color: " + Color + ", x: " + x + ", y: " + y + "]");
    }
}
