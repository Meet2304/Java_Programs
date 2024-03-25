package Practicals_Practice;
import java.io.*;
public class f_EncryptDecrypt {
    BufferedReader rb = null;
    BufferedWriter rw = null;
    public void Encrypt(InputStream in, int key)throws Exception{
        try{
            rb = new BufferedReader(new InputStreamReader(in));
            rw = new BufferedWriter(new FileWriter("Encrypted.txt"));
            int data = rb.read();
            while(data!=-1)
            {
                data+=key;
                rw.write(data);
                rw.write("\n");
                data = rb.read();
            }
        }catch(Exception e){
            System.out.println(e);
        }finally{
            rb.close();
            rw.close();
        }
    }
    
    public void Decrypt(InputStream in, OutputStream os, int key)throws Exception{
        try{
            rb = new BufferedReader(new InputStreamReader(in));
            rw = new BufferedWriter(new OutputStreamWriter(os));
            int data = rb.read();
            while(data!=-1)
            {
                data-=key;
                rw.write(data);
                rw.write("\n");
                data = rb.read();
            }
        }catch(Exception e){
            System.out.println(e);
        }finally{
            rb.close();
            rw.close();
        }
    }
    public static void main(String[] args) throws Exception{
        if(args.length!=2){
            System.out.println("Please Enter the filename and key!");
        }
        String filename = args[0];
        int key = Integer.parseInt(args[1]);

        f_EncryptDecrypt encryptor = new f_EncryptDecrypt();
        
        try{
            encryptor.Encrypt(new FileInputStream(filename), key);
            System.out.println("File has been encrypted!");
            encryptor.Decrypt(new FileInputStream(filename), new FileOutputStream("Decrypted.txt"), key);
            System.out.println("File has been Decrypted!");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
