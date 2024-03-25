package SEM_4.Assignment_7.BuilderPattern;

public class RocketClient {
    public static void main(String[] args) {
        // Create a CustomRocketBuilder
        RocketBuilder customRocketBuilder = new CustomRocketBuilder();

        // Create a RocketDirector with the CustomRocketBuilder
        RocketDirector rocketDirector = new RocketDirector(customRocketBuilder);

        // Construct a rocket using the director
        rocketDirector.constructRocket();

        // Get the result (constructed rocket) from the builder
        Rocket customRocket = rocketDirector.getResult();

        // Display information about the constructed rocket
        System.out.println("Custom Rocket Details:");
        System.out.println("Fuel Type: " + customRocket.getFuelType());
        System.out.println("Payload Capacity: " + customRocket.getPayloadCapacity() + " kg");
        System.out.println("Number of Stages: " + customRocket.getNumStages());
    }
}
