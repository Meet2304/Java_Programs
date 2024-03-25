import java.io.*;
import java.util.ArrayList;
public class RemoveDuplicate {
    public static void main(String[] args) throws Exception {
        BufferedReader rb = null;
        BufferedWriter rw = null;
        try{
            rb = new BufferedReader(new FileReader("Data1.txt"));
            rw = new BufferedWriter(new FileWriter("DuplicateData.txt"));
            String name= rb.readLine();
            // Declaring an ArrayList to store every line in an Array
            ArrayList<String> Arr = new ArrayList<>();
            while (name!= null){  
                // Checking if the line is already present in the ArrayList
                if(!Arr.contains(name)){
                    //Adding line to ArrayList if it is not already present
                    Arr.add(name);
                    }
                name = rb.readLine();
            }
            // For loop to print the elements of the arraylist
            for (int i=0; i<Arr.size(); i++){
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
