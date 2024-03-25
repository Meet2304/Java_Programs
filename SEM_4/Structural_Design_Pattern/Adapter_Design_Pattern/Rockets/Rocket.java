package SEM_4.Structural_Design_Pattern.Adapter_Design_Pattern.Rockets;

public class Rocket implements MerlinEngine {

    EngineAdapter engineAdapter;

    @Override
    public void run(String FuelType, String fileName) {
        if(FuelType.equalsIgnoreCase("Kerosene"))
        {
            System.out.println("Rocket Running | Fuel: Kerosene  | Name: " + fileName);
        }
        else if(FuelType.equalsIgnoreCase("Methane") || FuelType.equalsIgnoreCase("Hydrogen"))
        {
            engineAdapter = new EngineAdapter(FuelType);
            engineAdapter.run(FuelType,fileName);
        }
        else
        {
            System.out.println("Invalid Fuel " + FuelType + " Format Not Supported");
        }
    }
    
}