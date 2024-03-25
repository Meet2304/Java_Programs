package SEM_4.Structural_Design_Pattern.Facade_Design_Pattern.Restaurant;

public interface RestaurantManager {
    void placeOrder(String item, int Quantity);
    void makeReservation(String date, int number);

}
