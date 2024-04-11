package SEM_4.Behavioural_Design_Pattern.Iterator_Design_Pattern;

public class IteratorDemo {
    public static void main(String[] args) {
        NameRepository repository = new NameRepository();

        for(Iterator iter = repository.getIterator(); iter.hasNext();)
        {
            String name = (String)iter.next();
            System.out.println("Name of Rocket: " + name);
        }
    }
}
