package SEM_4.Structural_Design_Pattern.Decorator_Design_Pattern.Restaurant;

abstract class DosaDecorator implements Dosa {

    protected Dosa decoratedDosa;

    public DosaDecorator(Dosa decoratedDosa)
    {
        this.decoratedDosa = decoratedDosa;
    }

    @Override
    public String getDescription() {
        return decoratedDosa.getDescription();
    }

    @Override
    public double cost() {
        return decoratedDosa.cost();
    }
    
}
