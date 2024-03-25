package SEM_3_LABFILE.UNIT_3.Que1_Lowercase;
import java.io.*;

class Lowercase {
    public static void main(String[] args) throws Exception {
        BufferedReader rb = null;
        BufferedWriter rw = null;
        try{
            rb = new BufferedReader(new FileReader("TextData.txt"));
            rw = new BufferedWriter(new FileWriter("lowercaseText.txt"));
            String name = rb.readLine();
            while (name!= null){
                rw.write(name.toLowerCase());
                rw.write("\n");
                System.out.println(name.toLowerCase());
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
