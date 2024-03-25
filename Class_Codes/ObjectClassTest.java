class Employee{}
class SalesPerson extends Employee{}
public class ObjectClassTest {
    public static void main(String[] args) {
        //Class in a Class i.e reppresentation of a class 
        /*
        Class c1 = SalesPerson.class;
        System.out.println(c1.getName());
        Class sc = c1.getSuperclass(); //gets the superclass of the c1 object of classs datatype which is a class of SalesPerson
        System.out.println(sc.getName());
         */
        Class c1 = Employee.class;
        System.out.println(c1.getName());
        Class sc = c1.getSuperclass(); //returns java.lang.object which is the superclass of all objects
        System.out.println(sc.getName());

        
    }

}
