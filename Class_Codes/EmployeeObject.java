
/* WAP to store Employee Object(ID, name) to file Employee.txt */
import java.io.*;
// Serializable is a markup(empty) Interface
class Employee implements Serializable{
    int id;
    String name;

    public Employee(int p, String n){
        id = p;
        name = n;
    }
    public String toString(){
        return "ID: " + id + "Name: " + name;
    }
}
class EmployeeObjectTest {
    public static void main(String[] args) {
        ObjectOutputStream os = null;
        Employee E1 = new Employee(01, "EMP");
        try{
            os = new ObjectOutputStream(new FileOutputStream("Employee.txt"));
            os.writeObject(E1);
        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace(null);
        }finally{
            try{
                os.close();
            }catch(Exception e){}
        }
    }
}
