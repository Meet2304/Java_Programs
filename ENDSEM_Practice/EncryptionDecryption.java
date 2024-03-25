package ENDSEM_Practice;
import java.io.*;

public class EncryptionDecryption {
    BufferedReader rb = null;
    BufferedWriter rw = null;
    
    public void Encrypt(InputStream in, int key) throws Exception{
        try{
            rb = new BufferedReader(new InputStreamReader(in));
            rw = new BufferedWriter(new FileWriter("Data_Encrypted.txt"));
            int ch = rb.read();
            while(ch != -1){
                ch += key;
                rw.write((char)ch);
                ch = rb.read();
            }
        }catch(Exception e){
            System.out.println(e);
        }finally{
            rb.close();
            rw.close();
        }
    }

    public void Decrypt(InputStream in, OutputStream out, int key) throws Exception{
        try{
            rb = new BufferedReader(new InputStreamReader(in));
            rw = new BufferedWriter(new OutputStreamWriter(out));
            int ch = rb.read();
            while(ch != -1){
                ch -= key;
                rw.write((char)ch);
                ch = rb.read();
            }
        }catch(Exception e){
            System.out.println(e);
        }finally{
            rb.close();
            rw.close();
        }
    }

    public static void main(String[] args) {
        String Filename = args[0];
        int key = Integer.parseInt(args[1]);
        if(args.length != 2){
            System.out.println("Please Enter the filename and key!");
        }
        
        EncryptionDecryption Object = new EncryptionDecryption();

        try{
            Object.Encrypt(new FileInputStream(Filename), key);
            System.out.println("YOUR FILE HAS BEEN ENCRYPTED!");

            Object.Decrypt(new FileInputStream("Data_Encrypted.txt"), new FileOutputStream("Data_Decrypted.txt"), key);
            System.out.println("YOUR FILE HAS BEEN DECRYPTED!");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
