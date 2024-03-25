package SEM_4.Structural_Design_Pattern.Decorator_Design_Pattern.Restaurant;

public class SadaDosa implements Dosa{

    @Override
    public String getDescription() {
        return "Sada Dosa";
    }

    @Override
    public double cost() {
        return 100.0;
    }
    
}
