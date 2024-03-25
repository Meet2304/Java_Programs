package SEM_4.Assignment_7.BuilderPattern;

public class RocketDirector {
    private RocketBuilder builder;

    public RocketDirector(RocketBuilder builder) {
        this.builder = builder;
    }

    public void constructRocket() {
        builder.buildFuelType();
        builder.buildPayloadCapacity();
        builder.buildNumStages();
    }

    public Rocket getResult() {
        return builder.getResult();
    }
}

