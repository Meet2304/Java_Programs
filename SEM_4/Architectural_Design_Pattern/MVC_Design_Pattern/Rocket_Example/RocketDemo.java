package SEM_4.Architectural_Design_Pattern.MVC_Design_Pattern.Rocket_Example;

public class RocketDemo {
    public static void main(String[] args) {
        // Create model, view, and controller
        RocketModel model = new RocketModel("Falcon 9");
        RocketView view = new RocketView();
        RocketController controller = new RocketController(model, view);

        // Display initial rocket details
        //controller.updateView();

        // Launch the rocket
        controller.launchRocket();
    }
}
