package SEM_4.Builder_Class.Airplane_Example;

public abstract class AbstractBuilder {
    protected Airplane airplane;
    protected String Customer;
    protected String Type;

    public Airplane getAirplane()
    {
        return airplane;
    }

    public void createNewAirplane()
    {
        airplane = new Airplane(Customer, Type);
    }

    public abstract void buildWings();
    public abstract void buildPowerplant();
    public abstract void buildAvionics();
    public abstract void buildSeats();
}
