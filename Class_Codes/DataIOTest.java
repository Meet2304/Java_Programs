/* DataOutputStream for writing primitive types to the file.
 * WAP to store primitive types to file "DataIO.txt"
 */

import java.io.*;
public class DataIOTest {
    public static void main(String[] args) {
        DataOutputStream dos = null;
        int id = 25;
        String name = "Emp1";
        try{
            //FileOutputStream fs = new FileOutputStream("DataIO.txt");
            // dos = new DataOutputStream(fs);
            dos = new DataOutputStream(new FileOutputStream("DataIO.txt"));
            dos.writeInt(id);
            dos.writeUTF(name);
            dos.writeInt(++id);
            dos.writeUTF("Emp2");
            dos.writeInt(++id);
            dos.writeUTF("Emp3");
        }catch(IOException e){
            System.out.println("File Handling Error!!");
        }finally{
            //dos.close();
        }
    }
}
