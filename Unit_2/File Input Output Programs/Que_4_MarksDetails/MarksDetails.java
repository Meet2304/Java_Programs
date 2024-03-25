import java.io.*;
public class MarksDetails {
    public static void main(String[] args) throws Exception {
        //BufferedReader rb = null;
        BufferedWriter rw = null;
        int[] Marks = new int[] {90, 89, 88, 87, 86, 85, 84, 83, 82, 81};
        String[] Name = new String[]{"AB", "CD", "EF", "GH", "IJ", "KL", "MN", "OP", "QR", "ST"};
        try{
            //rb = new BufferedReader(new FileReader("markdetails.txt"));
            rw = new BufferedWriter(new FileWriter("markdetails.txt"));
            for (int i=0; i< Marks.length ; i++ ){
                rw.write("Name: " + Name[i] + "  Marks: " + Marks[i]);
                rw.write("\n");
            }
        }catch(Exception e){
            System.out.println(e);
        }finally{
            rw.close();
        }   
    } 
}
