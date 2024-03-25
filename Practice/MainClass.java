package Java_Programs.Practice;
class A {
    int i=10;
}
class B extends A{
    super.i ;
    int i =20;
}    
public class MainClass {
    public static void main(String[] args){
        A a = new B();
        System.out.println(a.i);
    }
}
