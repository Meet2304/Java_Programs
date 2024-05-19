package SEM_4.Practice.Iterator;

public class NameIterator implements Iterator {
    int index;
    String Names[];

    public NameIterator(String Names[])
    {
        this.Names = Names;
    }

    @Override
    public boolean hasNext() {
        if(index < Names.length)
        {
            return true;
        }
        return false;
    }

    @Override
    public Object Next() {
        if (this.hasNext())
        {
            return Names[index++];
        }
        return null;
    }
    
}
