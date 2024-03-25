
class Employee{
    int Id;
    String name;
    Employee(int id, String s){
        this.Id = id;
        name = s;
    }
    /*
    This methoad is overriden cause two same object when created in Main method give equals() as False i.e.
        Employee e1 = new Employee(101, "EMP1");
        Employee e2 = new Employee(101,"EMP1");
        System.out.println(e1.equals(e2));
        this code returns false which should be true
     */

     // Overriden equals method from java.lang.Object class
    public boolean equals(Object other){
        Employee emp = (Employee) other;
        return (this.Id == emp.Id);
        // We do not use this.Id == other.Id because other is a reference of Object and will look into Oject class for any objects by the name "other"
        // We need to compare on the Basis of Employee which is the superclass.  
    }
    
     // Overriden toString method from java.lang.Object class
    public String toString(){
        return "Id:" + Id + " and name: " + name;
    } 
}
public class ObjectClassTest1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "EMP1");
        Employee e2 = new Employee(101,"EMP1");
        System.out.println(e1);
        System.out.println("EMP1 and EMP2 are Equal:" + e1.equals(e2));
    }
}
