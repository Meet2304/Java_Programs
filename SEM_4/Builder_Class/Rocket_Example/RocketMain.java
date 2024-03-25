package SEM_4.Builder_Class.Rocket_Example;

public class RocketMain {
    private RocketBuilder RBuild;

    public RocketMain(RocketBuilder r)
    {
        this.RBuild = r;
    }

    public void BuildRocket()
    {
        RBuild.setCompany();
        RBuild.setEngine();
        RBuild.setName();
        RBuild.setReusability();
    }
}
