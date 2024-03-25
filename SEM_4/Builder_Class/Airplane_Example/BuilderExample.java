package SEM_4.Builder_Class.Airplane_Example;

public class BuilderExample {
    public static void main(String[] args) {
        // Instantiate the director(hire the engineer)
        AirplaneBuilder crop = new CropDuster("Farmer Joe");
        AirplaneBuilder fighter = new FighterJet("The Navy");
        AirplaneBuilder glider = new Glider("Time Rice");
        AirplaneBuilder airliner = new Airliner("United Airlines");

        //build a cropduster
        
    }
}
