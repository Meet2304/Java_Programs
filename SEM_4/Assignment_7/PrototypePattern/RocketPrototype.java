package SEM_4.Assignment_7.PrototypePattern;

public class RocketPrototype {
    public static void main(String[] args) {
        Rocket prototype = new Falcon9Rocket();
        Rocket clonedRocket = prototype.clone();
        clonedRocket.ignite();
    }
}
