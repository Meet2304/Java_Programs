package SEM_4.Behavioural_Design_Pattern.State_Design_Pattern.Mobile;

public class MobileContext {
    private MobileAlertState currentState;
    public MobileContext()
    {
        currentState = new Ringing(); 
    }
    public void setState(MobileAlertState state)
    {
        currentState = state;
    }
    public void alert()
    {
        currentState.alert();
    }
}