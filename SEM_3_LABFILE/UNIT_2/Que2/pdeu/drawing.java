package Que2.pdeu;

abstract class Shape {
    protected String Color;
    protected String Pattern;
    static int count = 0;

    //Initializer block to cuont shapes 
    {
        count++;
    }

    public Shape(String c, String p){
        this.Color = c;
        this.Pattern = p;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public static int countShapes(){
        return count;
    }    
}

class Square extends Shape implements Resizable{
    private double sideLength;

    public Square(String c, String p, double side){
        super(c, p);
        this.sideLength = side;
    }

    //Method Override
    public double calculateArea(){
        return sideLength*sideLength;
    }
    //Method Override
    public double calculatePerimeter(){
        return sideLength*4;
    }
    //Method Override
    public void resize(int factor){
        sideLength *= factor;
    }
}

class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle (String c, String p, double w, double h){
        super(c, p);
        this.width = w;
        this.height = h;
    }
    //Method Override
    public double calculateArea(){
        return width*height;
    }
    //Method Override
    public double calculatePerimeter(){
        return (height + width)*2;
    }
}

class Circle extends Shape implements Resizable{
    private double radius;

    public Circle(String c, String p, double r){
        super(c, p);
        this.radius = r;
    }

    //Method Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
    //Method Override
    public double calculatePerimeter(){
        return Math.PI*radius*2;
    }
    //Method Override
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