package SEM_4.Prototype_Method.Vehicle.DeepClone;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private List<String> vehiclelist;

    public Vehicle()
    {
        this.vehiclelist = new ArrayList<String>();
    }

    public Vehicle(List<String> List)
    {
        this.vehiclelist = List;
    }

    public void InsertData()
    {
        vehiclelist.add("Honda Amaze");
        vehiclelist.add("Audi A4");
        vehiclelist.add("Hyundai Creta");
        vehiclelist.add("Maruti Baleno");
        vehiclelist.add("Renault Duster");
    }

    public List<String> getvehicleList()
    {
        return this.vehiclelist;
    }    

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        List<String> tempList = new ArrayList<String>();
        
        for(String s:this.vehiclelist)
        {
            tempList.add(s);
        }
        return new Vehicle(tempList);
    }
}
