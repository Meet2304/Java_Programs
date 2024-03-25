import java.util.*;
// SUPER CLASS

class SuperClass{
    int number1;
    public SuperClass(){
        number1 = 10;
        System.out.println("SuperClass default Constructor");
        public SuperClass(int n1){
            
        }
    }
}
//SUBCLASS - DERIVED CLASS - CHILD CLASS
class SubClass extends SuperClass{
    // Subclass can have their own instance fields 
    int number2;
    //Subclass default constructor
    public SubClass(){
        number1 = 30;
        number2 = 30;
        System.out.println("SubClass Default Constructor");
    }
    public SubClass(int n1, int n2){
        number1 = n1;
        number2 = n2;
        System.out.println("Sub Class int, int Constructor");
    }
}
class InheritanceTest {
    public static void main(String[] args){
        //SuperClass sc = new SuperClass();
        //SubClass sb = new SubClass();
        SubClass sb1 = new SubClass(5, 10);
    }    
}
