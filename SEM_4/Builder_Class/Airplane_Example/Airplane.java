package SEM_4.Builder_Class.Airplane_Example;

public class Airplane {
    private String Type;
    private float wingspan;
    private String powerplant;
    private int crewseats;
    private int passengerseats;
    private String Avionics;
    private String customer;

    Airplane(String customer, String type)
    {
        this.customer = customer;
        this.Type = type;
    }

    public void setWingspan(float wingspan)
    {
        this.wingspan = wingspan;
    }
    public void setPowerplant(String powerplant)
    {
        this.powerplant = powerplant;
    }
    public void setAvionics(String avionics)
    {
        this.Avionics = avionics;
    }
    public void setNumberSeats(int crewSeats, int passengerseats)
    {
        this.crewseats = crewSeats;
        this.passengerseats = passengerseats;
    }

    public String getCustomer()
    {
        return customer;
    }
    public String getType()
    {
        return Type;
    } 


}
