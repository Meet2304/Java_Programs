package Practicals_Practice;
import java.io.*;
import java.util.ArrayList;
public class e_Duplicate {
    public static void main(String[] args) throws Exception{
        BufferedReader rb = null;
        BufferedWriter rw = null;
        try{
            rb = new BufferedReader(new FileReader("Repeated.txt"));
            rw = new BufferedWriter(new FileWriter("Duplicate.txt"));
            String line = rb.readLine();
            ArrayList<String> Arr = new ArrayList<>();
            while (line!=null)
            {
                if (!Arr.contains(line)){
                    Arr.add(line);
                }
                line = rb.readLine();
            }
            for (int i=0;i<Arr.size();i++)
            {
                rw.write(Arr.get(i));
                rw.write("\n");
            }
        }catch(Exception e){
            System.out.println(e);
        }finally{
            rb.close();
            rw.close();
        }
    }
}
