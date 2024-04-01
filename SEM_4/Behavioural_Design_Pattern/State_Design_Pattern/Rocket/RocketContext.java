package SEM_4.Behavioural_Design_Pattern.State_Design_Pattern.Rocket;

public class RocketContext {
    private RocketAlertState currentState;
    public RocketContext()
    {
        currentState = new ReadytoTest(); 
    }
    public void setState(RocketAlertState state)
    {
        currentState = state;
    }
    public void alert()
    {
        currentState.alert();
    }
}