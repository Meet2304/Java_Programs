package SEM_4.Structural_Design_Pattern.Decorator_Design_Pattern.Restaurant;

public class GarlicDecorator extends DosaDecorator {

    public GarlicDecorator(Dosa decoratedDosa) {
        super(decoratedDosa);
    }

    @Override
    public String getDescription() {
        return decoratedDosa.getDescription() + " with Garlic";
    }

    @Override
    public double cost() {
        return decoratedDosa.cost() + 30;
    }  
}
