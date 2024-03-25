package SEM_4.Structural_Design_Pattern.FlyWeight_Design_Pattern.Restaurant;
import java.util.HashMap;

public class DishFactory {
    private static final HashMap<String, Dish> dishMap = new HashMap<>();

    public static Dish getDish(String type) {
        Dish dish = dishMap.get(type);

        if (dish == null) {
            dish = new DishImpl(type);
            dishMap.put(type, dish);
            System.out.println("Creating dish of Type: " + type);
        }
        return dish;
    }
}
