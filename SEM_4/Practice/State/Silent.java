package SEM_4.Practice.State;

public class Silent implements MobileAlertState {

    @Override
    public void Alert() {
        System.out.println("Mobile Alert State is Silent");
    }
    
}
