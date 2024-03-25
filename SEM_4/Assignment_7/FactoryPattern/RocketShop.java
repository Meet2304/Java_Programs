package SEM_4.Assignment_7.FactoryPattern;

public class RocketShop {
    public static void main(String[] args) {
        RocketFactory factory = new SpaceXRocketFactory();
        Rocket rocket = factory.createRocket();
        rocket.ignite();

    }
}
