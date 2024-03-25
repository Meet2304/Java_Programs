package SEM_4.Structural_Design_Pattern.Adapter_Design_Pattern.Rockets;


public class Falcon implements RaptorEngine {

    @Override
    public void runMethane(String fileName) {
        System.out.println("Falcon 9 Running | Fuel: Methane");
    }

    @Override
    public void runHydrogen(String fileName) {
        System.out.println("Falcon 9 Running | Fuel: Hydrogen");
    }

    

    
}
