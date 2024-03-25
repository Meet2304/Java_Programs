package SEM_4.Builder_Class.Airplane_Example;

public class Glider extends AirplaneBuilder {
    Glider(String customer)
    {
        super.customer = customer;
        super.Type = "Glider v9.0";
    }

    public void buildWings()
    {
        airplane.setWingspan(57.1f);
    }
    public void buildPowerplant()
    {

    }
    public void buildAvionics()
    {

    }
    public void buildSeats()
    {
        
    }
}
