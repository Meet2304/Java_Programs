package SEM_4.Structural_Design_Pattern.Composite_Design_Pattern.Restaurant;

public class CompositeTest {
    public static void main(String[] args) {
        Component SousChef = new Leaf(5000, "Sous Chef");
        Component MeatChef = new Leaf(8000, "Meat Chef");
        Component baker = new Leaf(5000, "Baker");
        Component Waiter1 = new Leaf(3000, "Waiter 1");
        Component Waiter2 = new Leaf(3000, "Waiter 2"); 
        Component Manager = new Leaf(10000, "Manager");
        Component HeadChef = new Leaf(10000, "Head Chef");

        Composite Chefs = new Composite("Chefs");
        Composite Employees = new Composite("Employees");
        Composite Restaurant = new Composite("Restaurant");

        Chefs.addComponent(SousChef);
        Chefs.addComponent(MeatChef);
        Chefs.addComponent(baker);
        Chefs.addComponent(HeadChef);

        Employees.addComponent(Manager);
        Employees.addComponent(Waiter1);
        Employees.addComponent(Waiter2);

        Restaurant.addComponent(Chefs);
        Restaurant.addComponent(Employees);

        Restaurant.showPrice();        
    }
}
