package SEM_4.Structural_Design_Pattern.Decorator_Design_Pattern.Restaurant;


public class DecoratorPatternExample {
    public static void main(String[] args) {
        Dosa dosa = new SadaDosa();
        System.out.println("Cost: " + dosa.cost() + ", Description: " + dosa.getDescription());

        Dosa garlicDosa = new GarlicDecorator(dosa);
        System.out.println("Cost: " + garlicDosa.cost() + ", Description: " + garlicDosa.getDescription());

        Dosa CheeseDosa = new CheeseDecorator(dosa);
        System.out.println("Cost: " + CheeseDosa.cost() + ", Description: " + CheeseDosa.getDescription());

        Dosa CheeseGarlicDosa = new CheeseDecorator(garlicDosa);
        System.out.println("Cost: " + CheeseGarlicDosa.cost() + ", Description: " + CheeseGarlicDosa.getDescription());

        Dosa MysoreDosa = new MysoreDecorator(dosa);
        System.out.println("Cost: " + MysoreDosa.cost() + ", Description: " + MysoreDosa.getDescription());
    }
}
