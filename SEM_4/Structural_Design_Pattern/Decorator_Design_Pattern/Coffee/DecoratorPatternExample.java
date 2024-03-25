package SEM_4.Structural_Design_Pattern.Decorator_Design_Pattern.Coffee;

public class DecoratorPatternExample {
    public static void main(String[] args) {
        //create a simple coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost: " + coffee.cost() + ", Description: " + coffee.getDescription());

        //Decorate the simple Coffee with milk
        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println("Cost: " + milkCoffee.cost() + ", Description: " + milkCoffee.getDescription());

        //Decorate the milk Coffee with Sugar
        Coffee sweetCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Cost: " + sweetCoffee.cost() + ", Description: " + sweetCoffee.getDescription());

    }
}
