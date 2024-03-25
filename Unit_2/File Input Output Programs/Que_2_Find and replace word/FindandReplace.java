// Program to read the data in a file andreplace the word "data" with "DATA"

import java.io.*;

public class FindandReplace {
    public static void main(String[] args) throws Exception {
        BufferedReader rb = null;
        BufferedWriter rw = null;

        try{
            rb = new BufferedReader(new FileReader("Data1.txt"));
            rw = new BufferedWriter(new FileWriter("Data2.txt"));
            String name = rb.readLine();
            while(name!=null){
                name = name.replace("Data", "DATA");
                rw.write(name);
                rw.write("\n");
                name = rb.readLine();
            }
        }catch(Exception e){
            System.out.println(e);
        }finally{
            rb.close();
            rw.close();
        }
    }   
}
