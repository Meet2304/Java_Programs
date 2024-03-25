package SEM_4.Builder_Class.Rocket_Example;

public class NASARocket implements RocketBuilder{
    
    private Rocket R;
    
    public NASARocket()
    {
        this.R = new Rocket();
    }

    @Override
    public void setName() {
        R.setName("Orion");
    }

    @Override
    public void setCompany() {
        R.setCompany("NASA");
    }

    @Override
    public void setEngine() {
        R.setEngine("AJ10");
    }

    @Override
    public void setReusability() {
        R.setReusability(false);
    }

    @Override
    public Rocket getRocket() {
        Rocket newRocket = this.R;
        this.R = new Rocket();
        return newRocket;
    }
}
