package SEM_4.Structural_Design_Pattern.Decorator_Design_Pattern.Coffee;

abstract class CoffeeDecorator implements Coffee{

    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee)
    {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost();
    }
    
}
