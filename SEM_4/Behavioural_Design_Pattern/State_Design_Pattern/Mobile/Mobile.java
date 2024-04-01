package SEM_4.Behavioural_Design_Pattern.State_Design_Pattern.Mobile;

public class Mobile {
    public static void main(String[] args) {
        MobileContext mc = new MobileContext();
        mc.alert();
        mc.setState(new Silent());
        mc.alert();
        System.out.println("Set to Ringing Again");
        mc.setState(new Ringing());
        mc.alert();
    }
}
