package pdeu.drawingTest;

import pdeu.drawing.*;
public class TestShape {
    public static long highestArea(Shape[] sp){
        long[] values = new long[sp.length];
        for(int i = 0; i<sp.length;i++)
        {
            values[i] = (long)(sp[i].calculateArea());
        }
    public static void resizableShapes(Shape[] sp){
        for(int i=0;i<sp.length;i++){
            if(sp[i] instanceof Resizable){
                System.out.println(sp[i]);
            }
        }
    }
    public static long totalDecorativeMaterialforCircle(Shape[] sp)
    }
    public static void main(String[] args) {
        Shape s = new Shape();
        Square s1 = new Square(null, null, 0);
        Shape[] sp = {new Square(null, null, 0), new Triangle(), new Rectangle(null, null, 0, 0) new Circle(null, null, 0), new Square(null, null, 0)}   
        highestArea(sp)    
    }
}
