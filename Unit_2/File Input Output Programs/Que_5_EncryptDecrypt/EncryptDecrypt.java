import java.io.*;

public class EncryptDecrypt {
    BufferedReader rb = null;
    BufferedWriter rw = null;
    public void encrypt(InputStream in, int key) throws Exception{
        try{
            rb = new BufferedReader(new InputStreamReader(in));
            rw = new BufferedWriter((new FileWriter("Encrypted.txt")));
            int ch;
            while((ch = rb.read())!=-1){
                ch+=key;
                rw.write((char)ch);
            }
        }catch(Exception e){
            System.out.println(e);
        } 
        finally{
            rb.close();
            rw.close();
        }
    }

    public void decrypt(InputStream in, OutputStream os,  int key) throws Exception{
        try{
            rb = new BufferedReader(new InputStreamReader(in));
            rw = new BufferedWriter(new OutputStreamWriter(os));
            int ch;
            while((ch = rb.read())!=-1){
                ch-=key;
                rw.write((char)ch);
            }
        }catch(Exception e){
            System.out.println(e);
        } 
        finally{
            rb.close();
            rw.close();
        }
    }
    public static void main(String[] args) throws Exception{
        if(args.length != 2){
            System.out.println("Please enter filename and key");
            System.exit(1);
        }
        String fileName = args[0];
        int key = Integer.parseInt(args[1]);

        EncryptDecrypt encryptor = new EncryptDecrypt();

        try{
            encryptor.encrypt(new FileInputStream(fileName), key);
            System.out.println("File has been Encrypted");

            encryptor.decrypt(new FileInputStream("Encrypted.txt"),new FileOutputStream("Decrypted.txt"), key);
            System.out.println("File has been Decrypted");
        }catch(Exception e){
            System.out.println(e);
        }

        }       
    }

