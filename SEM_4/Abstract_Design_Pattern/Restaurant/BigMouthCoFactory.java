package SEM_4.Abstract_Design_Pattern.Restaurant;

public class BigMouthCoFactory implements RestaurantFactory{
    @Override
    public Type RestaurantType() {
        return new Popup();
    }

    @Override
    public Cusine RestaurantCusine() {
        return new Mexican();
    }
}
