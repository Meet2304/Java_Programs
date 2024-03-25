package SEM_4.Structural_Design_Pattern.Adapter_Design_Pattern.Rockets;

public class EngineAdapter implements MerlinEngine {
    RaptorEngine raptorengine;
    
    public EngineAdapter(String FuelType)
    {
        if(FuelType.equalsIgnoreCase("Methane"))
        {
            raptorengine = new Starship();
        }
        else if(FuelType.equalsIgnoreCase("Hydrogen"))
        {
            raptorengine = new Falcon();
        }
    } 

    public void run(String FuelType, String fileName)
    {
        if(FuelType.equalsIgnoreCase("Methane"))
        {
            raptorengine.runMethane(fileName);
        }
        else if(FuelType.equalsIgnoreCase("Hydrogen"))
        {
            raptorengine.runHydrogen(fileName);
        }
    }
}