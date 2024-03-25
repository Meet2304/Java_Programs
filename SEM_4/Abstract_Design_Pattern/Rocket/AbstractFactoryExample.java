package SEM_4.Abstract_Design_Pattern.Rocket;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        
        //STARSHIP ROCKET
        System.out.println("STARSHIP:");
        RocketFactory starship = new StarshipFactory();
        Engine Raptor = starship.setEngine();
        Payload Starlink = starship.setPayload();

        Raptor.DisplayEngine();
        Starlink.DisplayPayload();
        System.out.println("");

        //FALCON 9 ROCKET
        System.out.println("FALCON 9:");
        RocketFactory falcon9 = new Falcon9Factory();
        Engine merlin = falcon9.setEngine();
        Payload tesla = falcon9.setPayload();

        merlin.DisplayEngine();
        tesla.DisplayPayload();
        System.out.println("");

        //VULCAN ROCKET
        System.out.println("VULCAN:");
        RocketFactory vulcan = new VulcanFactory();
        Engine be4 = vulcan.setEngine();
        Payload perigrine = vulcan.setPayload();

        be4.DisplayEngine();
        perigrine.DisplayPayload();
        System.out.println("");

    }
}
