package SEM_4.Singleton_Design_Pattern.Eager_Initialization_1;

public class Singleton {
    private static Singleton soleInstance = new Singleton();
    public int i;

    // Private Constructor
    private Singleton()
    {   
        System.out.println("Singleton Created..");
    }

    // Global Access Point
    public static Singleton getInstance()
    {
        return soleInstance;
    }

    // Getter Methods
    public int getI()
    {
        return i;
    }

    public static void setSoleInstance(Singleton soleInst)
    {
        Singleton.soleInstance = soleInst;
    }

    // Setter Methods
    public void setI(int i)
    {
        this.i = i;
    }
}

class TestClass
{
    public static void main(String[] args) {
        Singleton S1 = Singleton.getInstance();
        Singleton S2 = Singleton.getInstance();

        S1.setI(5);
        S2.setI(10);
        System.out.println(S1.getI());
        
        S2.i = S1.i + S2.i;
        System.out.println(S2.getI());
        print("S1 ", S1);
        print("S2 ", S2);
    }

    static void print (String name, Singleton obj)
    {
        System.out.println(String.format("Object: %s, Hashcode: %d, Value: %d", name, obj.hashCode(), obj.getI()    ));
    }
}
