package SEM_4.Assignment_7.BuilderPattern;

public class Rocket {
    private String fuelType;
    private int payloadCapacity;
    private int numStages;

    // Constructor
    public Rocket(String fuelType, int payloadCapacity, int numStages) {
        this.fuelType = fuelType;
        this.payloadCapacity = payloadCapacity;
        this.numStages = numStages;
    }

    // Getters
    public String getFuelType() {
        return fuelType;
    }

    public int getPayloadCapacity() {
        return payloadCapacity;
    }

    public int getNumStages() {
        return numStages;
    }

    // Other rocket-related methods...
}