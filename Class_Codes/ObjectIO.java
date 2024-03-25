package Class Codes;
/* Read Student Object details into file 'StudentData.txt' */
import java.io.*;
class Student{
    String name;
    int percentage;
    public Student(int p, String n){
        name = n;
        percentage = p;
    }
    public String toString(){
        return "Name: " + name + "Percentage: " + percentage;
    }
}
public class ObjectIOTest{
    public static void main(String[] args) {
        ObjectOutputStream os = null;
        Student s1 = new Student("Student1", 90);
        try{
            os = new ObjectOutputStream(new FileOutputStream("StudentData1.txt"));
            os.writeObject(s1);
        }catch(Exception e){
        }finally{
            try{
                os.close();
            }catch(Exception e){}
        }
    }
}
