package SEM_4.Practice.State;

public class Ringing implements MobileAlertState {

    @Override
    public void Alert() {
        System.out.println("Mobile State is Ringing");
    }
    
}
