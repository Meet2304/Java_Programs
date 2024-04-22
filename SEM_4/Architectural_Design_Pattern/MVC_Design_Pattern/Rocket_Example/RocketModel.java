package SEM_4.Architectural_Design_Pattern.MVC_Design_Pattern.Rocket_Example;

public class RocketModel {
    private String name;
    private int fuelLevel;

    public RocketModel(String name) {
        this.name = name;
        this.fuelLevel = 100; // Starting fuel level
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    // Method to simulate rocket launching
    public void launch() {
        if (fuelLevel >= 50) {
            System.out.println(name + " is launching!");
            fuelLevel -= 50;
            System.out.println("Fuel level remaining: " + fuelLevel);
        } else {
            System.out.println("Not enough fuel to launch " + name);
        }
    }
}
