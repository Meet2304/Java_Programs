package SEM_4.Builder_Class.Rocket_Example;

public class SpaceXRocket implements RocketBuilder{
    
    private Rocket R;
    
    public SpaceXRocket()
    {
        this.R = new Rocket();
    }

    @Override
    public void setName() {
        R.setName("Starship");
    }

    @Override
    public void setCompany() {
        R.setCompany("SpaceX");
    }

    @Override
    public void setEngine() {
        R.setEngine("Raptor");
    }

    @Override
    public void setReusability() {
        R.setReusability(true);
    }

    @Override
    public Rocket getRocket() {
        Rocket newRocket = this.R;
        this.R = new Rocket();
        return newRocket;
    }    
}
