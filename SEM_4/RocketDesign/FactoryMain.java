package SEM_4.RocketDesign;

public class FactoryMain {
    public static void main(String[] args) {
        RocketDesignFactory R1 = new RocketDesignFactory();
        RocketDesign Rocket = R1.component("Starship");
        Rocket.specs();
    }
}
