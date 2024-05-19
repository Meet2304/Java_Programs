package SEM_4.Practice.Decorator;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public String getDescription()
    {
        return super.getDescription() + " with Milk";
    }

    public Double getCost()
    {
        return super.getCost() + 30;
    }
    
}
