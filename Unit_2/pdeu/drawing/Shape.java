package pdeu.drawing;
public abstract class Shape {
    public String color;
    public String pattern;
    
    public Shape(String s, String p){
        this.color = s;
        this.pattern = p;
    }
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public static int countShapes(){
        return 0;
    }

    public String toString(){
        return "color: " + color + "Pattern: " + pattern;
    }
}

interface Resizable {
    void resize(int factor);
}



