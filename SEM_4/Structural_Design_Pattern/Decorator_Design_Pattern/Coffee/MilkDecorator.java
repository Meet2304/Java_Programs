package SEM_4.Structural_Design_Pattern.Decorator_Design_Pattern.Coffee;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() + " with Milk";
    }
    
    @Override
    public double cost()
    {
        return super.cost() + 5.5;
    }
}
