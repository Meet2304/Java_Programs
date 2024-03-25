package SEM_4.Abstract_Design_Pattern.Rocket;

public class VulcanFactory implements RocketFactory {
    @Override
    public Engine setEngine() {
        return new BE4();
    }

    @Override
    public Payload setPayload() {
        return new Perigrine();
    }
}
