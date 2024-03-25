package SEM_4.Abstract_Design_Pattern.Rocket;

public class Falcon9Factory implements RocketFactory {

    @Override
    public Engine setEngine() {
        return new Merlin();
    }

    @Override
    public Payload setPayload() {
        return new Tesla();
    }

}
