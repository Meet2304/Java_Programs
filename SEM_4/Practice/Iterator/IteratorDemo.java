package SEM_4.Practice.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        NameRepository repo = new NameRepository();

        for(Iterator iter = repo.getIterator() ; iter.hasNext() ; )
        {
            System.out.println("Name: " + (String)iter.Next());
        }
    }
}
