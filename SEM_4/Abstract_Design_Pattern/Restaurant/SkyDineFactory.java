package SEM_4.Abstract_Design_Pattern.Restaurant;

public class SkyDineFactory implements RestaurantFactory{
    @Override
    public Type RestaurantType() {
        return new OpentoSky();
    }

    @Override
    public Cusine RestaurantCusine() {
        return new Indian();
    }
}
