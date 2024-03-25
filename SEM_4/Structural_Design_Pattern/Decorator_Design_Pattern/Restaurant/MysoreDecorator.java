package SEM_4.Structural_Design_Pattern.Decorator_Design_Pattern.Restaurant;

public class MysoreDecorator extends DosaDecorator{

    public MysoreDecorator(Dosa decoratedDosa) {
        super(decoratedDosa);
    }
    
    @Override
    public String getDescription() {
        return decoratedDosa.getDescription() + " with Mysore Dosa";
    }

    @Override
    public double cost() {
        return decoratedDosa.cost() + 50;
    } 
}
