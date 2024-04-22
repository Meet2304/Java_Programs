package SEM_4.Architectural_Design_Pattern.MVC_Design_Pattern.Restaurant_Example;

public class RestaurantDemo {
    public static void main(String[] args) {
        // Initialize model, view, and controller
        RestaurantModel model = new RestaurantModel("1. Burger\n2. Pizza\n3. Salad");
        RestaurantView view = new RestaurantView();
        RestaurantController controller = new RestaurantController(model, view);

        // Display initial menu
        controller.displayMenu();

        // Update menu and display again
        controller.updateMenu("1. Spaghetti\n2. Chicken Alfredo\n3. Caesar Salad");
        controller.displayMenu();
    }
}
