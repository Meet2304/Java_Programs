package SEM_4.Structural_Design_Pattern.Adapter_Design_Pattern.Rockets;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        Rocket rocket = new Rocket();

        rocket.run("Kerosene", "Falcon 9 with Kersene as Fuel");
        rocket.run("Methane", "Starship");
        rocket.run("Hydrogen", "Falcon 9");
        rocket.run("Oxygen", "Orion");
    }
}