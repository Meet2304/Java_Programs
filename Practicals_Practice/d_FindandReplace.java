package Practicals_Practice;
import java.io.*;

public class d_FindandReplace {
    
    public static void main(String[] args)throws Exception{
        BufferedReader br = null;
        BufferedWriter bw = null;
        try{
            br = new BufferedReader(new FileReader("Data1.txt"));
            bw = new BufferedWriter(new FileWriter("Data2.txt"));
            String ch = br.readLine();
            while(ch!=null)
            {
                ch = ch.replace("Data", "DATA");
                bw.write(ch);
                bw.write("\n");
                ch = br.readLine();
            }
        }catch(Exception e){
            System.out.println(e);
        }finally{
            br.close();
            bw.close();
        }    
    }
}
