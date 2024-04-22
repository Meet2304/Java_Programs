package SEM_4.Architectural_Design_Pattern.MVC_Design_Pattern.Rocket_Example;

public class RocketController {
    private RocketModel model;
    private RocketView view;

    public RocketController(RocketModel model, RocketView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.displayRocketDetails(model.getName(), model.getFuelLevel());
    }

    public void launchRocket() {
        model.launch();
        view.displayLaunchMessage("Rocket launched!");
        updateView();
    }
}
