package Practicals_Practice.c_pdeu;
import java.util.*;

abstract class Shape {
    protected String color;
    protected String pattern;
    static int count = 0;    
{
    count++;
}
public Shape(String c, String p)
{
    color = c;
    pattern = p;
}
abstract double calculateArea();
abstract double calculatePerimeter();
public static int countShapes(){
    return count;
}

}
class Square extends Shape implements Resizable{
    private double side;
    public Square(String c, String p, double s)
    {
        super(c, p);
        side = s;
    }
    double calculateArea()
    {
        double Area = side * side;
        return Area;
    }
    double calculatePerimeter()
    {
        double Per = side * 4;
        return Per;
    }
    public void resize(int factor){
        side *= factor; 
    }
}

class Rectangle extends Shape{
    private double len;
    private double bre;
    public Rectangle(String c, String p, double l, double b)
    {
        super(c, p);
        len = l;
        bre = b;
    }
    double calculateArea()
    {
        double Area = len * bre;
        return Area;
    }
    double calculatePerimeter()
    {
        double Per = (len + bre) * 2;
        return Per;
    }
}

class Circle extends Shape{
    private double radius;
    public Circle (String c, String p, double rad)
    {
        super(c, p);
        radius = rad;
    }
    double calculateArea()
    {
        double Area = radius * radius * Math.PI;
        return Area;
    }
    double calculatePerimeter()
    {
        double Per = 2 * Math.PI * radius;
        return Per;
    }
    public void resize(int factor){
        radius *= factor; 
    }
}

class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle (String c, String p, double s1, double s2, double s3){
        super(c, p);
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }
    //Method Override
    public double calculateArea(){
        double s = (side1+side2+side3)/2;
        return Math.sqrt((s*(s-side1)*(s-side2)*(s-side3)));
    }
    //Method Override
    public double calculatePerimeter(){
        return (side1 + side2 + side3);
    }
}

interface Resizable{
    void resize(int factor);
}

public class c_Drawing {
    
}
