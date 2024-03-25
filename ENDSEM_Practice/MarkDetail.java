package ENDSEM_Practice;
import java.io.*;
import java.util.ArrayList;

public class MarkDetail {
    public static void main(String[] args) throws Exception{

        Student S1 = new Student("ABC", 100, 90 , 20);
        Student S2 = new Student("ABC", 60, 98 , 70);
        Student S3 = new Student("ABC", 80, 86 , 50);
        Student S4 = new Student("ABC", 80, 45 , 25);
        Student S5 = new Student("ABC", 40, 50 , 24); 
        BufferedWriter rw = null;
        try{
            rw = new BufferedWriter(new FileWriter("MarksDetails.txt"));
            rw.write("Name: " + S1.Name + "\t" + "Physics: " + S1.Physics + "\t" + "Chemistry: "  + S1.Chemistry + "\t"  + "Maths: " + S1.Maths + "\n");
            rw.write("Name: " + S2.Name + "\t" + "Physics: " + S2.Physics + "\t" + "Chemistry: " + S2.Chemistry + "\t" + "Maths: " + S2.Maths + "\n");
            rw.write("Name: " + S3.Name + "\t"  + "Physics: " + S3.Physics+ "\t" + "Chemistry: " + S3.Chemistry + "\t" + "Maths: " + S3.Maths + "\n");
            rw.write("Name: " + S4.Name + "\t" + "Physics: " + S4.Physics + "\t" + "Chemistry: " + S4.Chemistry + "\t" + "Maths: " + S4.Maths + "\n");
            rw.write("Name: " + S5.Name + "\t"  + "Physics: " + S5.Physics + "\t" + "Chemistry: " + S5.Chemistry + "\t" + "Maths: " + S5.Maths + "\n");
        }catch(Exception e){
            System.out.println(e);
        }finally{
            rw.close();   
        }

        BufferedReader rb = null;
        BufferedWriter rwf = null;
        try{
            rb = new BufferedReader(new FileReader("MarksDetails.txt"));
            rwf = new BufferedWriter(new FileWriter("Marks70.txt"));
            String line = rb.readLine();
            while(line != null){
                String[] StrArr = line.split("\\s+");
                // for (int i=0 ; i<StrArr.length ; i++){
                //     System.out.println(StrArr[i]);
                // }
                if(Integer.parseInt(StrArr[3])>70){
                    rwf.write(line + "\n");
                }
                line = rb.readLine();
            }    
        }catch(Exception e){
            System.out.println(e);
        }finally{
            rb.close();
            rwf.close();
        }
    }
}

class Student{
    String Name;
    int Physics;
    int Chemistry;
    int Maths;

    public Student(String n, int p, int c, int m){
        this.Name = n;
        this.Physics = p;
        this.Chemistry = c;
        this.Maths = m;
    }
}
