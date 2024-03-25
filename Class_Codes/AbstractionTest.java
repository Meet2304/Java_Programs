// package Class Codes;
// class Shape{
//     abstract public void draw();
//     abstract public long calculateArea();
// }
// public class AbstractionTest {
//     Shape s = new Shape();//Error - Instance cannot be created for abstract class.
// }
package Class Codes;
abstract class Shape{
    abstract void draw();
    abstract long calculateArea();
}
class Square extends Shape{
    abstract void draw(){System.out.println("Square Drawing");}
    abstract long calculateArea(){return 0;};
}
class AbstractionTest {
    public static void main(String[] args) {
        Shape s = new Shape();//Error - Instance cannot be created for abstract class.   
    }
}