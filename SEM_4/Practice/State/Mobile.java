package SEM_4.Practice.State;

public class Mobile {
    public static void main(String[] args) {
        MobileContext MC = new MobileContext();
        MC.setState(new Ringing());
        MC.Alert();
        MC.setState(new Silent());
        MC.Alert();
    }
}
