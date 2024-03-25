package SEM_4.Structural_Design_Pattern.Decorator_Design_Pattern.Coffee;

public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription()
    {
        return "Simple Coffee";
    }

    @Override
    public double cost()
    {
        return 30.0;
    }
}
