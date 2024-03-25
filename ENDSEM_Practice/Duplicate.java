package ENDSEM_Practice;
import java.io.*;
import java.util.ArrayList;

public class Duplicate {
    public static void main(String[] args) throws Exception {
        BufferedReader rb = null;
        BufferedWriter rw = null;
        try{
            rb = new BufferedReader(new FileReader("Data_Duplicate Entries.txt"));
            rw = new BufferedWriter(new FileWriter("NonDuplicate Entries.txt"));
            String line = rb.readLine();
            ArrayList<String> Arr = new ArrayList<>();
            while(line != null){
                if(!Arr.contains(line)){
                    Arr.add(line);
                    rw.write(line + "\n");
                } 
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
