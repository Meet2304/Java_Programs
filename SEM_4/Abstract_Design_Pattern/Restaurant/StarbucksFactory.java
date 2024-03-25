package SEM_4.Abstract_Design_Pattern.Restaurant;

public class StarbucksFactory implements RestaurantFactory {

    @Override
    public Type RestaurantType() {
        return new Cafe();
    }

    @Override
    public Cusine RestaurantCusine() {
        return new Italian();
    }
    
}
