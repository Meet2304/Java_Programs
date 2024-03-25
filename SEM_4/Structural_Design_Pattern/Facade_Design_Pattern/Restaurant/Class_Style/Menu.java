package SEM_4.Structural_Design_Pattern.Facade_Design_Pattern.Restaurant.Class_Style;

public class Menu implements Restaurant {
    public String finalMenu;

    @Override
    public void orderFood(String ItemsRequired) {
        finalMenu = "Menu Components: " + ItemsRequired ;
    }

    @Override
    public String deliverFood() {
        return finalMenu;
    }
}
