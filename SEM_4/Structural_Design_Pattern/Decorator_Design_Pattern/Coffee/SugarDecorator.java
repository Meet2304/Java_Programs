package SEM_4.Structural_Design_Pattern.Decorator_Design_Pattern.Coffee;

public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() + " with Sugar";
    }
    
    @Override
    public double cost()
    {
        return super.cost() + 3.5;
    }
    
}
