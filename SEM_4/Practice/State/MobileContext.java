package SEM_4.Practice.State;

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

    public void Alert()
    {
        currentState.Alert();
    }
}
