package ENDSEM_Practice;
import java.io.*;

public class Lowercase {
    public static void main(String[] args) throws Exception{ 
    BufferedReader rb = null;
    BufferedWriter rw = null;
        try{
            rb = new BufferedReader( new FileReader("Data_Lowercase.txt"));
            rw = new BufferedWriter( new FileWriter("Data_Uppercase.txt"));
            String line = rb.readLine();
            while(line != null){
                line = line.toUpperCase();
                rw.write(line + "\n");
                line = rb.readLine();
            }
        }catch(Exception e){
            System.out.println(e);
        }finally{
            rb.close();
            rw.close();
        }
    }
}
