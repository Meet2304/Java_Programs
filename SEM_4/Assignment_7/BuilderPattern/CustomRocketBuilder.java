package SEM_4.Assignment_7.BuilderPattern;

public class CustomRocketBuilder implements RocketBuilder {
    private String fuelType;
    private int payloadCapacity;
    private int numStages;

    @Override
    public void buildFuelType() {
        // Logic to set the fuel type
        this.fuelType = "Liquid Oxygen";
    }

    @Override
    public void buildPayloadCapacity() {
        // Logic to set the payload capacity
        this.payloadCapacity = 5000;  // in kilograms
    }

    @Override
    public void buildNumStages() {
        // Logic to set the number of stages
        this.numStages = 2;
    }

    @Override
    public Rocket getResult() {
        // Return the constructed rocket
        return new Rocket(fuelType, payloadCapacity, numStages);
    }
}   
