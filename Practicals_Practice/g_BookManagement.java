package Practicals_Practice;
import java.io.*;
import java.util.ArrayList;

public class g_BookManagement{
    public static void main(String[] args) throws Exception{
        ArrayList<Book> Arr = new ArrayList<>();
        Arr.add(new Book("ABC", 10, 01));
        Arr.add(new Book("ABC", 20, 02));
        Arr.add(new Book("ABC", 30, 03));
        Arr.add(new Book("ABC", 40, 04));
        Arr.add(new Book("ABC", 50, 05));
        //BufferedReader rb = null;
        BufferedWriter rw = null;
        try{
            File Books = new File("Books.txt");
            //rb = new BufferedReader(new FileReader(Books));
            rw = new BufferedWriter(new FileWriter(Books));
            for(int i=0; i<Arr.size() ; i++){
                rw.write("BOOK TITLE: " + Arr.get(i).getBookTitle() + " BOOK PRICE: " + Arr.get(i).getBookPrice() + " BOOK ID: " + Arr.get(i).getBookID());
                rw.write("\n");
            }
        }catch(Exception e){
            System.out.println(e);
        }finally{
            //rb.close();
            rw.close();
        }
    }
}

class Book{
    String BookTitle;
    int Bookprice;
    int BookID;

    public Book(String t, int p, int id){
        this.BookTitle = t;
        this.Bookprice = p;
        this.BookID = id;
    }

    public String getBookTitle(){
        return BookTitle;
    }
    public int getBookPrice(){
        return Bookprice;
    }
    public int getBookID(){
        return BookID;
    }
}

