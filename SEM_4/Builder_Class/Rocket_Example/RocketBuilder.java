package SEM_4.Builder_Class.Rocket_Example;

public interface RocketBuilder {
    public void setName();
    public void setCompany();
    public void setEngine();
    public void setReusability();
    public Rocket getRocket();
}