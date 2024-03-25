package SEM_4.Builder_Class.Rocket_Example;

public class Rocket {
    private String Name;
    private String Engine;
    private String Company;
    private boolean IsReusable;

    public void setName(String n)
    {
        this.Name = n;
    }
    public void setEngine(String e)
    {
        this.Engine = e;
    }
    public void setCompany(String c)
    {
        this.Company = c;
    }
    public void setReusability(boolean b)
    {
        this.IsReusable = b;
    }
    public void RocketDetails()
    {
        System.out.println("ROCKET \nNAME: " + Name + "\nENGINE: " + Engine + "\nCompany: " + Company + "\nISREUSABLE: " + IsReusable);
    }

}
