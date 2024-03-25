package Practicals_Practice;
import java.io.*;

public class Lowercase {
public static void main(String[] args) throws Exception{
    BufferedReader rb = null;
    BufferedWriter rw = null;
    try{
        rb = new BufferedReader(new FileReader("TextData.txt"));
        rw = new BufferedWriter(new FileWriter("LowercaseTest.txt"));
        String ch = rb.readLine();
        while(ch!=null)
        {
            rw.write(ch.toLowerCase());
            rw.write("\n");
            ch = rb.readLine();
        }
    }catch(Exception e)
    {
        System.err.println(e);
    }finally{
        rb.close();
        rw.close();
    }
    
}    
}
