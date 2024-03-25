package SEM_4.RocketDesign;

public class RocketDesignFactory {
    public RocketDesign component(String comp){
        if (comp.equals("Starship"))
        {
            return new Booster();
        }
        else if(comp.equals("Raptor"))
        {
            return new Engine();
        }
        else if(comp.equals("Payload"))
        {
            return new Payload();
        }
        return null;
    }
}


