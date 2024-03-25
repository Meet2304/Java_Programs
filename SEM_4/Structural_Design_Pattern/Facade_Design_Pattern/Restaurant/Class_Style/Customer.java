package SEM_4.Structural_Design_Pattern.Facade_Design_Pattern.Restaurant.Class_Style;

public class Customer {
    public static void main(String[] args) {
        System.out.println("---------------------FACADE-----------------------");
        System.out.println(RestaurantFront.deliverFood(RestaurantManager.Kitchen));
        System.out.println(RestaurantFront.deliverFood(RestaurantManager.Menu));
    }
}
