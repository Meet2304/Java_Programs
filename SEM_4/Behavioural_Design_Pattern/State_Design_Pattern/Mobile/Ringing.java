package SEM_4.Behavioural_Design_Pattern.State_Design_Pattern.Mobile;

public class Ringing implements MobileAlertState {

    @Override
    public void alert() {
        System.out.println("Mobile is Ringing");
    }
    
}
