/* DataOutputStream for writing primitive types to the file.
 * WAP to store primitive types to file "DataIO.txt"
 */

import java.io.*;
public class DataIOTest1{
    public static void main(String[] args) {
        DataInputStream din = null;
        //int id = 25;
        //String name = "Emp1";
        try{
            //FileInputStream fs = new FileOutputStream("DataIO.txt");
            // din = new DataInputStream(fs);
            din = new DataInputStream(new FileInputStream("DataIO.txt"));
            System.out.println("ID: " + din.readInt());
            System.out.println("Name: " + din.readUTF());
            System.out.println("Reading Complete!");
            
        }catch(IOException e){
            System.out.println("File Handling Error!!");
        }finally{
            //dos.close();
        }
    }
}

