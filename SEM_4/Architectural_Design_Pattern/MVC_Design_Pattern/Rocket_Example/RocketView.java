package SEM_4.Architectural_Design_Pattern.MVC_Design_Pattern.Rocket_Example;

public class RocketView {
    public void displayRocketDetails(String name, int fuelLevel) {
        System.out.println("Rocket: " + name);
        System.out.println("Fuel Level: " + fuelLevel);
    }

    public void displayLaunchMessage(String message) {
        System.out.println(message);
    }
}

