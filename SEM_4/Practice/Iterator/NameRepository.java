package SEM_4.Practice.Iterator;

public class NameRepository implements Container {
    public String Names[] = {"asv", "asads", "advsv","sdvsd"};

    @Override
    public Iterator getIterator() {
        return new NameIterator(Names);
    }


}
