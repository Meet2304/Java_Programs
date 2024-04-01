package SEM_4.Behavioural_Design_Pattern.State_Design_Pattern.Rocket;

public class Launching implements RocketAlertState {

    @Override
    public void alert() {
        System.out.println("Rocket is Launching");;
    }
}
