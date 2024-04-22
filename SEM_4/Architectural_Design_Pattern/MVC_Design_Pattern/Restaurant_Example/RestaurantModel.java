package SEM_4.Architectural_Design_Pattern.MVC_Design_Pattern.Restaurant_Example;

class RestaurantModel {
    private String menu;

    public RestaurantModel(String menu) {
        this.menu = menu;
    }

    public String getMenu() {
        return menu;
    }

    public void updateMenu(String newMenu) {
        this.menu = newMenu;
    }
}

