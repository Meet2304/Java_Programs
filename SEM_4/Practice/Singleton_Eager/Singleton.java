package SEM_4.Practice.Singleton_Eager;

public class Singleton {
    private static Singleton soleInstance = new Singleton();
    public int i;

    private Singleton()
    {
        System.out.println("Singleton Created...");
    }

    public static Singleton getInstance()
    {
        return soleInstance;
    }

    public int getI()
    {
        return i;
    }

    public static void setSoleInstance(Singleton soleInst)
    {
        Singleton.soleInstance = soleInst;
    }

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
    }
}
