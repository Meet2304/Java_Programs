package SEM_4.Structural_Design_Pattern.Adapter_Design_Pattern.Rockets;

public class Starship implements RaptorEngine{

    @Override
    public void runMethane(String fileName) {
        System.out.println("Starship Running | Fuel: Methane");
    }

    @Override
    public void runHydrogen(String fileName) {
        System.out.println("Starship Running | Fuel: Hydrogen");
    }
    
}
