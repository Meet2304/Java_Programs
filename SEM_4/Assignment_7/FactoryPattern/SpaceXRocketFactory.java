package SEM_4.Assignment_7.FactoryPattern;

class SpaceXRocketFactory implements RocketFactory {
    public Rocket createRocket() {
        return new SpaceXRocket();
    }
}
