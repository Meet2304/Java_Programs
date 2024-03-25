import java.util.*;
class A{
    int number1 = 10;
    // If method is marked with final, it cannot be overriden by derived class
    public void printing(){
        System.out.println("A is printing! " + number1);
    }
}
class B extends A{
    int number1 = 20;
    public void printing(){
        System.out.println("B is printing! " + number1);
    }   
}
class C extends B{
    int number1 = 30;
    public void printing(){
        System.out.println("C is printing! " + number1);
    }   
}
public class VariableBinding {
    
    public static void main(String[] args){
        A a1 = new B();
        A b1 = new C();

        //Runtime Method Binding
        a1.printing();
        b1.printing();

        //Variable Binding
        System.out.println(a1.number1 + "\t" + b1.number1);
    }
}
