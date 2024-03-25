package SEM_4.Structural_Design_Pattern.Facade_Design_Pattern.Restaurant.Class_Style;

public class Kitchen implements Restaurant {

    public String finalKitchen;

    @Override
    public void orderFood(String ItemsRequired) {
        finalKitchen = "Kitchen Components: " + ItemsRequired ;
    }

    @Override
    public String deliverFood() {
        return finalKitchen;
    }
    
}
