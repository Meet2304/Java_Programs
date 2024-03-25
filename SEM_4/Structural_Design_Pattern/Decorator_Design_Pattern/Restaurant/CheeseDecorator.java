package SEM_4.Structural_Design_Pattern.Decorator_Design_Pattern.Restaurant;

public class CheeseDecorator extends DosaDecorator{

    public CheeseDecorator(Dosa decoratedDosa) {
        super(decoratedDosa);
    }

    @Override
    public String getDescription() {
        return decoratedDosa.getDescription() + " with Cheese";
    }

    @Override
    public double cost() {
        return decoratedDosa.cost() + 20;
    }
}
