import java.util.*;
class A{
    public A(){
    }
    // If method is marked with final, it cannot be overriden by derived class
    public void printing(){
        System.out.println("A is printing!");
    }
}
class B extends A{
    public B(){}
    public void printing(){
        System.out.println("B is printing!");
    }   
}
class C extends B{
    public C(){
        System.out.println("Default constructor C");
    }
    public void printing(){
        System.out.println("C is printing!");
    }   
}
public class Inheritance {
    public static void main(String[] args){
        A c1 = new C();
        A b1 = new B();
        c1.printing();
    }
}
