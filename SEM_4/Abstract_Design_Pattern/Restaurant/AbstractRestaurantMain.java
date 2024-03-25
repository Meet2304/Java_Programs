package SEM_4.Abstract_Design_Pattern.Restaurant;

public class AbstractRestaurantMain {
    public static void main(String[] args) {
        // STARBUCKS FACTORY
        System.out.println("STARBUCKS:");
        RestaurantFactory starbucks1 = new StarbucksFactory();
        Type starbucks_type = starbucks1.RestaurantType();
        Cusine starbucks_cusine = starbucks1.RestaurantCusine();
        
        starbucks_type.displayType();
        starbucks_cusine.displayCusine();
        System.out.println("");

        // BIG MOUTH CO FACTORY
        System.out.println("BIG MOUTH CO:");
        RestaurantFactory bigmouth1 = new BigMouthCoFactory();
        Type bigmouth_type = bigmouth1.RestaurantType();
        Cusine bigmouth_cusine = bigmouth1.RestaurantCusine();
        
        bigmouth_type.displayType();
        bigmouth_cusine.displayCusine();
        System.out.println("");

        // STARBUCKS FACTORY
        System.out.println("SKYDINE:");
        RestaurantFactory skydine1 = new SkyDineFactory();
        Type skydine_type = skydine1.RestaurantType();
        Cusine skydine_cusine = skydine1.RestaurantCusine();
        
        skydine_type.displayType();
        skydine_cusine.displayCusine();
        System.out.println("");
    }
}
