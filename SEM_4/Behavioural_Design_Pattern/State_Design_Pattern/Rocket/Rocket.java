package SEM_4.Behavioural_Design_Pattern.State_Design_Pattern.Rocket;

public class Rocket {
    public static void main(String[] args) {
        RocketContext mc = new RocketContext();
        mc.alert();
        mc.setState(new Testing());
        mc.alert();
        mc.setState(new Tested());
        mc.alert();
        //System.out.println("Rocket is Tested");
        mc.setState(new ReadytoLaunch());
        mc.alert();
        mc.setState(new Launching());
        mc.alert();
        mc.setState(new Launched());
        mc.alert();
    }
}
