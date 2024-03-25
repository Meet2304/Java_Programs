package SEM_4.Abstract_Design_Pattern.Rocket;

public class StarshipFactory implements RocketFactory {
    @Override
    public Engine setEngine() {
        return new Raptor();
    }

    @Override
    public Payload setPayload() {
        return new Starlink();
    }
}
