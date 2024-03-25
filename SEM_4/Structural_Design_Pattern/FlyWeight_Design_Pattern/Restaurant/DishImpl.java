package SEM_4.Structural_Design_Pattern.FlyWeight_Design_Pattern.Restaurant;

public class DishImpl implements Dish {
    private String type;  

    public DishImpl(String type) {
        this.type = type;
    }

    @Override
    public void serve() {
        System.out.println("Dish: Serve() [Type: " + type + "]");
    }
}