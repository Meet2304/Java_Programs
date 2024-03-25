import java.io.*;

public class BookObject {
    public static void main(String[] args) throws Exception {
        BufferedWriter rw = null;
        BufferedReader rb = null;
        String[] BookTitle = new String[]{"AB", "CD", "EF", "GH", "IJ", "KL", "MN", "OP", "QR", "ST"};
        int[] BookPrice = new int[] {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        int[] BookID = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try{
            rw = new BufferedWriter(new FileWriter("BookDetail.dat"));
            for (int i=0; i< BookTitle.length ; i++ ){
                rw.write("Book Title: " + BookTitle[i] + "  Book Price: " + BookPrice[i] + "  Book ID: " + BookID[i]);
                rw.write("\n");
            }
        }catch(Exception e){
            System.out.println(e);
        }finally{
            rw.close();
        }
        try{
            rb = new BufferedReader(new FileReader("BookDetail.dat"));
            int HighestPrice = 0;
            int LargestIndex = 0;
            for (int i = 0; i<BookTitle.length; i++){
                if(BookTitle[i].equals("EF")){
                    System.out.println("Search Results for Book Title 'EF' in the Array:");
                    System.out.println("Book Title: " + BookTitle[i] + "  Book Price: " + BookPrice[i] + "  Book ID: " + BookID[i]);
                }
                if(BookPrice[i] > HighestPrice){
                    HighestPrice = BookPrice[i];
                    LargestIndex = i;
                }
            }
            System.out.println("The Book having the Highest Price is:");
            System.out.println("Book Title: " + BookTitle[LargestIndex] + "  Book Price: " + BookPrice[LargestIndex] + "  Book ID: " + BookID[LargestIndex]);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            rb.close();
            rw.close();
        }
    }
}
