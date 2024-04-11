package SEM_4.Behavioural_Design_Pattern.Iterator_Design_Pattern;

public class NameRepository implements Container {

    public String names[] = {"Starship", "Falcon 9", "Orion", "Vulcan"};

    @Override
    public Iterator getIterator() {
        return new NameIterator(names);
    }
    
}
