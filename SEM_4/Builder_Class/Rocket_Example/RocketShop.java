package SEM_4.Builder_Class.Rocket_Example;

public class RocketShop 
{
    public static void main(String[] args) 
    {
        RocketBuilder Rbuild;
        RocketMain RMain;
        Rocket R1;

        Rbuild = new SpaceXRocket();
        RMain = new RocketMain(Rbuild);
        RMain.BuildRocket();
        R1 = Rbuild.getRocket();
        R1.RocketDetails();
    }
}
