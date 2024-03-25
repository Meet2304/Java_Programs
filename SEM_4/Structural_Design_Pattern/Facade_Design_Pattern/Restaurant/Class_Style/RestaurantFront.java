package SEM_4.Structural_Design_Pattern.Facade_Design_Pattern.Restaurant.Class_Style;

public class RestaurantFront {
    public static String deliverFood(RestaurantManager resMan)
    {
        Components comp = new Components();

        switch(resMan)
        {
            case Kitchen:
                Restaurant kitchen = new Kitchen(); 
                String kitchenComp = comp.getKitchenComponents();
                kitchen.orderFood(kitchenComp);
                return kitchen.deliverFood();
            
            case Menu:
                Restaurant menu = new Menu(); 
                String menuComp = comp.getMenuComponents();
                menu.orderFood(menuComp);
                return menu.deliverFood();
            
        }
        return null;
    }
}
