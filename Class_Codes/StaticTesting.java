class A{
    static int number1 = 10;
    public static void printing(){
        System.out.println("A: " + number1);
    }
}
class B extends A{
    static int number1 = 20;
    public static void  printing(){
        System.out.println("B: " + number1);
    }   
}
class C extends B{
    static int number1 = 30;
    public static void printing(){
        System.out.println("C: " + number1);
    }   
}
public class StaticTesting {
    public static void main(String[] args){
        A a1 = new B();
        B b1 = new C();
        //When you access a static field using a reference variable, it is resolved at compile-time
        a1.printing();
        b1.printing();
    }     
}
