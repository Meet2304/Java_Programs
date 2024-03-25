package SEM_4.Assignment_7.BuilderPattern;

public interface RocketBuilder {
    void buildFuelType();
    void buildPayloadCapacity();
    void buildNumStages();
    Rocket getResult();
}