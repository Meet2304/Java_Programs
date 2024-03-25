/*
 * Read a text file "Data1.txt" and convert data to upeercase and store it to file "Data2.txt"
 */

 //Character Oriented Stream - Buffered Stream is more efficient compared to other Reader Stream.
 //Buffered Stream allows to read line by line textual data. 
import java.io.*;
class ReaderIO {
    public static void main(String[] args) throws Exception {
        BufferedReader rb = null;
        BufferedWriter rw = null;
        try{
            rb = new BufferedReader(new FileReader("Data1.txt"));
            rw = new BufferedWriter(new FileWriter("Data2.txt"));
            String name = rb.readLine();
            while(name != null){
                rw.write(name.toUpperCase());
                rw.write("\n");
                System.out.println(name.toUpperCase());
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
