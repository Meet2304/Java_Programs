package SEM_4.Architectural_Design_Pattern.MVC_Design_Pattern.Restaurant_Example;

class RestaurantController {
    private RestaurantModel model;
    private RestaurantView view;

    public RestaurantController(RestaurantModel model, RestaurantView view) {
        this.model = model;
        this.view = view;
    }

    public void updateMenu(String newMenu) {
        model.updateMenu(newMenu);
    }

    public void displayMenu() {
        view.displayMenu(model.getMenu());
    }
}
