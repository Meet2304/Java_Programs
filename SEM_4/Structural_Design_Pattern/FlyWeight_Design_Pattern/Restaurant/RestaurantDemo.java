package SEM_4.Structural_Design_Pattern.FlyWeight_Design_Pattern.Restaurant;

public class RestaurantDemo {
    private static final String dishTypes[] = {"Pasta", "Pizza", "Salad", "Soup", "Burger"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            Dish dish = DishFactory.getDish(getRandomDishType());
            dish.serve();
        }
    }

    private static String getRandomDishType() {
        return dishTypes[(int) (Math.random() * dishTypes.length)];
    }

}
