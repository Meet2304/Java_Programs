package SEM_4.Practice.Decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Coffee Coffee = new SimpleCoffee();
        System.out.println("Cost: " + Coffee.getCost() + " Description: " + Coffee.getDescription());

        Coffee milkCoffee = new MilkDecorator(Coffee);
        System.out.println("Cost: " + milkCoffee.getCost() + " Description: " + milkCoffee.getDescription());

    }
}
